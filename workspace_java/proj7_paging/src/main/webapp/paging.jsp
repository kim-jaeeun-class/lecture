<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import = "paging.dto.PagingDTO" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>pagingList</title>
</head>
<body>
	<table>
		<tr>
			<th>r</th>
			<th>empno</th>
			<th>ename</th>
			<th>job</th>
			<th>mgr</th>
		</tr>
		<c:forEach var="dto" items="${list}">
			<tr>
				<td>${dto.r}</td>
				<td>${dto.empno}</td>
				<td>${dto.ename}</td>
				<td>${dto.job}</td>
				<td>${dto.mgr}</td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>