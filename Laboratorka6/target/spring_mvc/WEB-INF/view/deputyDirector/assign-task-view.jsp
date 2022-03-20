<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Задать задание Тех. Отделу</title>
</head>
<body>

<h1>Задать задание Тех. Отделу</h1>

<form:form action="/deputyDirector/assign-task-view/" modelAttribute="tasks">
    <hr>
    ID Сотрудника <form:input path="staff.passportID"/>
    <hr>
    ID Тура <form:input path="tour.IDtour"/>
    <hr>
    Страна <form:input path="tour.country"/>
    <hr>
    Тип тура <form:input path="tour.tourType"/>
    <hr>
    Дата начала <form:input path="tour.beginningDate"/>
    <hr>
    Дата завершения <form:input path="tour.endingDate"/>
    <hr>
    <%--        Program Number <form:input path="tour.program.IDprogram"/>--%>
    <hr>
    Описание <form:input path="description"/>
    <hr>
<%--    Статус <form:select path="taskStatus">--%>
<%--    <form:options items="${tasks.statuses}"/>--%>
<%--    </form:select>--%>
<%--    <hr>--%>

    <input type="submit" value="Send" >

</form:form>

</body>
</html>