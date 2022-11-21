<%--
  Created by IntelliJ IDEA.
  User: povar
  Date: 18.11.2022
  Time: 15:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Your calculations </title>
</head>
<body>
<h1> Calculations </h1>
<table>
    <tr>
    <td>Fuel price:</td>
        <td>${fuel.price}</td>
        <td>UAH</td>
    </tr>
    <tr>
        <td>Liters per 100 km:</td>
        <td>${fuel.liters}</td>
        <td>l</td>
    </tr>
    <tr>
        <td>Distance:</td>
        <td>${fuel.distance}</td>
        <td>km</td>
    </tr>
    <tr>
        <td>Amount of people:</td>
        <td>${fuel.peoples}</td>
        <td>people</td>
    </tr>
        <tr>
            <td>Price of fuel for the distance</td>
            <td>${fuel.sum}</td>
            <td>UAH</td>
        </tr>
</table>



<br>

<br>




</body>
</html>
