package com.buer.service.Impl;

import com.buer.dao.CustomerMapper;
import com.buer.domain.Customer;
import com.buer.service.IcustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/22 18:28
 */
@Service("customerService")
public class IcustomerServiceImpl implements IcustomerService {
    @Resource
    private CustomerMapper customerMapper;
    @Override
    @Transactional
    public void saveCustomer() {
        Customer customer = new Customer();
        customer.setName("booleanbl-spring");
        customer.setGender("男");
        customer.setTelephone("020-3333333");
        customer.setAddress("广州天河城广场");
        customerMapper.saveCustomer(customer);
        // 加上这个异常不会插入数据，说明事物生效
        int i = 100 / 0;

    }
}



