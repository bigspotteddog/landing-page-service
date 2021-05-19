# How to send an email to a user

In this lesson, we will learn how to set up an email service provider account on Google App Engine using SendGrid. Next, we will create an email in Java using the SendGrid Java API. Then, we will set up authentication for our domain to have the emails sent from our domain instead of SendGrid's.

The video will walk you through the process step-by-step.

## Set up an email service provider on Google App Engine

1. Set up an email service provider

    Follow along with the video to set up a free SendGrid subscription.

    1. Open your web browser to https://cloud.google.com/appengine/docs/standard/java11/sending-messages

    1. Scroll down to `SendGrid` and click on `SendGrid Email API Plan` link: https://console.cloud.google.com/launcher/details/sendgrid-app/sendgrid-email

    1. Choose the `Free` plan

    1. Fill in the required information and subscribew

1. Send a `Thank you` email to the email address received

    Follow along with the video to find an example of the code we will use to send emails.

    1. Find an example of using the SendGrid Java API

        1. Open your browser to https://sendgrid.com/docs/for-developers/sending-email/v3-java-code-example

        1. Find a good example to use

    1. Send an email

        1. Add a call to the `/notify-me` handler to call a soon to be created `sendEmail(email)` function

        1. Create a `sendEmail` function in our Java application class

        1. Paste and modify the SendGrid Java example we found into the `sendEmail` function

            The resulting `sendEmail` function will look like this:

            ```text
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
                sg.api(request);
                } catch (IOException ex) {
                throw ex;
                }
            }
            ```

        1. Send a new email address to the server from our landing page and check your email

    1. Authenticate you domain with `SendGrid` to remove their `sent via SendGrid` marketing

        If you have your own domain name, you can authenticate it with `SendGrid` to remove their marketing message on the free account.

        Follow along with the video for step-by-step instructions for how to do this.
