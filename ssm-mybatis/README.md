# MyBatis 简单使用

### 1 执行 sql (src\main\mysql\c_customer.sql)

```sql
CREATE table t_customer(
	id int PRIMARY KEY auto_increment,
	name VARCHAR(20),
	gender char(1),
	telephone VARCHAR(20),
	address VARCHAR(50)
);
```

### 2 主要部分 (src\test\java\com\buer\Test.java)

究竟如何用 MyBatis 连接数据库

```java
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
```

### 3 结果 

执行 src\test\java\com\buer\Test.java 的测试方法，得到结果

![](http://javahouse.xyz/20191222140423.png)


