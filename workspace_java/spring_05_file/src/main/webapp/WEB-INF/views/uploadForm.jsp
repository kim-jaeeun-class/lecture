<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h3>file</h3>
	<form method="post" action="upload" enctype="multipart/form-data" accept-charset="utf-8">
		<div>제목 : <input type="text" name="title"></div>
		<div>내용 : <input type="text" name="content"></div>
		<div>파일 첨부 : <input type="file" name="file1"></div>
		<input type = "submit" value = "등록">
	</form>
	<hr>
		<h3>files</h3>
		<form method="post" action="uploads" enctype="multipart/form-data" accept-charset="utf-8">
		<div>제목 : <input type="text" name="title"></div>
		<div>내용 : <input type="text" name="content"></div>
		<div>파일 첨부 : <input type="file" name="file1" multiple="multiple"></div>
		<input type = "submit" value = "등록">
	</form>
</body>
</html>