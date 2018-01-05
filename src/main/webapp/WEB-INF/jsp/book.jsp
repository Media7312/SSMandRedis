<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: choice
  Date: 2018/1/4
  Time: 17:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
    <c:forEach items="${BookList}" var="List">
        ${List.book_id}
        ${List.book_name}
        ${List.categoryList}
    </c:forEach>
</body>
</html>
