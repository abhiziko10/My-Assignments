package com.coditas.OnlineAuctionAPI.Controller;

import com.coditas.OnlineAuctionAPI.Entity.Product;
import com.coditas.OnlineAuctionAPI.Service.VendorServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/vendor")
public class VendorController {
    @Autowired
    VendorServiceImplementation vendorServiceImplementation;
    @PostMapping("/addProduct")
   public ResponseEntity addProduct(@RequestBody Product product){
        try{
       return new ResponseEntity(Optional.of(vendorServiceImplementation.addProduct(product)), HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("/deleteProduct/{productId}")
    public ResponseEntity deleteProduct(@PathVariable int productId){
        try{
          vendorServiceImplementation.removeProduct(productId);
          return new ResponseEntity(HttpStatus.OK);
        } catch (Exception e) {
            return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);

        }
    }

    @PutMapping("/updateProduct")
    public ResponseEntity updateProduct(@RequestBody Product product){
     try{
         return new ResponseEntity(Optional.of(vendorServiceImplementation.updateProduct(product)),HttpStatus.OK);
     } catch (Exception e) {
         return new ResponseEntity(HttpStatus.INTERNAL_SERVER_ERROR);
     }
    }
}
