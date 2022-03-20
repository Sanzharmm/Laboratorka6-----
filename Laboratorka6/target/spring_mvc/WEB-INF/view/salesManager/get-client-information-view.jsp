<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Sales Manager</title>
</head>
<body>


<h1>Получить подробную информацию о клиентах, с которыми был заключен договор!</h1>

<br><br>


<form:form action="/salesManager/get-client-information-view/" modelAttribute="client">
    <hr>
    Имя
    <hr>
    Адрес
    <hr>
    Телефон
    <hr>

    <br><br>

    <input type="submit" value="Посмотреть">

</form:form>


</body>
</html>