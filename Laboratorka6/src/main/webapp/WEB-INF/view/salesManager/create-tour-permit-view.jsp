<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Sales Manager</title>
</head>
<body>


<h1>Сформировать путевки по туру</h1>

<br><br>


<form:form action="/salesManager/show-dates-and-program-view/" modelAttribute="permit">
    <hr>
    ID туриста <form:input path="tourist.passportID"/>
    <hr>
    ФИО <form:input path="tourist.touristFullName"/>
    <hr>
    Адрес <form:input path="tourist.address"/>
    <hr>
    ID тура <form:input path="tourNumber"/>
    <hr>
    Дата оформления <form:input path="agreementDate"/>
    <hr>

    <input type="submit" value="Сформировать">

</form:form>


</body>
</html>