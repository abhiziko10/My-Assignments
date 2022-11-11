package com.coditas.OnlineAuctionAPI.Service;

import com.coditas.OnlineAuctionAPI.Entity.Product;
import org.springframework.stereotype.Service;

@Service
public interface VendorService {

public Product addProduct(Product product);

public void removeProduct(int productId);

public Product updateProduct(Product product);

}
