package com.buer.service;

import com.buer.domain.Customer;

import java.util.List;

public interface IcustomerService {
    /**
     * 添加客户
     */
    void saveCustomer(Customer customer);

    /**
     * 返回所有数据
     * @return
     */
    List<Customer> list();
}
