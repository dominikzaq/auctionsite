package com.pkprojekt.auctionsite.login;

import org.springframework.stereotype.Component;

/**
 * Created by domin on 8/3/17.
 */
@Component
public class Login {
    private String email;
    private String password;


    public boolean checkAdmin() {
        return email.equals("admin@wp.pl") && password.equals("admin");
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
