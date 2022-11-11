package com.coditas.OnlineAuctionAPI.Model.dto;

import lombok.Data;
import org.springframework.stereotype.Component;

@Data
@Component
public class Auctiondto {

    private int customerId;
    private int productId;
}
