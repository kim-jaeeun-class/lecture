window.addEventListener('load', bind);

function bind() {

    // 1번 문제 js!!!
    document.querySelector('#firstBtn').addEventListener('click', function() {
        const firstIn = document.querySelector('#firstIn').value;
        const firstView = document.querySelector('#firstView');

        firstView.innerHTML += firstIn + '<br>';
    });


    // 2번 문제 js!!!
    // 2번 문제 풀이용 value값 읽을 변수 설정
    // 체크박스 요소 가져오기
    const copyChk = document.querySelector('.secondInForm input[type="checkbox"]');

    // 체크박스에 이벤트!
    copyChk.addEventListener('change', function () {
        // 체크되었는지 확인
        if (this.checked) {
            // 주문자 정보를 현재 시점의 값으로 읽어와 복사
            document.querySelector('#delName').value = document.querySelector('#inName').value;
            document.querySelector('#delAdd').value = document.querySelector('#inAdd').value;
            document.querySelector('#delNum').value = document.querySelector('#inNum').value;
        } else {
            // 체크 해제되면 배송 정보 초기화 (선택 사항)
            document.querySelector('#delName').value = '';
            document.querySelector('#delAdd').value = '';
            document.querySelector('#delNum').value = '';
        }
    });



    // 3번 문제 js!!!

    // 어제 문제처럼 메뉴 우선 다 뽑아오기
    const menus = document.querySelectorAll('.menuChild');

    // 메뉴마다 클릭 이벤트!
    for (let i = 0; i < menus.length; i++) {
        menus[i].addEventListener('click', function () {
            // 모든 메뉴에서 강조 제거한 뒤에
            // forEach로도 가능
            for (let j = 0; j < menus.length; j++) {
                menus[j].classList.remove('active');
            }

            // 클릭한 메뉴에만 강조 클래스 추가
            // console.log(this); 지금 this는 menuChild
            this.classList.add('active');
        });
}


    // 4번 문제
    // 이미지 확대 이벤트

    // 확대할 이미지랑 확대한 걸 보여줄 박스
    const imgZoom = document.querySelector('.imgZoom');
    const result = document.querySelector('#result');

    // 확대 배율. 우선 2배로.
    const zoomScale = 2;  

    // 확대 박스의 너비와 높이. offset으로 해도 되나???
    const zoomWidth = result.offsetWidth;
    const zoomHeight = result.offsetHeight;

    // 배경 이미지 URL을 변수에 미리 저장
    // css나 html에 넣어서 쓰려고 하니까 제대로 안 나온다 왜???
    const bgImgUrl = "url('https://www.sanrio.co.jp/wp-content/uploads/2022/06/gallery-pochacco4.png')";

    // 마우스가 이미지 위로 들어올 때 확대 박스 보이기
    // 그 전까지는 none
    // 나갈 때 다시 none로 만듦
    imgZoom.addEventListener('mouseover', () => {
        result.style.display = 'block';
    });
    imgZoom.addEventListener('mouseout', () => {
        result.style.display = 'none';
    });

    
    // 이미지에서 mousemove 시,
    // 확대 박스 위치 및 배경 이미지 조절
    imgZoom.addEventListener('mousemove', (e) => {
        // 현재 이미지 영역 너비, 높이
        const width = imgZoom.clientWidth;
        const height = imgZoom.clientHeight;

         // 마우스 위치 : 이미지 영역 기준으로 계산
        let x = e.clientX - imgZoom.getBoundingClientRect().left; // 위치는 그대로 쓰되
        let y = e.clientY - imgZoom.getBoundingClientRect().top;

        // 마우스 움직이다보니 좀 이상해서 우선 넣어봄
        // 왜 되냐????
        if (x < 0) {
            x = 0};
        if (y < 0) {
            y = 0};
        if (x > width) {
            x = width};
        if (y > height) {
            y = height};
        
        // 확대 박스 위치... 대충 마우스 위치 기준으로 되도록.
        let left = x - zoomWidth / 2;
        let top = y - zoomHeight / 2;
        
        // 확대 박스 이미지 밖으로 안 나가게.
        // if (left < 0) {
        //     left = 0};
        // if (top < 0) {
        //     top = 0};
        // if ((left + zoomWidth) > width) {
        //     left = width - zoomWidth};
        // if ((top + zoomHeight) > height) {
        //     top = height - zoomHeight};

        // 확대 박스 위치
        result.style.left = left + 'px';
        result.style.top = top + 'px';

        // 확대 배율에 맞춰 배경 이미지 크기 계산
        const bgWidth = width * zoomScale;
        const bgHeight = height * zoomScale;

        // 배경 이미지 위치 조절 
        // 마우스 위치에 맞게 확대된 이미지에서 보여질 부분 이동
        const bgPosX = -x * zoomScale + zoomWidth / 2;
        const bgPosY = -y * zoomScale + zoomHeight / 2;

        // 확대 박스에 배경 이미지 넣기
        result.style.backgroundImage = bgImgUrl;
        // 크기
        result.style.backgroundSize = `${bgWidth}px ${bgHeight}px`;
        // 위치
        result.style.backgroundPosition = `${bgPosX}px ${bgPosY}px`;
    });



    // 5번 문제 js!!!

    // 버튼
    const fifthBtn = document.querySelector('#fifthBtn');

    // 출력(view)
    const fifthView = document.querySelector('.fifthView .view');
    const fifthSum = document.querySelector('.fifthView .sum');

    // 버튼 클릭 시
    fifthBtn.addEventListener('click', function () {
        // 1. 사이즈 선택
        const sizeRadios = document.querySelectorAll('[name="pizzaMenu"]');
        let size = '';
        let sizePrice = 0;
        // 수퍼 파파스 기준... 먹고 싶다.
        for (let i = 0; i < sizeRadios.length; i++) {
            if (sizeRadios[i].checked) {
                size = sizeRadios[i].parentNode.textContent;
                if (sizeRadios[i].value === '1') sizePrice = 19900;
                else if (sizeRadios[i].value === '2') sizePrice = 28500;
                else if (sizeRadios[i].value === '3') sizePrice = 33900;
                else if (sizeRadios[i].value === '4') sizePrice = 42500;
            }
        }

    // 2. 토핑 선택
    const toppingChecks = document.querySelectorAll('[name="topping"]');
    let toppingList = '';
    let toppingCount = 0;

    for (let i = 0; i < toppingChecks.length; i++) {
        if (toppingChecks[i].checked) {
            toppingList += toppingChecks[i].parentNode.textContent + ' ';
            toppingCount++;
        }
    }
    // 대충 2000으로 맞춤
    let toppingPrice = toppingCount * 2000;

    // 3. 도우 선택
    const doughSelect = document.querySelector('[name="doughAll"]');
    const dough = doughSelect.options[doughSelect.selectedIndex].text;
    // 씬이랑 기본은 0원
    let doughPrice = 0;

    if (doughSelect.value === '3') doughPrice = 5000;
    else if (doughSelect.value === '4') doughPrice = 5000;
    else if (doughSelect.value === '5') doughPrice = 5000;

    // 총액 변수
    const total = sizePrice + toppingPrice + doughPrice;

    // 결과
    fifthView.innerHTML = 
                        ':: 수퍼 파파스 :: <br>' +
                        ' 사이즈: ' + size + '<br>' +
                        ' 토핑: ' + toppingList + '<br>' +
                        ' 도우: ' + dough + '<br>';
    fifthSum.innerHTML = '총액: ' + total + '원';
});


    // 6번 문제
    // 입력 버튼 부분
    document.querySelector('#sixthBtn').addEventListener('click', function () {
        // 입력값 원본
        const input = document.querySelector('#sixthInput');
        // 입력값 공백 없애기
        const value = input.value.trim();

        // 조건 : 안 비었으면 추가시키기
        if (value !== '') {
            // 선언
            const table = document.querySelector('.sixthView');
            const newRow = document.createElement('tr');

            // 새 행 추가시키기
            newRow.innerHTML = `
                <td class="viewChk">
                    <input type="checkbox" name="finished">
                </td>
                <td class="viewTdInfo">${value}</td>
                <td class="viewDelete">
                    <input type="checkbox" name="delete">
                </td>
                <td class="viewDelBtn">
                    <input type="button" id="viewDelBtn" class="button" name="viewDelBtn" value="삭제">
                </td>
            `;

            // 자식 요소로.
            // append 써도 문제없이 돼서
            // appendChild에서 수정해둠
            table.append(newRow);
            // 진짜 혹시 모르니 넣어둠
            input.value = '';

            // 삭제 버튼 (테이블, 개별)
            // ***** 오늘 자 하이라이트 : document로 줄 생각 하지 말기....
            newRow.querySelector('#viewDelBtn').addEventListener('click', function(event) {
                const test = event.target.parentNode;
                // 이걸로 tr을 잡을 수 있음
                // console.log(test.parentNode);
                // 문제점 : 맨 앞 하나만 remove됨 -> 해결함
                // 아래처럼 confirm을 써서 삭제 전 확인 메시지 띄우기 가능
                const isDel = confirm('정말로 삭제하시겠습니까?');
                if(isDel) {
                    test.parentNode.remove();
                }
            })
        }
    });
        // 위 코드로 그냥 합침
        // // 1열 : 완료 체크박스
        // // td 만들기
        // const tdChk = document.createElement('td');
        // // td 클래스명
        // tdChk.className = 'viewChk';
        // // input 만들기
        // const chkBox = document.createElement('input');
        // // 체크박스 타입으로
        // chkBox.type = 'checkbox';
        // // name 속성
        // chkBox.name = 'finished';
        // // 자식으로 체크박스 만들기
        // tdChk.appendChild(chkBox);

        // // 2열 : 할 일 내용
        // // td 만들기
        // const tdInfo = document.createElement('td');
        // // 클래스명
        // tdInfo.className = 'viewTdInfo';
        // // 값 넣기
        // tdInfo.textContent = value;

        // // 3열 : 삭제 체크박스
        // // td 만들기
        // const tdDelete = document.createElement('td');
        // // 클래스명
        // tdDelete.className = 'viewDelete';
        // // 완료 표시랑 동일함
        // const delBox = document.createElement('input');
        // delBox.type = 'checkbox';
        // delBox.name = 'delete';
        // tdDelete.appendChild(delBox);

        // 완료 체크하면 취소선
        document.querySelector('.sixthView').addEventListener('change', function (event) {
            if (event.target.name === 'finished') {
                // 체크 되어있으면 취소선 넣기
                const td = event.target.closest('tr').querySelector('.viewTdInfo');
                td.style.textDecoration = event.target.checked ? 'line-through' : 'none';
            }

            // 전체 선택 버튼 만들려다가 만 것
            if (event.target.name === 'delete') {
                const delBoxes = document.querySelectorAll('.sixthView input[name="delete"]');
                const allBox = document.querySelector('#deleteAll');

                // 삭제 박스 개수 count
                let checkedCount = 0;
                for (let i = 0; i < delBoxes.length; i++) {
                    if (delBoxes[i].checked) checkedCount++;
                }

                // allBox.checked = (checkedCount === delBoxes.length && delBoxes.length > 0);
            }
        });

    // 추가하기는 다 합쳐버려서 여기도 주석
    //     // 행에 td(열)들 추가시키기
    //     tr.appendChild(tdChk);
    //     tr.appendChild(tdInfo);
    //     tr.appendChild(tdDelete);

    //     // 위의 tr을 표에 추가하기
    //     document.querySelector('.sixthView').appendChild(tr);
    //     // 여기에서도 이게 되네...
    //     input.value = '';
    // });

    // 삭제 버튼!!! (상단, 체크박스로 일괄 삭제 가능)
    document.querySelector('#sixthDelBtn').addEventListener('click', function () {
        const delBoxes = document.querySelectorAll('.sixthView input[name="delete"]');
        // const delState = [];

        for (let i = 0; i < delBoxes.length; i++) {
            if (delBoxes[i].checked) {
                // closest 써도 되지만 아래처럼 표현 가능
                // delBoxes[i].closest('tr').remove();
                delBoxes[i].parentNode.parentNode.remove();
            }
        }

        // // 삭제 후 전체 선택 박스 해제
        // document.querySelector('#deleteAll').checked = false;
    });

    // // 전체 삭제 체크박스 기능
    // document.querySelector('#deleteAll').addEventListener('click', function () {
    //     const isChecked = this.checked;
    //     const delBoxes = document.querySelectorAll('.sixthView input[name="delete"]');

    //     for (let i = 0; i < delBoxes.length; i++) {
    //         delBoxes[i].checked = isChecked;
    //     }
    // });

}