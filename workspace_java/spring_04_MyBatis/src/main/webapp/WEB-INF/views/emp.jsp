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
<!-- 	<div> -->
<!-- 		<form method="get" action="search"> -->
<!-- 			ename: <input type="text" name="ename"><br> -->
<!-- 			job: <input type="text" name="job"><br> -->
<!-- 			<input type="submit" value="검색"> -->
<!-- 		</form> -->
<!-- 	</div> -->
	<div>
		<form method="get" action="search">
			<select name="type">
				<!-- if로 감싸서 검색 버튼 클릭 후에도, 기존 select 된 옵션 표시 가능 -->
				<c:if test="${empDTO.type eq 1}">
					<option value="1" selected>ename</option>
				</c:if>
				<c:if test="${empDTO.type ne 1}">
					<option value="1">ename</option>
				</c:if>				
				<c:if test="${empDTO.type eq 2}">
					<option value="2" selected>job</option>
				</c:if>
				<c:if test="${empDTO.type ne 2}">
					<option value="2">job</option>
				</c:if>
				<!-- 아래도 똑같이, 혹은 choose~when으로 -->											
					<option value="3"> ename or job</option>
					<option value="4"> sal</option>
		    </select>
			<br>
			<input type="text" value="${empDTO.keyword}" name="keyword"><br>
			<input type="submit" value="검색">
		</form>
	</div>
	<hr>
	<h1>emp.jsp</h1>
	<div>list(all) : ${list}</div>
	<div>empDTO : ${empDTO}</div>
	<div>empDTOMap : ${map}</div>
	<div>list2(empno) : ${list2}</div>
	<div>list3(ename) : ${list3}</div>
	<div>list4(empno, ename) : ${list4}</div>
	<hr>
	<form method="get" adtion="choice"></form>
	<table border=1>
		<thead>
				<th></th>
				<th>empno</th>
				<th>ename</th>
				<th>sal</th>
				<th>job</th>
			
		</thead>
		<tbody>
			<!-- 리스트 데이터 없을 경우 -->
			<c:if test="${empty list}">
				<tr>
					<td colspan="5">cannot found</td>
				</tr>
			</c:if>
			<c:if test="${not empty list}">
					<td colspan="5">data exists</td>
				<c:forEach var="empDTO" items="${list}">
					<tr>
						<td><input type="checkbox" name=empnoes" value="${empDTO.empno}"></td>
						<td>${empDTO.empno}</td>
						<td><a href="empDetail?empno=${empDTO.empno}">${empDTO.ename}</a></td>
						<td>${empDTO.sal}</td>
						<td>${empDTO.job}</td>
					<tr>
				</c:forEach>
			</c:if>
		</tbody>
	</table>
	<input type="submit" value="선택 저장">
</body>
</html>