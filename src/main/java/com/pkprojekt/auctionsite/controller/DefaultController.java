package com.pkprojekt.auctionsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by domin on 8/2/17.
 */
@Controller
public class DefaultController {
    @GetMapping("/profile")
    public String profile() {
        return "user/profile";
    }
    @GetMapping("/auctions")
    public String auction() {
        return "auctions";
    }
    @GetMapping("/newAuctions")
    public String newAuctions() {
        return "admin/newAuctions";
    }

    @GetMapping("/myAuctions")
    public String myAuctions() {
        return "admin/myAuctions";
    }

    @GetMapping("/auctionsAfterLogged")
    public String auctionsAfterLogged() {
        return "admin/auctionsAfterLogged";
    }

    @GetMapping("/home")
    public String home() {
        return "admin/home";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

}
