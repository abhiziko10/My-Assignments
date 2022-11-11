package com.coditas.OnlineAuctionAPI.Service;

import com.coditas.OnlineAuctionAPI.Entity.Customer;
import com.coditas.OnlineAuctionAPI.Repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CustomerServiceImplementation implements CustomerService{
    @Autowired
    CustomerRepository customerRepository;

    @Override
    public Customer registerCustomer(Customer customer) {
        return  customerRepository.save(customer);
    }
}
