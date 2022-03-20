<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Sales Manager</title>
</head>
<body>


<h1>Получить подробную информацию о путевке ее билетах и гостиничных номерах и информацию о самих туристах!</h1>

<br><br>


<form:form action="/salesManager/get-tour-information-view/" modelAttribute="tour">

    <hr>
    Введите номер тура чтобы увидеть информацию <form:input path="IDtour"/>
    <hr>

    <input type="submit" value="Посмотреть">

</form:form>


</body>
</html>