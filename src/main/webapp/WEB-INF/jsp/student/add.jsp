<!DOCTYPE html>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<html>
<body>
    <form:form action="confirmation" method="GET" modelAttribute="student">
        <form:input type="text" path="firstName" placeholder="Student's first name"/>
        <br><br>
        <form:input type="text" path="lastName" placeholder="Student's last name"/>
        <br><br>
        <form:select path="country">
            <form:options items="${countriesOptions}"/>
        </form:select>
        <br><br>
        <div>
            Favorite language:
            <div><form:radiobuttons path="programmingLanguage" items="${programmingLanguagesOptions}"/></div>
        </div>
        <div>
            Operational Systems
            <form:checkboxes path="operationalSystems" items="${operationalSystemOptions}"/>
        </div>
        <div>
            <input type="submit" value="Submit"/>
        </div>
    </form:form>
</body>
</html>