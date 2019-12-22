<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
    <title>客户录入页面</title>

    <meta http-equiv="pragma" content="no-cache">
    <meta http-equiv="cache-control" content="no-cache">
    <meta http-equiv="expires" content="0">
    <meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
    <meta http-equiv="description" content="This is my page">
    <!--
    <link rel="stylesheet" type="text/css" href="styles.css">
    -->

</head>

<body>
<form action="${pageContext.request.contextPath}/customer/save.action" method="post">
    客户姓名：<input type="text" name="name"/><br/>
    客户性别：
    <input type="radio" name="gender" value="男"/>男
    <input type="radio" name="gender" value="女"/>女
    <br/>
    客户手机：<input type="text" name="telephone"/><br/>
    客户住址：<input type="text" name="address"/><br/>
    <input type="submit" value="保存">
</form>

</body>
</html>
