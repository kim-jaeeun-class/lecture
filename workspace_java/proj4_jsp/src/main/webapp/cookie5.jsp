<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>Insert title here</title>
        <style>
            .popup {
                border: 1px dotted rgb(109, 133, 185);
                width: 300px;
                height: 300px;
                display: flex;
                align-items: center;
                justify-content: center;
            }
        </style>
        <script>
            window.addEventListener('load', () => {
                function showPopup() {
                    const cookies = document.cookie.split('; ');
                    // 'dinner=fish; a=a1; abcd=1234'

                    // of 반복문 사용 가능
                    for(let i = 0; i < cookies.length; i++) {
                        const cookie = cookies[i].split('=');
                        const name = cookie[0];
                        const value = cookie[1];

                        if(name == 'noShow' && value == 'true') {
                            document.querySelector('.popup').classList.add('hide');
                        }
                    }
                }

                document.querySelector('#noShow').addEventListener('click', (event) => {

                    // js로 쿠키 적용하는 법(세션 쿠키)
                    document.cookie = 'a=a1';
                    document.cookie = 'abcd=1234';

                    // 쿠키 가져오기
                    console.log(document.cookie);

                    const isCheck = event.target.checked;
                    if(isCheck) {
                        // 10초 뒤의 시간 가져오기
                        const now = new Date(); // 현재 시각
                        const after10s = now.getSeconds() + 10;
                        now.setSeconds(after10s);   // 초 단위로 재설정

                        document.cookie = 'noShow=true;expires=' + now.toGMTString();
                    }
                })
            })

        </script>
    </head>
    <body>
        <div class="popup">
            <div class = "title">notice</div><br><br>
            <input type="checkbox" id="noShow"> 10초 동안 보지 않기
        </div>
    </body>
</html>