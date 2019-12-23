# MyBatis 简单使用

### 0 文件路径图

![](http://javahouse.xyz/20191223161415.png)

### 1 sql(src\main\mysql\c_customer.sql)

首先找到 sql 文件  
 
![](http://javahouse.xyz/20191223161943.png)
  
得到结果
    
![](http://javahouse.xyz/20191223160542.png)

### 2 编写 sqlMapConfig.xml（src\main\resources\sqlMapConfig.xml）

这是一个 mybatis 的配置文件，他的作用是连接数据库以及找到相应的 xml 文件

![](http://javahouse.xyz/20191223161216.png) 



### 3 编写实体类（src\main\java\com\buer\domain\Customer.java）

实体类与数据库字段对应

![](http://javahouse.xyz/20191223162152.png)


### 4 编写 CustomerMapper （src\main\java\com\buer\dao\CustomerMapper.java）

![](http://javahouse.xyz/20191223162239.png)

### 5 编写 CustomerMapper.xml （src\main\resources\CustomerMapper.xml）

![](http://javahouse.xyz/20191223162536.png)

### 6 测试 (src\test\java\com\com.buer\Test.java)

![](http://javahouse.xyz/20191223162741.png)

### 7 结果 

执行 src\test\java\com\com.buer\Test.java 的测试方法，得到结果

![](http://javahouse.xyz/20191222140423.png)


