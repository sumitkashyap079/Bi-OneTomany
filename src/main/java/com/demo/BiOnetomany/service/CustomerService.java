package com.demo.BiOnetomany.service;

import com.demo.BiOnetomany.entity.Customer;
import com.demo.BiOnetomany.repository.CustomerRepo;
import com.demo.BiOnetomany.repository.ProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

    @Autowired
    private CustomerRepo customerRepo;

    @Autowired
    private ProductRepo productRepo;

    public List<Customer> listAll(){
        return customerRepo.findAll();
    }

    public Customer save(Customer customer) {
        return customerRepo.save((customer));
    }



}
