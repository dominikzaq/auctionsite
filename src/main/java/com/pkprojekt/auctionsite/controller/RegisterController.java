package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.User;
import com.pkprojekt.auctionsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by domin on 8/6/17.
 */
@Controller
public class RegisterController {

    @Autowired
    UserService userService;

    @GetMapping("/registration")
    public String registration(Model model) {
        model.addAttribute("user", new User());
        return "registration";
    }

    @PostMapping("/registration")
    public String creatingSubmit(@ModelAttribute User user) {
        userService.createUser(user);
        return "index";
    }
}
