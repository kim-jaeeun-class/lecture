<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<script>
	const a = 'a1b2';
	// jsp의 script 영역에서 먼저 로딩시켜 받아오는 식으로 js에서 세션 데이터 사용 가능
	// 단점 : console에서 확인 가능(수정은 불가)
	// 그래서 세션 정보를 받아오기 위해 ajax를 사용하는 쪽이 안전
	const id = '${id}';
</script>
<!-- resources 덕분에 상대, 절대경로 관계 없이 바로 resources 폴더로 접근 가능 -->
<script src="resources/main.js"></script>
</head>
<body>
	<!-- java 값을 js로 전달하는 연습 -->
	<h1>main.jsp</h1>
	<div>id : ${id}</div>
	<div>level : ${level}</div>
</body>
</html>