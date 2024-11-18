<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Form for new apartment</title>
</head>
<body>
<form:form action="/addApartments" modelAttribute="apartment">
    ID:
    <form:input path="id"/>
    Address:
    <form:input path="address"/>\
    Type:
    <form:input path="type"/>
    Tenants:
    <form:input path="tenants"/>

    <input type="submit"/>
</form:form>
</body>
</html>
