<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: splas
  Date: 18.05.2022
  Time: 12:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>
<%--<h2> Welcome, ${param.employeeName}</h2>--%>

<h2> Welcome, ${employee.name} </h2>
<br>
<br>
Your surname: ${employee.surname}
<br>
Your salary: ${employee.salary}
<br>
Your department: ${employee.department}
<br>
Your country: ${employee.country}
<br>
Your car: ${employee.carBrand}
<br>
Your language(s)
<ul>

    <c:forEach var="lang" items="${employee.languages}">
    <li>
        ${lang}
    </li>
        </c:forEach>

<ul>>
    <br>
Your phone number: ${employee.phoneNumber}
    <br>
Your email: ${employee.email}
    <br>
    <br>
<a href="askDetails">Enter your details</a>




</body>
</html>
