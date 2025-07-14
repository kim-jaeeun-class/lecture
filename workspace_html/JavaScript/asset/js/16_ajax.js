window.addEventListener('load', bind);

function bind() {
    document.querySelector('#btn1').addEventListener('click', function() {

        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식method, 주소
        xhr.open('get', 'https://jsonplaceholder.typicode.com/users');
        
        // 보내기
        xhr.send();

        xhr.onload = function() {
            console.log('comeback');
            // xhr.responseTest : 응답 받은 내용이 담김
            console.log(xhr.responseText);
            const data = JSON.parse(xhr.responseText);
            console.log(data);

            // 배열에서 첫 번째 사람의 username만 가져와서 출력
            console.log(data[0].username);
            console.log(data[0].address.geo.lat);
        }
    })
    document.querySelector('#btn2').addEventListener('click', function() {
        const serviceKey = 'ECKxG0kE8Xl5AWckQ45m0EzGm%2BIVxOTjfTUD%2BEOvSULJABLGA05kjnS2%2FqAEnRXPFYncl8AqyyAGqyZorjeMJw%3D%3D';
        let url = 'https://apis.data.go.kr/1360000/VilageFcstInfoService_2.0/getUltraSrtFcst';
        url += '?serviceKey=' + serviceKey;
        url += '&numberOfRows=1000';
        url += '&pageNo=1';
        url += '&dataType=JSON';
        url += '&base_date=20250714';
        url += '&base_time=1400';
        url += '&nx=63';
        url += '&ny=100';

        const xhr = new XMLHttpRequest();
        
        xhr.open('get', url);
        xhr.send();
        xhr.onload = function() {
            console.log(xhr.responseText);
            const data = JSON.parse(xhr.responseText);
            console.log(data);
        }

    })
    document.querySelector('#btn4').addEventListener('click', function() {

        // ajax 객체 생성
        const xhr = new XMLHttpRequest();

        // 보낼 준비
        // 방식method, 주소
        xhr.open('get', 'http://humanjobs.co.kr/');
        
        // 보내기
        xhr.send();

        xhr.onload = function() {
            console.log('comeback');
            console.log(xhr.responseText);
        }
    })
}
