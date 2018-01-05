<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: choice
  Date: 2018/1/3
  Time: 23:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title></title>
</head>
<body>
    <c:forEach items="${StringList}" var="listA">
        ${listA.c_id}
        ${listA.c_name}
        ${listA.slist}
    </c:forEach>
</body>
</html>
