<%--
  Created by IntelliJ IDEA.
  User: czz
  Date: 2019/9/28
  Time: 16:49
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>账户列表</title>
</head>
<body>
    <h3>账户列表</h3>
    <c:forEach items="${list}" var="ac">
        </br>
        ${ac.name}
    </c:forEach>
</body>
</html>
