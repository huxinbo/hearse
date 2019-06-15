package com.hearsegroup.service.hearse.mapper;

import com.hearsegroup.service.hearse.entity.CustomerDo;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface CustomerServiceMapper {
    List<CustomerDo> findCustomers();
}