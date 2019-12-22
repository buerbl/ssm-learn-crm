package buer;

import com.buer.dao.CustomerMapper;
import com.buer.domain.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.IOException;
import java.io.InputStream;


/**
 * @Description:
 * @Author: boolean
 * @Date: 2019/12/22 12:52
 */
public class Test {

    @org.junit.Test
    public void insert() throws IOException {
        // 1. 加载spring配置
        ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 获取对象
        CustomerMapper customerMapper = (CustomerMapper) ac.getBean("customerMapper");
        System.out.println(customerMapper);
        // 3. 调用方法
        Customer customer = new Customer();
        customer.setName("booleanbl-spring");
        customer.setGender("男");
        customer.setTelephone("020-3333333");
        customer.setAddress("广州天河城广场");
        customerMapper.saveCustomer(customer);
    }

}



