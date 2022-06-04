<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: splas
  Date: 18.05.2022
  Time: 12:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h2>Greetings! Enter your details, please.</h2>

<br>
<br>

<%--<form action="showDetails" method="get">--%>
<%--    <input type="text" name="employeeName"--%>
<%--    placeholder="Write your name">--%>
<%--    <input type ="submit"/>--%>

<form:form action="showDetails" modelAttribute="employee" method = "get">

    Name <form:input path="name"/>
    <form:errors path="name"/>
    <br>
    <br>
    Surname <form:input path="surname"/>
    <form:errors path="surname"/>
    <br> <br>
    Salary <form:input path="salary"/>
    <form:errors path="salary"/>
    <br>
    <br>
    Department <form:select path="department">
    <form:option value="Information Technology" label="IT"/>
    <form:option value="Human Resources" label="HR"/>
    <form:option value="Sales" label="Sales"/>

</form:select>
    <br>
    <br>
    Country <form:select path="country">
    <form:options items="${employee.countries}"/>
</form:select>
    <br> <br>
    Which car do you want?
    <form:radiobuttons path="carBrand" items="${employee.carBrands}"/>
    <br>
    <br>
    Foreign Language(s)
    <form:checkboxes path="languages" items="${employee.languagesMap}"/>
    <br> <br>
    Phone number <form:input path="phoneNumber"/>
    <form:errors path="phoneNumber"/>
    <br> <br>
    Email <form:input path="email"/>
    <form:errors path="email"/>
    <br> <br>
    <input type="submit" value="Ok">
</form:form>

</form>

</body>
</html>
