window.addEventListener('load', bind);

function bind() {

    // 1번 문제 js!!!
    document.querySelector('#firstBtn').addEventListener('click', function() {
        const firstIn = document.querySelector('#firstIn').value;
        const firstView = document.querySelector('#first');

        firstView.innerText += firstIn;
    });


    // 2번 문제 js!!!
    // 2번 문제 풀이용 value값 읽을 변수 설정
    const secInName = document.querySelector('#inName').value;
    const secInAdd = document.querySelector('#inAdd').value;
    const secInNum = document.querySelector('#inNum').value;
    // 2번 문제 풀이용 배송 정보 value값 변경용 변수 설정
    const secViewName = document.querySelector('#delName').value;
    const secViewAdd = document.querySelector('#delAdd').value;
    const secViewNum = document.querySelector('#delNum').value;


    // 3번 문제 js!!!
    // 메뉴별 변수 지정
    const thirdM1 = document.querySelector('#thirdM1');
    const thirdM2 = document.querySelector('#thirdM2');
    const thirdM3 = document.querySelector('#thirdM3');
    const thirdM4 = document.querySelector('#thirdM4');


    // 4번 문제
    // 이미지 지정용 변수 설정
    const origPic = document.querySelector('#fourthPic');


    // 5번 문제
    // pizzaMenu(사이즈) value 읽어들일 배열 생성
    const pizzaSize = [];
    pizzaSize = document.querySelectorAll('[name = "pizzaMenu"]')
    // topping value 읽어들일 배열 생성
    const topping = [];
    topping = document.querySelectorAll('[name = "topping"]');
    // dough value 읽어들일 배열 생성
    const dough = [];
    dough = document.querySelectorAll('[name = "dough"]');


    // 6번 문제
    
}