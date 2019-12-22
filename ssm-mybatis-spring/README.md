# MyBatis 与 spring 简单使用

### 1. 创建 applicationContext.xml （src\main\resources\mapper\CustomerMapper.xml）


### 2. 创建 jdbc.properties （ssm-mybatis-spring\src\main\resources\jdbc.properties）

### 3. 主要源码(src\test\java\buer\Test.java)

```java 
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
```