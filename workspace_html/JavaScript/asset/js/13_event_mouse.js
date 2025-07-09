/* 호이스팅되기 때문에 let view;를 생략해도 문제 X */
let isDown = false;
let mouseX = 0;
let mouseY = 0;

window.onload = function() {
    view = document.querySelector("#view");

    const cursor = document.querySelector("#cursor")
    cursor.style.top = '-1000px';
    cursor.style.left = '0';

    const cursor2 = document.querySelector('#cursor2');
    cursor2.style.top = '0';
    cursor2.style.left = '0';    

    bind();
}

function bind() {
    view.innerHTML = 'hello!<br>';

    document.querySelector('#mouse').addEventListener('mousedown', function(evt) {
        view.innerHTML = 'mousedown 발생<br>' + view.innerHTML;

        // offset : DOM의 좌상단 기준 > offset과 DOM을 이용해 바로 스크롤 가능
        // page : 스크롤에 관계 없이 문서 좌상단 기준
        // client : 지금 보이는 화면 좌상단 기준
        view.innerHTML = `
            ------------------------------<br>
            event.offsetX : ${evt.offsetX}<br>
            event.offsetY : ${evt.offsetY}<br>
            event.pageX : ${evt.pageX}<br>
            event.pageY : ${evt.pageY}<br>
            event.clientX : ${evt.clientX}<br>
            event.clientY : ${evt.clientY}<br>
            ${view.innerHTML}
            `;
    })
    document.querySelector('#mouse').addEventListener('mouseup', function() {
        view.innerHTML = 'mouseup 발생<br>' + view.innerHTML;
    })
    document.querySelector('#mouse').addEventListener('mousemove', function() {
        // view.innerHTML = 'mousemove 발생<br>' + view.innerHTML;
        // view 출력이 길어져서 주석 처리
    })
    // mouseenter와 같음
    document.querySelector('#mouse').addEventListener('mouseover', function() {
        view.innerHTML = 'mouseover 발생<br>' + view.innerHTML;

        document.querySelector('#mouse').style.backgroundColor = '#4e5964';
    })
    // mouseleave와 같음
    document.querySelector('#mouse').addEventListener('mouseout', function() {
        view.innerHTML = 'mouseout 발생<br>' + view.innerHTML;
        document.querySelector('#mouse').style.backgroundColor = '#708090';
    })
    
    document.querySelector('body').addEventListener('mousemove', function(evt) {
        const cursor = document.querySelector('#cursor');

        // 클릭 이벤트가 발생하려면 +1을 적용해줘야 함
        // 없을 경우, 커서 이미지를 클릭하는 상황이 됨
        cursor.style.top = evt.pageY + 1 + 'px';
        cursor.style.left = evt.pageX + 1 + 'px';
    })


    document.querySelector('#drag').addEventListener('mousedown', evt => {
        const drag = document.querySelector('#drag');

        drag.style.top = evt.clientY + evt.offsetY + 'px';
        drag.style.left = evt.clientX + evt.offsetX + 'px';

        // 콜백함수용으로 하나 만들어두기
        const move = evt => {
            drag.style.top = evt.clientY + 'px';
            drag.style.left = evt.clientX + 'px';            
        }

        document.addEventListener('mousemove', move);

        document.addEventListener('mouseup', () => {
            document.removeEventListener('mousemove', move);
        })
    })

    // 위 드래그 쌤 코드 버전으로
    document.querySelector('#cursor2').addEventListener('mousedown', function(evt) {
        isDown = true;
        mouseX = evt.pageX;
        mouseY = evt.pageY;
    })
    document.querySelector('#cursor2').addEventListener('mousemove', function(evt) {
        if(isDown) {
            const cursor = document.querySelector('#cursor2');

            cursor.style.top = (parseInt(cursor.style.top) + (evt.pageY - mouseY)) + 'px';
            cursor.style.left = (parseInt(cursor.style.left) + (evt.pageX - mouseX)) + 'px';
        
            mouseX = evt.pageX;
            mouseY = evt.pageY;
        }
    })

}