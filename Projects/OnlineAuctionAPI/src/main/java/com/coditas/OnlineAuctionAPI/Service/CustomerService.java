package com.coditas.OnlineAuctionAPI.Service;

import com.coditas.OnlineAuctionAPI.Entity.Customer;
import org.springframework.stereotype.Service;

@Service
public interface CustomerService {

    public Customer registerCustomer(Customer customer);
}
