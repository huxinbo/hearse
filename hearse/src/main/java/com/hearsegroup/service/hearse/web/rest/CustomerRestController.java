package com.hearsegroup.service.hearse.web.rest;

import com.hearsegroup.service.hearse.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;


@RestController
public class CustomerRestController {
    @Autowired
    private CustomerService customerService;

    @GetMapping("customers")
    public List<CustomerService.CustomerDTO> findCustomers() {
        return customerService.findCustomers();
    }
}