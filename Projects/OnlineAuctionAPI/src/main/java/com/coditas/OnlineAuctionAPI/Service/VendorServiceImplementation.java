package com.coditas.OnlineAuctionAPI.Service;

import com.coditas.OnlineAuctionAPI.Entity.Product;
import com.coditas.OnlineAuctionAPI.Repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VendorServiceImplementation implements VendorService{
    @Autowired
    ProductRepository productRepository;

    @Override
    public Product addProduct(Product product) {
        return productRepository.save(product);
    }

    @Override
    public void removeProduct(int productId) {
     productRepository.deleteById(productId);
    }

    @Override
    public Product updateProduct(Product product) {
        Product oldProduct=productRepository.findById(product.getProductId()).orElse(null);
          if(oldProduct!=null){
              oldProduct.setProductName(product.getProductName());
              oldProduct.setProductBasePrice(product.getProductBasePrice());
              productRepository.save(oldProduct);
          }
          return null;
    }
}
