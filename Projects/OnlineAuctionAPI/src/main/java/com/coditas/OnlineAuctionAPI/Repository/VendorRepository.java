package com.coditas.OnlineAuctionAPI.Repository;

import com.coditas.OnlineAuctionAPI.Entity.Vendor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VendorRepository extends JpaRepository<Vendor,Integer> {
}
