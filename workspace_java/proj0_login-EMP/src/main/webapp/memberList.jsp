<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="loginEMP.DTO.LoginEMPDTO %>
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

    <%
        LoginEMPService service = new LoginEMPService();
		List<LoginEMPDTO> list = service.getAll();
    %>

    <c:forEach var="list" value="<%= list%>" scope="page">
            <br>테스트 : ${list[0].empno}
    </c:forEach>
</body>
</html>