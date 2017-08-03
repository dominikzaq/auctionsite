package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.Auction;
import com.pkprojekt.auctionsite.service.AuctionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by domin on 8/3/17.
 */
@Controller
public class AuctionController {

    @Autowired
    private AuctionService auctionService;

    private Auction auction;

    @RequestMapping
    public void saveAuction() {
        auction = new Auction();
        auctionService.saveAuction(auction);
    }
}
