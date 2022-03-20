<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Tour Composer</title>
</head>
<body>


<h1>Составить программу Тура</h1>

<br><br>

<form:form action = "/tourComposer/make-program-view" modelAttribute="program">

    <hr>
    Описание программы <form:input path="description"/>
    <hr>

    <input type="submit" value="Отправить">

</form:form>




</body>
</html>