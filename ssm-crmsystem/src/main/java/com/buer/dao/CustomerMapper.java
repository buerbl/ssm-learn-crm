package com.buer.dao;

import com.buer.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    /**
     * 添加客户
     */
    void saveCustomer(Customer customer);

    List<Customer> list();
}
