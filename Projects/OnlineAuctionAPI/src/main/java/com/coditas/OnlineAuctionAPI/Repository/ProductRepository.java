package com.coditas.OnlineAuctionAPI.Repository;

import com.coditas.OnlineAuctionAPI.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Integer> {


}
