<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Добавить работника</title>
</head>
<body>

<h1>Добавить работника</h1>

<form:form action="/deputyDirector/hire-employee-view/" modelAttribute="staff">
    <hr>
    Введите ФИО работника <form:input path="fullName"/>
    <hr>
    Введите его адрес <form:input path="address"/>
    <hr>
    Введите его должность <form:input path="position.IDposition"/>
    <hr>
    <input type="submit" value="Добавить">

</form:form>

</body>
</html>
