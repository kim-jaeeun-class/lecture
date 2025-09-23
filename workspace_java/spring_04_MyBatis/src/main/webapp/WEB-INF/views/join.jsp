<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<!-- action 영역은 나중에 내 주소로 갈기 -->
	<form method="post" action="">
		<div>empno: <input type="number" name="empno"></div>
		<div>ename: <input type="text" name="ename"></div>
		<div>job: <input type="text" name="job"></div>
		<div>mgr: <input type="number" name="mgr"></div>
		<div>hiredate: <input type="date" name="hiredate"></div>
		<div>sal: <input type="number" name="sal"></div>
		<div>comm: <input type="number" name="comm"></div>
		<div>deptno: <input type="number" name="deptno"></div>
		<input type="submit" value="가입">
		<a href="listEmp">취소</a>
	</form>
</body>
</html>