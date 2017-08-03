package com.pkprojekt.auctionsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by domin on 8/2/17.
 */
@Controller
public class DefaultController {
    @GetMapping("/index")
    public String index() {
        return "index";
    }
    @GetMapping("/profile")
    public String profile() {
        return "profile";
    }
    @GetMapping("/auctions")
    public String auction() {
        return "auctions";
    }
    @GetMapping("/newAuctions")
    public String newAuctions() {
        return "newAuctions";
    }

    @GetMapping("/myAuctions")
    public String myAuctions() {
        return "myAuctions";
    }

    @GetMapping("/auctionsAfterLogged")
    public String auctionsAfterLogged() {
        return "auctionsAfterLogged";
    }
}
