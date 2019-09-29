<%--
  Created by IntelliJ IDEA.
  User: Tang
  Date: 2019/9/29
  Time: 12:46
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <form action="/account/update/${account.id}">
        姓名：<input type="text" name="name" value="${account.name}"><br/>
        金额：<input type="text" name="money" value="${account.money}"><br/>
        <input type="submit" value="修改此用户"/>
    </form>
</body>
</html>
