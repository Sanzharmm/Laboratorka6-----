<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<head>
    <title>Задать задание на создание тура</title>
</head>
<body>

    <form:form action="/deputyDirector/task-generate-view" modelAttribute="tasks">
        <hr>
        Passport ID <form:input path="staff.passportID"/>
        <hr>
        Tour ID <form:input path="tour.IDtour"/>
        <hr>
<%--        Tour Type <form:input path="tour.tourType"/>--%>
<%--        <hr>--%>
<%--        Beginning Date <form:input path="tour.beginningDate"/>--%>
<%--        <hr>--%>
<%--        Country <form:input path="tour.country"/>--%>
<%--        <hr>--%>
<%--        Ending Date <form:input path="tour.endingDate"/>--%>
<%--        <hr>--%>
<%--&lt;%&ndash;        Program Number <form:input path="tour.program.IDprogram"/>&ndash;%&gt;--%>
<%--        <hr>--%>
<%--        Description <form:input path="description"/>--%>
<%--        <hr>--%>
<%--        Status <form:select path="taskStatus">--%>
<%--        <form:options items="${staff.statuses}"/>--%>
<%--        </form:select>--%>
<%--        <hr>--%>

        <input type="submit" value="Send" >

    </form:form>

</body>
</html>
