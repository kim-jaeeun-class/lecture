<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ page import="loginEMP.DTO.LoginEMPDTO" %>
<%@ page import="loginEMP.service.LoginEMPService" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>회원 목록</title>
</head>
<body>
	실행되는지 테스트용 텍스트
	<%
		Object mem = request.getAttribute("list");
		// 더 써야 함...
	%>
    <c:forEach var="m" items="${list}">
        <br>테스트1 : ${list[m].empno}
        <br>테스트2 : ${list[m].ename}
    </c:forEach>
</body>
</html>