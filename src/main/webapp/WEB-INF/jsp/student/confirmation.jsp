<!DOCTYPE html>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
    Student: ${student.firstName} ${student.lastName}
    <br><br>
    Country code: ${student.country}
    <br><br>
    Programming Language: ${student.programmingLanguage}
    <br><br>
    <div>
        Operational Systems:
        <ul>
            <c:forEach var="operationalSystem" items="${student.operationalSystems}">
                 <li>${operationalSystem}</li>
            </c:forEach>
        </ul>
    </div>
</body>
</html>