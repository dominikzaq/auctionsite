package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.User;
import com.pkprojekt.auctionsite.login.Login;
import com.pkprojekt.auctionsite.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import javax.servlet.http.HttpSession;

/**
 * Created by domin on 8/4/17.
 */
@Controller
public class LoginController {

    @Autowired
    private UserService userService;

    @GetMapping({"/login"})
    public String login(Model model) {
        model.addAttribute("login", new Login());
        return "login";
    }


    @PostMapping("/login")
    public String loginSubmit(@ModelAttribute Login login, Model model, HttpSession session) {
        if(login.checkAdmin()) {
            return "/admin/homeAdmin";
        }

        User u = userService.getByEmailAndPassword(login.getEmail(), login.getPassword());
        session.setAttribute("user1", u);
        return u == null? "index" : "user/homeUser";
    }
}
