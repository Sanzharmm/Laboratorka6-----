<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Sales Manager</title>
</head>
<body>


<h1>Ознакомится со сроками и программой тура!</h1>

<br><br>


<form:form action="/salesManager/show-dates-and-program-view/" modelAttribute="tour">

    Введите ID тура для просмотра информации <form:input path="IDtour"/>

    <br><br>

    <input type="submit" value="Посмотреть">

</form:form>


</body>
</html>