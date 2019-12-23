# ssm-crm系统实战

### 1 快速开始

```java
git clone https://github.com/buerbl/ssm-learn-crm.git
```

### 2 结果

#### 2.1 首页

![](http://javahouse.xyz/20191223020132.png)

#### 2.2 查找页

![](http://javahouse.xyz/20191223020156.png)

#### 2.3 修改页

![](http://javahouse.xyz/20191223020213.png)


### 3. 返回json（src\main\java\com\buer\controller\CustomerController.java）
1. 在 CustomerController 上添加 ```@ResponseBody```
2. 需要添加 jackson 依赖

否则出现  
java-lang-illegalargumentexception-no-converter-found-for-return-value-of-type 