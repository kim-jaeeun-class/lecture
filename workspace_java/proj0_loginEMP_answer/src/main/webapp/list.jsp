<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import = "emp.dto.EmpDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>list</title>
</head>
<body>
	dto: ${dto}<br>
	\${empty dto}: ${empty dto}
	<c:if test="${empty dto}">
		<c:redirect url="login.jsp" />
	</c:if>
	<!-- java로는 아래처럼 -->
	<%
		EmpDTO dto = (EmpDTO) session.getAttribute("dto");
		if(dto == null) {
			response.sendRedirect("login.jsp");
		}
	%>
	
	<h1>회원 목록</h1>
	
	<!-- 직업에 따라 관리자 여부 보여줌 -->
	<c:if test="${dto.job eq 'PRESIDENT'}">
	[관리자]
	</c:if>
	${dto.ename}님 반갑습니다.<br>
	
	<a href="logout">로그아웃</a>
	
<%-- 	${list } --%>

<table>
	<tr>
		<th>empno</th>
		<th>ename</th>
		<th>job</th>
		<th>mgr</th>
		<th>비고</th>
	</tr>
	<c:forEach var="dto" items="${list}">
		<tr>
			<td>${dto.empno}</td>
			<td>${dto.ename}</td>
			<td>${dto.job}</td>
			<td>${dto.mgr}</td>
			<td>
				<c:if test="${sessionScope.dto.job eq 'PRESIDENT'}">
				[수정]
				</c:if>
				<c:if test="${sessionScope.dto.empno eq dto.empno}">
				[수정]
				</c:if>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>