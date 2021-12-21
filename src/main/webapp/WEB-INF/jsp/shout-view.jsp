<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    <head>
        <link href='<c:url value="/css/common.css"/>' rel="stylesheet" type="text/css">
    </head>
    <h1>Welcome</h1>
    <div>
        <label>${message}</label>
    </div>
</body>
</html>