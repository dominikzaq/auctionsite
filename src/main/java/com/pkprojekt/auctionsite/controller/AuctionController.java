package com.pkprojekt.auctionsite.controller;

import com.pkprojekt.auctionsite.domain.Auction;
import com.pkprojekt.auctionsite.service.impl.AuctionServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

/**
 * Created by domin on 8/3/17.
 */
@Controller
public class AuctionController {

    @Autowired
    private AuctionServiceImpl auctionService;

    @Autowired
    private Auction auction;


    public void auctions() {

    }

    /*
    @RequestMapping
    public void saveAuction() {
        auction = new Auction();
        auctionService.saveAuction(auction);
    }*/

}
