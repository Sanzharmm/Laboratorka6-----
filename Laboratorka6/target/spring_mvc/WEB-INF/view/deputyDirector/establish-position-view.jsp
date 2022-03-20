<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Учредить должность</title>
</head>
<body>

<h1>Учреждение должности</h1>

<form:form action="/deputyDirector/establish-position-view/" modelAttribute="staff">
    <hr>
    Введите ID сотрудника <form:input path="passportID"/>
    <hr>
    Введите его должность <form:input path="position"/>
    <hr>

    <input type="submit" value="Изменить">

</form:form>

</body>
</html>
