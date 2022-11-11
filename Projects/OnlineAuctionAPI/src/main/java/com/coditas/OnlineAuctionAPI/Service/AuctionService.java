package com.coditas.OnlineAuctionAPI.Service;

import com.coditas.OnlineAuctionAPI.Entity.Auction;
import com.coditas.OnlineAuctionAPI.Model.dto.Auctiondto;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
public interface AuctionService {
    public Auction addAuctionDetails(Auctiondto auctiondto);
}
