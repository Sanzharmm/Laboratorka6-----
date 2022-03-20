<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Main Menu</title>
</head>
<body>


<h1>Добро пожаловать в главное меню ${user.name} ${user.surname}, Ваш адрес ${user.address}</h1>
<h2>Ваша роль: Tour Manager</h2>

<br><br>

<h3>Выберите функцию!</h3>

<hr>
<a href="/tourManager/tour-information-view/">Информация о турах</a>
<hr>
<a href="/tourManager/get-client-list/">Получить список туристов купивших путевки на его тур.</a>
<hr>

</body>
</html>
