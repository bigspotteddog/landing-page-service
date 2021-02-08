package com.fullstackclouddeveloper.landingpageservice;

import java.io.IOException;
import java.util.Map;
import java.util.concurrent.ExecutionException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.google.api.core.ApiFuture;
import com.google.auth.oauth2.GoogleCredentials;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.FirestoreOptions;
import com.google.cloud.firestore.WriteResult;
import com.sendgrid.Method;
import com.sendgrid.Request;
import com.sendgrid.Response;
import com.sendgrid.SendGrid;
import com.sendgrid.helpers.mail.Mail;
import com.sendgrid.helpers.mail.objects.Content;
import com.sendgrid.helpers.mail.objects.Email;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController   ;

@SpringBootApplication
@RestController
public class LandingPageServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(LandingPageServiceApplication.class, args);
    }

    @GetMapping("/hello")
    public String hello() {
        return "Hello world!";
    }

    @PostMapping("/notify-me")
    public String notifyMe(@RequestBody Map<String, String> body)
            throws IOException, InterruptedException, ExecutionException {
        return storeAndSend(body);
    }

    @PostMapping("/sign-up")
    public String signUp(@RequestBody Map<String, String> body)
            throws IOException, InterruptedException, ExecutionException {
        return storeAndSend(body);
    }

    private String storeAndSend(Map<String, String> body)
            throws IOException, InterruptedException, ExecutionException, JsonProcessingException {
        Firestore db = getFirestore();
        String email = body.get("email");
        DocumentReference document = db.collection("emails").document(email);
        ApiFuture<WriteResult> data = document.set(body);
        System.out.println(data.get().getUpdateTime()); 

        sendEmail(email);

        return new ObjectMapper().writeValueAsString(body);
    }

    private void sendEmail(String email) throws IOException {
        Email from = new Email("registration@fullstackclouddeveloper.com", "Fullstack Cloud Developer");
        String subject = "Fullstack cloud developer course registration";
        Email to = new Email(email);
        Content content = new Content("text/plain", "You've been added to the list! We'll notify you when registration begins.");
        Mail mail = new Mail(from, subject, to, content);
    
        SendGrid sg = new SendGrid(System.getenv("SENDGRID_API_KEY"));
        Request request = new Request();
        try {
          request.setMethod(Method.POST);
          request.setEndpoint("mail/send");
          request.setBody(mail.build());
          Response response = sg.api(request);
          System.out.println(response.getStatusCode());
          System.out.println(response.getBody());
          System.out.println(response.getHeaders());
        } catch (IOException ex) {
          throw ex;
        }
    }

    private Firestore getFirestore() throws IOException {
        FirestoreOptions firestoreOptions =
            FirestoreOptions.getDefaultInstance().toBuilder()
                .setProjectId("email-capture-service-3")
                .setCredentials(GoogleCredentials.getApplicationDefault())
                .build();
        return firestoreOptions.getService();
    }
}
