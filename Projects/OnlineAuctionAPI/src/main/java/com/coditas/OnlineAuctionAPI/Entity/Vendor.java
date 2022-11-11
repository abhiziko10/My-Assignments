package com.coditas.OnlineAuctionAPI.Entity;

import lombok.Data;
import org.springframework.stereotype.Component;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Component
public class Vendor {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int vendorId;
    private String vendorName;
    private String vendorEmail;
    private String password;
    @OneToMany(mappedBy = "vendor",cascade=CascadeType.ALL,orphanRemoval = true)
    List<Product> productList=new ArrayList<>();


}
