# MyBatis 与 spring 与 springmvc 简单使用

### 1. 创建 spring-mvc.xml （src\main\resources\spring-mvc.xml）

### 2. web.xml(src\main\webapp\WEB-INF\web.xml)

防止中文乱码
```xml
<filter>
    <filter-name>CharacterEncodingFilter</filter-name>
    <filter-class>org.springframework.web.filter.CharacterEncodingFilter</filter-class>
    <init-param>
      <param-name>encoding</param-name>
      <param-value>utf-8</param-value>
    </init-param>
</filter>
<filter-mapping>
    <filter-name>CharacterEncodingFilter</filter-name>
    <url-pattern>/*</url-pattern>
</filter-mapping>
```


### 3. 访问  
http://localhost:8080/customer/index.action

![](http://javahouse.xyz/20191222192901.png)

![](http://javahouse.xyz/20191222192921.png)