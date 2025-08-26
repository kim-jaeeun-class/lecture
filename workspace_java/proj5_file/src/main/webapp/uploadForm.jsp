<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="UTF-8">
		<title>upload</title>
	</head>
	<body>
		<!-- 파일 첨부 시, method는 꼭 post -->
		<!-- enctype : 인코딩 타입. 파일 첨부 시 필수 표기. 원래 한글 깨짐 방지에 많이 쓰임.
				multipart : 첨부 파일
				accept-charset : 추가적으로 깨짐 방지를 막기 위해 accept-charset 사용 가능.
				 -->
		<form
			method="post"
			action="upload"
			enctype="multipart/form-data"
			accept-charset="utf-8"
		>
			title : <input type="text" name="title"><br>
			contents<br>
			<textarea name="content" cols=40 rows=10></textarea><br>
			files : <input type="file" name="file1"><br>
			<input type="submit" value="등록">
		</form>
	</body>
</html>