<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Удалить тур.</title>
</head>
<body>

<h1>Удалить тур.</h1>


<form:form action="/deputyDirector/delete-tour-view/" modelAttribute="tour">

    Введите ID тура для удаления <form:input path="IDtour"/>

    <br>

    <input type="submit" value="Удалить">

</form:form>

</body>
</html>