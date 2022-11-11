package com.coditas.OnlineAuctionAPI.Controller;

import com.coditas.OnlineAuctionAPI.Entity.Customer;
import com.coditas.OnlineAuctionAPI.Service.CustomerServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("/customer")
public class CustomerController {
    @Autowired
    CustomerServiceImplementation customerServiceImplementation;
   @PostMapping("/registerCustomer")
  public ResponseEntity registerCustomer(@RequestBody Customer customer){
       try {
           return new ResponseEntity(Optional.of(customerServiceImplementation.registerCustomer(customer)),
                   HttpStatus.CREATED);
       } catch (Exception e) {
           return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
       }
   }

}
