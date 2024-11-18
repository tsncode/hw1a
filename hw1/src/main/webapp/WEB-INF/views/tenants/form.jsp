<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>New Tenant</title>
</head>
<body>
<h2>New Tenant Form</h2>
<form:form action="/tenants/addTenant" modelAttribute="tenant" method="post">
    Name:
    <form:input path="name"/><br>
    Department:
    <form:input path="department"/><br>
    Role:
    <form:input path="role"/><br>
    Contract:
    <form:input path="contract"/><br>
    <form:hidden path="apartment" value="${apartmentId}"/>
    <input type="submit" value="Add Tenant"/>
</form:form>
</body>
</html>