package com.fullstackclouddeveloper.landingpageservice;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.DocumentReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Firestore;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

@Component
public class CustomAuthenticationProvider implements AuthenticationProvider {
    @Autowired
    private FirestoreService firestoreService;

    @Override
    public Authentication authenticate(final Authentication authentication) throws AuthenticationException {
        final String name = authentication.getName();
        if (StringUtils.isEmpty(name)) {
            return null;
        }

        final String password = authentication.getCredentials().toString();
        if (StringUtils.isEmpty(password)) {
            return null;
        }

        try {
            Firestore db = firestoreService.getFirestore();
            DocumentReference doc = db.collection("emails").document(name);
            ApiFuture<DocumentSnapshot> future = doc.get();
            DocumentSnapshot documentSnapshot = future.get();
            if (!documentSnapshot.exists()) {
                return null;
            }

            String email = documentSnapshot.getString("email");
            String encryptedPassword = documentSnapshot.getString("password");

            if (name.equals(email) && new BCryptPasswordEncoder().matches(password, encryptedPassword)) {
                List<GrantedAuthority> grantedAuths = new ArrayList<>();
                grantedAuths.add(new SimpleGrantedAuthority("ROLE_USER"));
                UserDetails principal = new User(name, password, grantedAuths);
                return new UsernamePasswordAuthenticationToken(principal, password, grantedAuths);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        return null;
    }

    @Override
    public boolean supports(final Class<?> authentication) {
        return authentication.equals(UsernamePasswordAuthenticationToken.class);
    }
}