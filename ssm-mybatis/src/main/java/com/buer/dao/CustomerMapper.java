package com.buer.dao;

import com.buer.domain.Customer;

public interface CustomerMapper {
    /**
     * 添加客户
     */
    void saveCustomer(Customer customer);
}
