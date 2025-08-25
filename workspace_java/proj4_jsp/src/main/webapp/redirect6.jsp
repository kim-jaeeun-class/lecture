<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>redirect</title>
</head>
<body>
	텍스트 써도 보이지 않음
    <c:redirect url="session">
        <c:param name = "id" value = "admini" />
    </c:redirect>
</body>
</html>