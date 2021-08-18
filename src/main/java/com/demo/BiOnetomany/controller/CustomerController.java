package com.demo.BiOnetomany.controller;


import com.demo.BiOnetomany.entity.Customer;
import com.demo.BiOnetomany.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class CustomerController {

    @Autowired
    private CustomerService customerService;

    @GetMapping("/getdata")
    public List<Customer> list(){
        System.out.println("Get Method is Called");
        return customerService.listAll();
    }


    @PostMapping("/create")
    public String create (@RequestBody Customer customer){
        customerService.save(customer);
        return "New Customer Added";
    }



}
