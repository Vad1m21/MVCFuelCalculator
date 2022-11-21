<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: povar
  Date: 18.11.2022
  Time: 14:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title> Fuel Prices On The Gas Stations in Rivne</title>
</head>
<body>
<br>
<br>

        <h1>Fuel price</h1>
<table>
    <tr>
        <th>Name</th>
        <th></th>
        <th>A95</th>
        <th></th>
        <th>A95 Plus</th>
        <th></th>
        <th>DP</th>
        <th></th>
        <th>Gas</th>
        <th></th>
        <th>A92</th>
    </tr>
    <c:forEach var="station" items="${allStations}" >
        <tr>
            <td>${station.name}</td>
            <td></td>
            <td>${station.a95}</td>
            <td></td>
            <td>${station.a95Plus}</td>
            <td></td>
            <td>${station.dp}</td>
            <td></td>
            <td>${station.gas}</td>
            <td></td>
            <td>${station.a92}</td>
        </tr>
    </c:forEach>

</table>

<br>
<br>
<br>
<a href="calculator" >Calculator</a>

</body>
</html>
