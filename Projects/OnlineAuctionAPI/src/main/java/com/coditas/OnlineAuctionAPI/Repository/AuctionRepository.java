package com.coditas.OnlineAuctionAPI.Repository;

import com.coditas.OnlineAuctionAPI.Entity.Auction;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuctionRepository extends JpaRepository<Auction,Integer> {
}
