<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>

<html>

<body>

<h2>  Dear Employee, Please enter your details </h2>

<br><br>

<%--<form action="showDetails" method="get">
    <input type = "text" name = "employeeName"
    placeholder="Write your name"/>
    <input type ="submit"/>
</form> --%>

<form:form action="showDetails" modelAttribute="employee">
    Name <form:input path= "name"/>
    <br><br>
    Surname <form:input path= "surname"/>
    <br><br>
    Salary <form:input path= "salary"/>
    <br><br>
    Department <form:select path="department">
    <%--<form:option value="Information Technology" label="IT"/>
    <form:option value="Sales" label="Sales"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Liability Management" label="LM"/>--%>
    <form:options items="${employee.departments}"/>
    </form:select>
    <input type="submit" value="OK">

</form:form>

<br><br>
</body>

</html>