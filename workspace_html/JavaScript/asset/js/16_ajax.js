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
        url += '&numOfRows=1000';
        url += '&pageNo=1';
        url += '&dataType=JSON';
        url += '&base_date=20250715';
        url += '&base_time=0500';
        url += '&nx=63';
        url += '&ny=110';

        const xhr = new XMLHttpRequest();
        
        xhr.open('get', url);
        xhr.send();
        xhr.onload = function() {
            console.log(xhr.responseText);
            const data = JSON.parse(xhr.responseText);
            console.log(data);

            for(i = 0; i < 60; i++) {
                if(data.response.body.items.item[i].category == "T1H") {
                    const table1 = document.querySelector('.test1');
                    const nR1 = document.createElement('tr');

                    const time = data.response.body.items.item[i].fcstTime;
                    const t1h = data.response.body.items.item[i].fcstValue;

                    nR1.innerHTML = `
                        <td class = "new1">${time}</td>
                        <td class = "new1">${t1h}도</td>
                    `

                    table1.append(nR1);
                }
                else if(data.response.body.items.item[i].category == "RN1") {
                    const table1 = document.querySelector('.test2');
                    const nR1 = document.createElement('tr');

                    const time = data.response.body.items.item[i].fcstTime;
                    const rn1 = data.response.body.items.item[i].fcstValue;

                    nR1.innerHTML = `
                        <td class = "new1">${time}</td>
                        <td class = "new1">${rn1}</td>
                    `

                    table1.append(nR1);
                }
                else if(data.response.body.items.item[i].category == "REH") {
                    const table1 = document.querySelector('.test3');
                    const nR1 = document.createElement('tr');

                    const time = data.response.body.items.item[i].fcstTime;
                    const reh = data.response.body.items.item[i].fcstValue;

                    nR1.innerHTML = `
                        <td class = "new1">${time}</td>
                        <td class = "new1">${reh}%</td>
                    `

                    table1.append(nR1);
                }
            }


            // 여기부터 날씨 전체 출력

            // 여기는 어차피 11시까지만 있는 거 알고 넣었지만,
            // 나중에는 i 최댓값 다르게 잡아서 반복문 만들기

            // ++ json 이용해서 더 깔끔하게 넣는 법도 있음
            // 나중에 github 참고하기
            
            for(i = 0; i < 6; i++) {
                const fcstTime = data.response.body.items.item[i].fcstTime;
                const table = document.querySelector('.lastT');
                const nR = document.createElement('tr');
                nR.innerHTML = `
                    <td class = "new1 time${100*(6+i)}">${fcstTime}</td>
                    <td class = "new1 t1h tTime${100*(6+i)}"></td>
                    <td class = "new1 rn1 rnTime${100*(6+i)}"></td>
                    <td class = "new1 reh reTime${100*(6+i)}"></td>
                `
                table.append(nR);
            }


            for(i = 0; i < 60; i++) {
                const fcstTime = data.response.body.items.item[i].fcstTime;

                if(fcstTime == "0600") {
                const t = document.querySelector('.tTime600');
                const rn = document.querySelector('.rnTime600');
                const re = document.querySelector('.reTime600');

                    if(data.response.body.items.item[i].category == "T1H") {
                        t.innerHTML = `${data.response.body.items.item[i].fcstValue}도`;
                    }
                    else if(data.response.body.items.item[i].category == "RN1") {
                        rn.innerHTML = `${data.response.body.items.item[i].fcstValue}`;
                    }
                    else if(data.response.body.items.item[i].category == "REH") {
                        re.innerHTML = `${data.response.body.items.item[i].fcstValue}%`;
                    }
                }
                else if(fcstTime == "0700") {
                const t = document.querySelector('.tTime700');
                const rn = document.querySelector('.rnTime700');
                const re = document.querySelector('.reTime700');

                    if(data.response.body.items.item[i].category == "T1H") {
                        t.innerHTML = `${data.response.body.items.item[i].fcstValue}도`;
                    }
                    else if(data.response.body.items.item[i].category == "RN1") {
                        rn.innerHTML = `${data.response.body.items.item[i].fcstValue}`;
                    }
                    else if(data.response.body.items.item[i].category == "REH") {
                        re.innerHTML = `${data.response.body.items.item[i].fcstValue}%`;
                    }
                }
                else if(fcstTime == "0800") {
                    const t = document.querySelector('.tTime800');
                    const rn = document.querySelector('.rnTime800');
                    const re = document.querySelector('.reTime800');
                    if(data.response.body.items.item[i].category == "T1H") {
                        t.innerHTML = `${data.response.body.items.item[i].fcstValue}도`;
                    }
                    else if(data.response.body.items.item[i].category == "RN1") {
                        rn.innerHTML = `${data.response.body.items.item[i].fcstValue}`;
                    }
                    else if(data.response.body.items.item[i].category == "REH") {
                        re.innerHTML = `${data.response.body.items.item[i].fcstValue}%`;
                    }
                }
                else if(fcstTime == "0900") {
                    const t = document.querySelector('.tTime900');
                    const rn = document.querySelector('.rnTime900');
                    const re = document.querySelector('.reTime900');
                    if(data.response.body.items.item[i].category == "T1H") {
                        t.innerHTML = `${data.response.body.items.item[i].fcstValue}도`;
                    }
                    else if(data.response.body.items.item[i].category == "RN1") {
                        rn.innerHTML = `${data.response.body.items.item[i].fcstValue}`;
                    }
                    else if(data.response.body.items.item[i].category == "REH") {
                        re.innerHTML = `${data.response.body.items.item[i].fcstValue}%`;
                    }
                }
                else if(fcstTime == "1000") {
                    const t = document.querySelector('.tTime1000');
                    const rn = document.querySelector('.rnTime1000');
                    const re = document.querySelector('.reTime1000');
                    if(data.response.body.items.item[i].category == "T1H") {
                        t.innerHTML = `${data.response.body.items.item[i].fcstValue}도`;
                    }
                    else if(data.response.body.items.item[i].category == "RN1") {
                        rn.innerHTML = `${data.response.body.items.item[i].fcstValue}`;
                    }
                    else if(data.response.body.items.item[i].category == "REH") {
                        re.innerHTML = `${data.response.body.items.item[i].fcstValue}%`;
                    }
                }
                else if(fcstTime == "1100") {
                    const t = document.querySelector('.tTime1100');
                    const rn = document.querySelector('.rnTime1100');
                    const re = document.querySelector('.reTime1100');
                    if(data.response.body.items.item[i].category == "T1H") {
                        t.innerHTML = `${data.response.body.items.item[i].fcstValue}도`;
                    }
                    else if(data.response.body.items.item[i].category == "RN1") {
                        rn.innerHTML = `${data.response.body.items.item[i].fcstValue}`;
                    }
                    else if(data.response.body.items.item[i].category == "REH") {
                        re.innerHTML = `${data.response.body.items.item[i].fcstValue}%`;
                    }
                }
            }
            
        }



    })
    document.querySelector('#btn3').addEventListener('click', function() {

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

document.querySelector('#btn4').addEventListener('click', function() {
    const url = 'https://www.naver.com/';
    const option = {
        method : 'get'
    }
    // 비동기를 동기화시킴
    fetch(url, option).then(function(response) {
        return response.json();
    }).then(function(data){
        console.log(data);
    }).catch(function(error){
        console.log(error);
    });
})
