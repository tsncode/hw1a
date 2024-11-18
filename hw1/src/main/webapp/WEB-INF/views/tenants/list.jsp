<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Tenants List</title>
</head>
<body>
<h2>Tenants List</h2>
<table>
    <thead>
    <tr>
        <th>Name</th>
        <th>Department</th>
        <th>Role</th>
        <th>Contract</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach var="tenant" items="${tenants}">
        <tr>
            <td>${tenant.name}</td>
            <td>${tenant.department}</td>
            <td>${tenant.role}</td>
            <td>${tenant.contract}</td>
        </tr>
    </c:forEach>
    </tbody>
</table>
<a href="/tenants/newTenant?apartment=${apartmentId}">Add new Tenant</a>
</body>
</html>