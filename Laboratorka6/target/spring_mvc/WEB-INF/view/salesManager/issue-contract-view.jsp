<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Sales Manager</title>
</head>
<body>


<h1>Оформить новый договор</h1>

<br><br>


<form:form action="/salesManager/issue-contract-view/" modelAttribute="contract">

    <hr>
    ФИО <form:input path="client.fullName"/>
    <hr>
    Адрес <form:input path="client.address"/>
    <hr>
    Номер тура <form:input path="tour.IDtour"/>
    <hr>
    Дата оформления <form:input path="agreementDate"/>
    <hr>
    Страна <form:input path="tour.country"/>
    <hr>
    Дата начала <form:input path="tour.beginningDate"/>
    <hr>
    Дата завершения <form:input path="tour.endingDate"/>
    <hr>
<%--    Номер программы <form:input path="tour.program.IDprogram"/>--%>
    <hr>

    <input type="submit" value="Оформить">

</form:form>


</body>
</html>