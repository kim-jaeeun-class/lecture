<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>MAIN</title>
        <style>
            .popup {
                width: 200px;
                height: 200px;
                z-index: 9999;
                margin: auto;
                background-color: antiquewhite;
                border: 1px dotted rgb(177, 202, 149);
                border-radius: 10px;
            }
        </style>
        <script>
            window.addEventListener('load', () => {


                document.querySelector('.noShow').addEventListener('click', (event) => {
                    
                })
            })
        </script>
    </head>
    <body>
        <div class="login">
            <form method="post" action="login">
                <input type="text" name="id" class="id" placeholder="아이디 입력">
                <input type="password" name="pw" class="pw" placeholder="비밀번호 입력">
                <input type="submit" value="로그인">
            </form>
        </div>
        <div class="popup">
            <div class="text">공지 팝업 영역</div>
            <input type="checkbox" class="noShow">1분 동안 보지 않기
        </div>
    </body>
</html>