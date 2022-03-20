<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<head>
    <a href="/">Вернуться назад!</a>
    <title>Main Menu</title>
</head>
<body>


<h1>Добро пожаловать в главное меню ${user.name} ${user.surname}, Ваш адрес ${user.address}</h1>
<h2>Ваша роль: Deputy Director</h2>

<br><br>

<h3>Выберите функцию!</h3>

<hr>
<a href="/deputyDirector/task-generate-view">Сформировать задание на составление тура</a>
<hr>

<hr>
<a href="/deputyDirector/show-ticket-sales-view">Ознакомится с текущими продажами путевок</a>
<hr>

<hr>
<a href="/deputyDirector/establish-position-view">Учредить должность в фирме</a>
<hr>


<hr>
<a href="/deputyDirector/hire-employee-view">Принять сотрудника на работу</a>
<hr>

<hr>
<a href="/deputyDirector/assign-task-view">Дать задание в тех. Отдел по работе с туром</a>
<hr>

<hr>
<a href="/deputyDirector/appoint-tour-manager-view">Назначить турменеджера на тур</a>
<hr>

<hr>
<a href="/deputyDirector/supervise-preparation-view">Проконтролировать работу по составлению тура</a>
<hr>

<hr>
<a href="/deputyDirector/show-reviews-view">Ознакомится отзывами клиентов по туру.</a>
<hr>

<hr>
<a href="/deputyDirector/translate-tour-view">Перевести тур в зал продаж..</a>
<hr>

<hr>
<a href="/deputyDirector/delete-tour-view">Удалить тур.</a>
<hr>

<hr>
<a href="/deputyDirector/show-tour-sales">Посмотреть продажу путевок по туру..</a>
<hr>

</body>
</html>
