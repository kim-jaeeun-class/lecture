<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원가입 결과</title>
<style>
	body {
		background-color: #DAABB5;
	}
	h1 {
	}
	.result {
		width: 70%;
		margin: 20px auto;
		border: none;
		border-radius: 20px;
		box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05);
		background-color: white;
		padding: 30px 50px;
	}
	.result-box {
		display: flex;
	}
	.title {
		font-weight: bold;
		margin-right: 10px;
		width: 70px;
	}
</style>
</head>
<body>
	
	<div class="result">
		<h1>회원가입 완료</h1>
		<div class="result-box">
			<div class="title">아이디 </div>
			<div class="result-value">${memberDTO["id"]}</div>
<%-- 			$이런 사용도 가능{memberDTO["id"]} --%>
		</div>
		<div class="result-box">
			<div class="title">비밀번호 </div>
			<div class="result-value">${pw}</div>
		</div>
		<div class="result-box">
			<div class="title">이름 </div>
			<div class="result-value">${name}</div>
		</div>
		<div class="result-box">
			<div class="title">나이 </div>
			<div class="result-value">${age}</div>
		</div>
	</div>
</body>
</html>