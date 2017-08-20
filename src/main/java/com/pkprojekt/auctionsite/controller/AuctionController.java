package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.Auction;
import com.pkprojekt.auctionsite.domain.User;
import com.pkprojekt.auctionsite.service.AuctionService;
import com.pkprojekt.auctionsite.service.impl.AuctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

/**
 * Created by domin on 8/3/17.
 */
@Controller
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    @GetMapping("/newAuctions")
    public String createAuction(Model model) {
        model.addAttribute("auction", new Auction());
        return "user/newAuctions";
    }

    @PostMapping("/newAuctions")
    public String auctionSubmit(@ModelAttribute Auction auction) {
        auctionService.saveAuction(auction);
        return "user/newAuctions";
    }

}
