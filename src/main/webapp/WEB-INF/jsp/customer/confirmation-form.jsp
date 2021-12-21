<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<head>
    <style>
        .error { color: red }
    </style>
</head>
<body>
    First name: ${customer.firstName}
    <br><br>
    Last name: ${customer.lastName}
    <br><br>
    Free passes: ${customer.freePasses}
    <br><br>
    Postal code: ${customer.postalCode}
    <br><br>
    Course code: ${customer.courseCode}
</body>
</html>