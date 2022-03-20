<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Перевести тур в зал продаж.</title>
</head>
<body>

<h1>Перевести тур в зал продаж.</h1>


<form:form action="/deputyDirector/translate-tour-view/" modelAttribute="tour">

    Введите ID тура <form:input path="IDtour"/>
    Выберите статус тура
    <form:select path="tourStatus">
    <form:options items="${tour.statuses}"/>
    </form:select>
    <br>

    <input type="submit" value="Изменить">

</form:form>

</body>
</html>