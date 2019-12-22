package com.buer.service.Impl;

import com.buer.dao.CustomerMapper;
import com.buer.domain.Customer;
import com.buer.service.IcustomerService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

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
    public void saveCustomer(Customer customer) {
        customerMapper.saveCustomer(customer);
    }

    @Override
    public List<Customer> list() {
        return customerMapper.list();
    }
}



