<%@ page language="java" pageEncoding="UTF-8"%>

<!DOCTYPE html>

<head>
    <title>Main Menu</title>
</head>
<body>


<h1>Добро пожаловать в главное меню ${user.name} ${user.surname}, Ваш адрес ${user.address}</h1>
<h2>Ваша роль: Sales Manager</h2>

<br><br>

<h3>Выберите функцию!</h3>

<hr>
<a href="/salesManager/show-dates-and-program-view/">Ознакомится со сроками и программой тура</a>
<hr>
<a href="/salesManager/issue-contract-view/">Оформить новый договор</a>
<hr>
<a href="/salesManager/create-tour-permit-view/">Сформировать путевки по туру и занести информацию в базу тур оператора о туристах.</a>
<hr>
<a href="/salesManager/get-client-information-view/">Получить подробную информацию о клиентах, с которыми был заключен договор.</a>
<hr>
<a href="/salesManager/get-tour-information-view/">Получить подробную информацию о путевке ее билетах и гостиничных номерах и информацию о самих туристах</a>
<hr>

</body>
</html>
