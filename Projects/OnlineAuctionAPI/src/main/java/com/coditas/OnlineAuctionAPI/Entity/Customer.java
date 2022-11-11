package com.coditas.OnlineAuctionAPI.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int cutomerId;
    private String customerName;
    private long customerMobile;
    private String password;
    @OneToMany(mappedBy="customer",cascade =CascadeType.ALL,orphanRemoval = true)
    List<Auction> auctionList=new ArrayList<>();
}
