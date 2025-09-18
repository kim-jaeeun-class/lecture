<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>회원 가입</title>
<style>
	
	body {
		background-color: #DAABB5;
	}
	.input-box {
		display: flex;
	}
	form {
		width: 70%;
		margin: 20px auto;
		border: none;
		border-radius: 20px;
		box-shadow: 0 10px 15px -3px rgba(0, 0, 0, 0.1), 0 4px 6px -2px rgba(0, 0, 0, 0.05);
		background-color: white;
		padding: 30px 50px;
	}
	.input-box {
		margin: 20px 0;
	}
	.title {
		font-weight: bold;
		margin-right: 10px;
		width: 70px;
	}
	.button {
		width: 100%;
		height: 30px;
		font-weight: bold;
		background-color: #B66878;
		color: white;
		border: none;
		border-radius: 10px;
		margin-top: 20px;
		padding: 5px 0;
	}
	
</style>
</head>
<body>
<!-- <form method="post" action="join1"> -->
<!-- <form method="post" action="join2"> -->
	<form method="post" action="join6">
		<div class="input-box">
			<div class="title">아이디 </div>
			<input type="text" name="id">
		</div>
		<div class="input-box">
			<div class="title">비밀번호 </div>
			<input type="text" name="pw">
		</div>
		<div class="input-box">
			<div class="title">이름 </div>
			<input type="text" name="name">
		</div>
		<div class="input-box">
			<div class="title">나이 </div>
			<input type="number" name="age" min="1" max="120">
		</div>
		<input type="submit" class= "button" value="회원가입">
	</form>
</body>
</html>