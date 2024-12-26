<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>

<html>

<body>

<h2>  Dear Employee. Welcome!!  </h2>
<br>
<br>
<br>

<%--Your name: ${param.employeeName}--%>
<%--Your name: ${nameAttribute} ${description}--%>
Your name: ${employee.name}
<br><br>
Your Surname: ${employee.surname}
<br><br>
Your Salary: ${employee.salary}
<br><br>
Your Department: ${employee.department}
<br><br>
Your car brand: ${employee.carBrand}
<br><br>
Your Language(s):
<ul>
    <c:forEach var="lang" items="${employee.languages}">
        <li>    ${lang}    </li>
    </c:forEach>
</ul>


</body>

</html>