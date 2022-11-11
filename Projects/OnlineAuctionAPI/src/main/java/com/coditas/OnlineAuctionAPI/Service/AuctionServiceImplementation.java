package com.coditas.OnlineAuctionAPI.Service;

import com.coditas.OnlineAuctionAPI.Entity.Auction;
import com.coditas.OnlineAuctionAPI.Entity.Customer;
import com.coditas.OnlineAuctionAPI.Entity.Product;
import com.coditas.OnlineAuctionAPI.Model.dto.Auctiondto;
import com.coditas.OnlineAuctionAPI.Repository.AuctionRepository;
import com.coditas.OnlineAuctionAPI.Repository.CustomerRepository;
import com.coditas.OnlineAuctionAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Service;

@Service
public class AuctionServiceImplementation implements AuctionService{
    @Autowired
    CustomerRepository customerRepository;
    @Autowired
    ProductRepository productRepository;
    @Autowired
    AuctionRepository auctionRepository;
   @Autowired
      Auctiondto auctiondto;

   @Autowired
     Auction auction;

   @Autowired
    Customer customer;

   @Autowired
    Product product;

    @Override

    public Auction addAuctionDetails(Auctiondto auctiondto) {
        customer=customerRepository.findById(auctiondto.getCustomerId()).orElse(null);
        product=productRepository.findById(auctiondto.getProductId()).orElse(null);
          auction.setCustomer(customer);
          auction.setProduct(product);
          auction.setAuctionStatus("BIDDED");
          auction.setAuctionPrice(auction.getAuctionPrice());

           return auctionRepository.save(auction);
    }
}
