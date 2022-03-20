<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <title>Проданные путевки</title>
</head>
<body>

<h1>Здесь должен быть список проданных путевок</h1>

<form:form action="/deputyDirector/show-ticket-sales-view/" modelAttribute="permit">

    Номер путевки <br>

    Номер паспорта <br>
    Имя <br>
    Адрес <br>
    Номер тура <br>
    Дата оформления <br>

    <input type="submit" value="Найти">


</form:form>

</body>
</html>
