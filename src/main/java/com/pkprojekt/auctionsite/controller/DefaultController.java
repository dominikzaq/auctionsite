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

    @GetMapping("/myAuctions")
    public String myAuctions() {
        return "user/myAuctions";
    }

    @GetMapping("/auctionsAfterLogged")
    public String auctionsAfterLogged() {
        return "user/auctionsAfterLogged";
    }

    @GetMapping("/homeAdmin")
    public String homeAdmin() {
        return "admin/homeAdmin";
    }

    @GetMapping("/homeUser")
    public String homeUser() {
        return "user/homeUser";
    }

    @GetMapping({"/","/index"})
    public String index() {
        return "index";
    }

}
