<%--
  Created by IntelliJ IDEA.
  User: Tang
  Date: 2019/9/29
  Time: 9:44
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <h1>这是list</h1>
<table border="1">
    <tr>
        <td>
            序号
        </td>
        <td>
            账户名
        </td>
        <td>
            账户金额
        </td>
        <td>
            修改
        </td>
        <td>
            删除
        </td>
    </tr>
    <c:forEach items="${list}" var="account">
        <tr>
            <td>
                ${account.id}
            </td>
            <td>
                ${account.name}
            </td>
            <td>
                ${account.money}
            </td>
            <td><a href="/account/findOne/${account.id}">修改</a></td>
            <td><a href="/account/del/${account.id}">删除</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
