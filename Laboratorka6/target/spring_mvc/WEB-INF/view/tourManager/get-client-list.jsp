<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Tour Composer</title>
</head>
<body>


<h1>Получить список туристов купивших путевки на его тур</h1>

<br><br>

<form:form action = "/tourComposer/get-client-list" modelAttribute="client">

    <hr>
    Имя ===
    <hr>
    Адрес ===
    <hr>
    Телефон ===
    <hr>

</form:form>




</body>
</html>