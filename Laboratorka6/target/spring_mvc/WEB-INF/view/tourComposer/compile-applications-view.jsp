<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Tour Composer</title>
</head>
<body>


<h1>Составить заявки и занести забронированные билеты и номера в базу туроператора</h1>

<br><br>


<form:form action="/tourComposer/compile-applications-view/" modelAttribute="ticket">

    <hr>
    Место <form:input path="place"/>
    <hr>
    Город <form:input path="tourEvents.city"/>
    <hr>
    Дана начала <form:input path="tourEvents.beginningTime"/>
    <hr>
    Место проведения <form:input path="tourEvents.place"/>
    <hr>
    Номер паспорта <form:input path="permitList"/>
    <hr>

    <input type="submit" value="Отправить">

</form:form>


</body>
</html>