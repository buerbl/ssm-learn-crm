package com.buer;

import com.buer.dao.CustomerMapper;
import com.buer.domain.Customer;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

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
        //1.创建SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder builer = new SqlSessionFactoryBuilder();
        //加载sqlMapConfig.xml文件
        InputStream is = Resources.getResourceAsStream("sqlMapConfig.xml");

        //2.创建sqlSessionFactory
        SqlSessionFactory factory = builer.build(is);

        //3.打开SqlSession
        SqlSession sqlSession = factory.openSession();

        ///4.获取Mapper接口的对象
        CustomerMapper customerMapper = sqlSession.getMapper(CustomerMapper.class);

        //5.操作
        Customer customer = new Customer();
        customer.setName("booleanbl");
        customer.setGender("男");
        customer.setTelephone("020-3333333");
        customer.setAddress("广州天河城广场");

        customerMapper.saveCustomer(customer);

        //6.提交事务
        sqlSession.commit();

        //7.关闭资源
        sqlSession.close();
    }

    @org.junit.Test
    public void test(){
        System.out.println(ClassLoader.getSystemResourceAsStream("sqlMapConfig.xml"));
    }

    public static void main(String[] args) {
        System.out.println(Test.class.getClass().getClassLoader().getResource("/").getPath());
    }

    public String teswt(){
        return Test.class.getClassLoader().getResource("/").getPath();
    }

}



