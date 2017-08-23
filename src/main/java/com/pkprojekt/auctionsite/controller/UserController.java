package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.User;
import com.pkprojekt.auctionsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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

    public void unlockUserByEmail(int id) {
        unlockUserByEmail(id);
    }


    @GetMapping("/searchUser")
    public String getAllUsers(Model model) {
        List<User> users = userService.getAllusers();
        model.addAttribute("users", users);
        return "/admin/searchUser";
    }

    @RequestMapping(value = "/deleteUser/{userId}", method = RequestMethod.GET)
    public String handleDeleteUser(@PathVariable("userId") Integer userId) {
        userService.deleteUserById(Integer.valueOf(userId));
        return "redirect:/searchUser";
    }

    @RequestMapping(value = "/makeLockOrUnlock/{userId}/{isLock}", method = RequestMethod.GET)
    public String handleLockOrUnlock(@PathVariable Integer userId, @PathVariable Boolean isLock) {
        if(isLock) {
            userService.lockOrUnlockUserById(userId, false);
        } else {
            userService.lockOrUnlockUserById(userId, true);
        }

        return "redirect:/searchUser";
    }
}
