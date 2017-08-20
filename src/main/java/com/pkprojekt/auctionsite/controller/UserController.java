package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.User;
import com.pkprojekt.auctionsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by domin on 8/6/17.
 */

@Controller
public class UserController {

    @Autowired
    UserService userService;


    public void deleteUserByEmail(int id) {
        userService.deleteUserById(id);
    }

    public void lockUserByEmail(int id) {
        userService.lockUserById(id);
    }

    public void unlockUserByEmail(int id) {
        unlockUserByEmail(id);
    }


    @GetMapping("/searchUser")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllusers();
        model.addAttribute("users", users);
        return "/admin/searchUser";
    }

}
