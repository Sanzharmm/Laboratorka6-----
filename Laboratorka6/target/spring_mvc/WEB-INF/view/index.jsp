<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>

<head>

    <meta charset="utf-8">
    <title>Log In</title>
</head>
<body>
<h1>Добро пожаловать!</h1>

<form:form action="/login" modelAttribute="user">

    Имя <form:input path="name"/>
    <br>

    Фамилия <form:input path="surname"/>
    <br>

    Адрес <form:input path="address"/>
    <br>

    Тип аккаунта <form:select path="userType">
    <form:options items="${user.types}"/>
    </form:select>
    <br>

    <input type="submit" value="Отправить">

</form:form>

</body>
</html>
