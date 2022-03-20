<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Tour Manager</title>
</head>
<body>


<h1>Показать туры которые выставлены на продажу</h1>

<br><br>


<form:form action="/tourComposer/compile-applications-view/" modelAttribute="tour">

    <hr>
    Название тура ===
    <hr>
    Тип тура ===
    <hr>
    Страна ===
    <hr>
    Дата начала ===
    <hr>
    Дата завершения ===
    <hr>
    Номер программы ===
    <hr>
    <input type="submit" value="Посмотреть">

</form:form>


</body>
</html>