package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.User;
import com.pkprojekt.auctionsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by domin on 8/6/17.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;


    public void deleteUserByEmail(String email) {

    }

    public void lockUserByEmail(String email) {
    }

    public void unlockUserByEmail(String email) {
    }

}
