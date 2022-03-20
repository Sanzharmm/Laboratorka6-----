<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Main Menu</title>
</head>
<body>


<h1>Добро пожаловать в главное меню ${user.name} ${user.surname}, Ваш адрес ${user.address}</h1>
<h2>Ваша роль: Tour Composer</h2>

<br><br>

<h3>Выберите функцию!</h3>

<hr>
<a href="/tourComposer/compile-applications-view/">Составить заявки и занести забронированные билеты и номера в базу туроператора.</a>
<hr>
<a href="/tourComposer/make-program-view/">Составить программу Тура</a>
<hr>
<a href="/tourComposer/read-customer-review-view/">Ознакомится с отзывами клиентов.</a>
<hr>

</body>
</html>
