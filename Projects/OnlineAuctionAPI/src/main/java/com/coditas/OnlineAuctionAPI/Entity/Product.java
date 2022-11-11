package com.coditas.OnlineAuctionAPI.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Component
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int productId;
    private String productName;
    private float productBasePrice;

    @ManyToOne
    @JoinColumn(name="vendor_vendor_id")
    Vendor vendor;

    @OneToMany(mappedBy = "product",cascade=CascadeType.ALL)
    List<Auction> auctionList=new ArrayList<>();
}
