<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%--
  Created by IntelliJ IDEA.
  User: povar
  Date: 18.11.2022
  Time: 14:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculator</title>
</head>
<body>

<h1> Calculate average cost of fuel on distance</h1>
<br>

<form:form action="calculations" modelAttribute="fuel">
<table>
    <tr>
        <td> Fuel Price</td>
        <td> <form:input path="price"/></td>
    </tr>
    <tr>
        <td>Liters per 100km</td>
        <td><form:input path="liters"/></td>
    </tr>
    <tr>
        <td>Distance</td>
        <td><form:input path="distance"/></td>
    </tr>
    <tr>
        <td>Amount of people</td>
        <td><form:input path="peoples"/></td>
    </tr>

</table>
    <input type="submit" value="OK">

</form:form>



</body>
</html>
