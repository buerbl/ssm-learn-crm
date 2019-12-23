package com.buer.domain;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/22 11:51
 */

@Getter
@Setter
@ToString

@AllArgsConstructor
public class Customer {
    private  Integer id;
    private String name;
    private String gender;
    private String telephone;
    private String address;
}



