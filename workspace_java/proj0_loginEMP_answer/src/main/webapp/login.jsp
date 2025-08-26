<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form method="post" action="list">
		id: <input type="text" name="ename"><br>
		pw: <input type="password" name="empno"><br>
		<button type="submit">로그인</button>
		
		<c:if test="${param.msg eq '1'}">
		<span style="color:red">
			id / pw 확인
		</span>
		</c:if>
	</form>
</body>
</html>