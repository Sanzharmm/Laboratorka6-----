<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Назначить турменеджера на тур</title>
</head>
<body>

<h1>Назначить турменеджера на тур</h1>

<form:form action="/deputyDirector/appoint-tour-manager-view/" modelAttribute="order">

    ID Тура <form:input path="tour.IDtour"/>
    ID Сотрудника <form:input path="staff.passportID"/>

    <input type="submit" value="Назначить">

</form:form>

</body>
</html>