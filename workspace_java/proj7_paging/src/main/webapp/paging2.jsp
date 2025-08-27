<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<%@ page import = "paging.dto.PagingDTO" %>
<%@ page import = "java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>paging2</title>
</head>
<body>
<form method="get" action="paging">
	검색(ename 기준): <input type="text" name="keyword">
	<input type="submit" value="검색">
	
</form>
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
	${map.total} / ${PagingDTO.pagePerRows}
	
	<% 
		int total = (int)((Map)request.getAttribute("map")).get("total");
		int pagePerRows = ((PagingDTO)request.getAttribute("PagingDTO").getPagePerRows());
		int totalPage = (int)Math.ceil((double)total / pagePerRows);
		
		int sec = 5; // 한 번에 보여줄 페이지 수
		int pageNum = ((PagingDTO)request.getAttribute("PagingDTO").getPage());
		int secStart = ((int)Math.floor((double)pageNum / sec) * (sec-1)) + 1;
		int secEnd = (int)Math.ceil((double)pageNum / sec) * sec;
		
		if(secEnd > totalPage) {
			secEnd = totalPage;
		}
	%>
	totalPage : <%=totalPage %>
	
	\${i}만 있으면 전체 페이지 번호 출력용 반복
	if문은 현재 페이지만 강조 표시
	
	<<
	<c:if test="<%=secStart == 1 %>">
	이전
	</c:if>
	<c:if test="<%=secStart != 1 %>">
		<a href="paging2?page=<%=secStart-1 %>&size=${PagingDTO.pagePerRows}&keyword=${PagingDTO.keyword}">이전</a>
	</c:if>
	<a href="paging2?page=${i}&keyword=${PagingDTO.keyword}">
		<c:forEach var = "i" begin="<%=secStart %>" end="<%=secEnd %>">
			<c:if test="${PagingDTO.page eq i}">
				<strong>${i}</strong>
			</c:if>
			<c:if test="${PagingDTO.page ne i}">
				${i}
			</c:if>
		</c:forEach>
	</a> &nbsp;
	
	<c:if test="<%=secEnd == totalPage %>">
		다음
	</c:if>
	<c:if test="<%=secEnd != totalPage %>">
		<a href="paging2?page=<%=secEnd + 1 %>&keyword=${PagingDTO.keyword}">다음</a>
	</c:if>
	>>
	

	
	<< 	이전 1 2 3 4 5 다음 >></body>
</html>