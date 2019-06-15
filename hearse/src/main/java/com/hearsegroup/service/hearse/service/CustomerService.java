package com.hearsegroup.service.hearse.service;

import com.hearsegroup.service.hearse.entity.CustomerDo;
import com.hearsegroup.service.hearse.mapper.CustomerServiceMapper;
import lombok.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collections;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

@Service
public class CustomerService {
    @Autowired
    private CustomerServiceMapper customerServiceMapper;


    @Data
    public class CustomerDTO {
        private Long customerId;
        private String ref;
        private String tel;
    }

    public List<CustomerDTO> findCustomers() {
        List<CustomerDo> customers = customerServiceMapper.findCustomers();

         return customers.stream().map(this::customerDTO).collect(Collectors.toList());
    }

    private CustomerDTO customerDTO(CustomerDo customerDo) {
        CustomerDTO customerDTO = new CustomerDTO();
        customerDTO.customerId = customerDo.getId();
        customerDTO.ref = customerDo.getRef();
        customerDTO.tel = customerDo.getTel();
        return customerDTO;
    }
}