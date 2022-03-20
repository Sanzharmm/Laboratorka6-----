<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Tour Composer</title>
</head>
<body>


<h1>Ознакомится с отзывами клиентов</h1>

<br><br>

<form:form action = "/tourComposer/read-customer-review-view" modelAttribute="client">

    <h1>В БД не упоминаются отзывы</h1>

</form:form>

</body>
</html>