package com.buer.controller;

import com.buer.domain.Customer;
import com.buer.service.IcustomerService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/22 18:50
 */

@Controller
@RequestMapping("/customer")
public class CustomerController {

    @Resource
    private IcustomerService service;
    @RequestMapping("/index")
    public String test(){
        System.out.println("ssss");
        return "index";
    }


    @RequestMapping("/save")
    public String save(Customer customer){
        System.out.println("save");
        service.saveCustomer(customer);
        return "success";
    }
}



