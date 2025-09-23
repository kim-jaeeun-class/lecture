<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div>empno: ${empDTO.empno}</div>
	<div>ename: ${empDTO.ename}</div>
	<div>job: ${empDTO.job}</div>
	<div>mgr: ${empDTO.mgr}</div>
	<div>hiredate: ${empDTO.hiredate}</div>
	<div>sal: ${empDTO.sal}</div>
	<div>comm: ${empDTO.comm}</div>
	<div>deptno: ${empDTO.deptno}</div>
	<a href="editData">수정</a>
	<a href="removeData">삭제</a>
	<a href="listEmp">뒤로 가기</a>
</body>
</html>