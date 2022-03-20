<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Перевести тур в зал продаж.</title>
</head>
<body>

<h1>Посмотреть продажу путевок по туру.</h1>


<form:form action="/deputyDirector/show-tour-sales/" modelAttribute="tour">

    Введите ID тура <form:input path="IDtour"/>

    <input type="submit" value="Найти">

</form:form>

</body>
</html>