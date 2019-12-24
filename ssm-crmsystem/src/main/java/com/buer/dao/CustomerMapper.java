package com.buer.dao;

import com.buer.domain.Customer;

import java.util.List;

public interface CustomerMapper {
    /**
     * 添加客户
     */
    void saveCustomer(Customer customer);

    /**
     * 查询所有客户
     * @return
     */
    List<Customer> list();

    /***
     * 查找某个客户
     * @param id
     * @return
     */
    Customer findById(Integer id);
}
