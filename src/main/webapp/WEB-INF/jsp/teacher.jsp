<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/3/12
  Time: 23:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" pageEncoding="utf-8" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<html>
<head>
    <meta http-equiv="content-type" content="text/html; charset=utf-8">
    <title>Test</title>
    <link rel="stylesheet" href="bootstrap/css/bootstrap.min.css">
</head>
<body>
<table class="table table-striped" border="1" cellspacing="0" cellpadding="10">
    <tr class="success">
        <th>ID</th>
        <th>UserName</th>
        <th>Age</th>
    </tr>

    <c:forEach items="${requestScope.teachers}" var="teacher">
        <tr class="danger">
            <td>${user.id}</td>
            <td>${user.userName}</td>
            <td>${user.age}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>
