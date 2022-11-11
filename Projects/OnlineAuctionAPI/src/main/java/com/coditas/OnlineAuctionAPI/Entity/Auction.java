package com.coditas.OnlineAuctionAPI.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;

@Data
@Entity
@Component
public class Auction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int auctionId;
    private float auctionPrice;
    private String auctionStatus;

    @ManyToOne
    @JoinColumn(name = "customer_cutomer_id")
    Customer customer;

    @ManyToOne
    @JoinColumn(name = "product_product_id")
    Product product;

}
