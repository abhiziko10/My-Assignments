package com.coditas.OnlineAuctionAPI.Controller;

import com.coditas.OnlineAuctionAPI.Model.dto.Auctiondto;
import com.coditas.OnlineAuctionAPI.Repository.AuctionRepository;
import com.coditas.OnlineAuctionAPI.Service.AuctionServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/auction")
public class AuctionController {
@Autowired
    AuctionServiceImplementation auctionServiceImplementation;
@PostMapping("/addAuction")
public ResponseEntity addAuctionDetails(@RequestBody Auctiondto auctiondto){
try{
    return new ResponseEntity(Optional.of(auctionServiceImplementation.addAuctionDetails(auctiondto)),
            HttpStatus.CREATED);

} catch (Exception e) {
    return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
}
}
}
