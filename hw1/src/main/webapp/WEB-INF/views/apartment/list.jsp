<%@ taglib prefix="c" uri="jakarta.tags.core" %>
<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>List of Apartments</title>
</head>
<body>
<c:forEach items="${apartments}" var="apartment">
    <p>Name: ${apartment.name}, Department: ${apartment.department} <a href="/tenants?apartment=${apartment.id}">[tenants]</a></p>

</c:forEach>
</body>
</html>