<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
    <head>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <title>sign up</title>
        <style>
            @font-face {
                font-family: 'DungGeunMo';
                src: url("https://fastly.jsdelivr.net/gh/projectnoonnu/noonfonts_six@1.2/DungGeunMo.woff") format('woff');
                font-weight: normal;
                font-style: normal;
            }
            body {
                font-family: 'DungGeunMo';
            }
            input {
                font-family: 'DungGeunMo';
            }
            .block {
                display: flex;
                margin: 10px auto;
                align-items: center;
            }
            .text {
                margin-left: 10px;
            }
        </style>
    </head>
    <body>
        <h1>회원가입 정보 입력</h1>
        <form method="post" action="../su">
            <div class="block">
                <div>아이디
                </div>
                <input type="text" name="id" class="text" id="id" placeholder="아이디를 입력해주세요">
            </div>
            <div class="block">
                <div>비밀번호
                </div>
                <input
                    type="password"
                    name="pw"
                    class="text"
                    id="pw"
                    placeholder="비밀번호를 입력해주세요">
            </div>
            <div class="block">
                <div>비밀번호 확인</div>
                <input
                    type="password"
                    name="pwCheck"
                    class="text"
                    id="pwCheck"
                    placeholder="비밀번호를 다시 입력해주세요">
            </div>
            <div class="button">
                <input type="submit" class = "submit" value="가입">
            </div>
        </form>
        <script>
            window.addEventListener('load', bind);

            function bind() {
                const inIdVal = document.querySelector('#id').value.trim();
                const inPwVal = document.querySelector('#pw').value.trim();
                const inPwChVal = document.querySelector('#pwCheck').value.trim();

                const inId = document.querySelector('#id');
                const inPw = document.querySelector('#pw');
                const inPwCh = document.querySelector('#pwCheck');

                const suBtn = document.querySelector('.submit');
                    
                inId.addEventListener('blur', () => {
                if(inIdVal.length == 0) {
                        inId.style.backgroundColor = '#db8974';
                        inId.setAttribute('placeholder', '아이디가 입력되지 않았습니다.');
                }
                else {
                	inId.style.backgroundColor = 'white';
                }
                })

                inPw.addEventListener('blur', () => {
	                if(inPwVal.length == 0) {
	                        inPw.style.backgroundColor = '#db8974';
	                        inPw.setAttribute('placeholder', '비밀번호가 입력되지 않았습니다.');
	                }
	                else {
	                	inId.style.backgroundColor = 'white';
	                }
                })

                inPwCh.addEventListener('blur', () => {
                    if(inPwChVal.length == 0) {
                        inPwCh.style.backgroundColor = '#db8974';
                        inPwCh.setAttribute('placeholder', '비밀번호 확인이 입력되지 않았습니다.');
                    }
                    else {
                    	inId.style.backgroundColor = 'white';
                    }
                })
            }
        </script>
    </body>
</html>