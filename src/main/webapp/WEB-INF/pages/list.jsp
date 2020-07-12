<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2018/5/6
  Time: 0:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<link rel="stylesheet" href="${pageContext.servletContext.contextPath }/css/index_work.css" />
<script type="text/javascript" src="${pageContext.servletContext.contextPath }/js/jquery-1.8.2.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>

    <h3>查询所有的帐户</h3>

<%--    <c:forEach items="${list}" var="account">--%>
<%--        ${account.name}--%>
<%--    </c:forEach>--%>
    <table>
        <tr>
            <th>id</th>
            <th>name</th>
            <th>money</th>
        </tr>
        <c:forEach items="${list }" var="account">
            <tr>
                <td>${account.id }</td>
                <td>${account.name }</td>
                <td>${account.money }</td>
            </tr>
        </c:forEach>
    </table>

</body>
</html>
