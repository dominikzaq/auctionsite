package com.pkprojekt.auctionsite.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * Created by domin on 8/2/17.
 */
@Controller
public class DefaultController {
    @GetMapping("/")
    public String index() {
        return "index";
    }
}
