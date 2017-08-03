package com.pkprojekt.auctionsite.login;

/**
 * Created by domin on 8/3/17.
 */
public class UserLogin {
    public String checkUser(String email, String password) {
        return email.equals("d") && password.equals("d")?"user" : email.equals("a") && password.equals("a")? "admin": null;
    }

}
