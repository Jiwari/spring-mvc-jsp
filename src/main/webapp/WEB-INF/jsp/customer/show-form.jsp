<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>

    <style>
        .error { color: red }
    </style>
</head>
<body>
    <form:form action="confirmation" method="GET" modelAttribute="customer">
        Customer submit form:
        <br><br>
        First Name: <form:input type="text" path="firstName" placeholder="Customer's first name"/>
        <br><br>
        Last Name (*): <form:input type="text" path="lastName" placeholder="Customer's last name"/>
        <form:errors path="lastName" cssClass="error"/>
        <br><br>
        Free passes: <form:input type="text" path="freePasses"/>
        <form:errors path="freePasses" cssClass="error"/>
        <br><br>
        Postal Code: <form:input type="text" path="postalCode"/>
        <form:errors path="postalCode" cssClass="error"/>
        <br><br>
        Course Code: <form:input type="text" path="courseCode"/>
        <form:errors path="courseCode" cssClass="error"/>
        <br><br>
        <div>
            <input type="submit" value="Submit"/>
        </div>
    </form:form>
</body>
</html>