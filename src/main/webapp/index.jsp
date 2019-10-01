<%--
  Created by IntelliJ IDEA.
  User: czz
  Date: 2019/9/28
  Time: 16:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>测试</title>
</head>
<body>
    <%--<a href="account/findAll">查询账户列表</a>--%>
    <h3>测试保存</h3>
    <form action="account/save" method="post">
        姓名：<input type="text"/>
        金额：<input type="text"/>
        <input type="submit" value="保存">
    </form>
</body>
</html>
