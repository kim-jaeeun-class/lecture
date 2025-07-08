// const con = document.querySelector('#con');

// html 기준 <script></script>까지는 #con이 없어서 null 출력
// console.log(con);

// 이벤트를 주는 방법 1
// window.addEventListener('load', init);

// 이벤트를 주는 방법 2
// 변수여서 하나밖에 못 넣는다는 단점이 존재
window.onload = init;

function init() {
    const con = document.querySelector('#con');
    console.log(con);

    const game = document.querySelector('#game');
    game.style.left = '10px';
    game.style.top = '10px';
    
    bind();
}

// onclick은 변수이기 때문에 마지막 값만 저장
// addEventListener는 계속 동일 이벤트 추가 가능
function bind() {
    const msg = document.querySelector('#con');

    const btn1 = document.querySelector('#btn1');
    btn1.onclick = function () {
        msg.innerHTML += '<br>button1 클릭';
    }
    btn1.onclick = function () {
        msg.innerHTML += '<br>button1 클릭';
    }
    const btn2 = document.querySelector('#btn2');
    btn2.addEventListener('click', function () {
        msg.innerHTML += '<br>button2 클릭'
    })

    // 로그인 버튼을 누를 경우,
    // 아이디와 비밀번호란이 비어있지 않다면
    // 아이디, 비밀번호가 출력되도록
    // 하나라도 비어있다면
    // '아이디/비밀번호는 필수입니다'가 출력되도록

    // 나중에 발전시킬 수 있는지 확인해보기
    // const idCon = document.querySelector('#id').value;
    // const pwCon = document.querySelector('#pw').value;
    const lo = document.querySelector('#login');
    
    // login.onclick = function() {
    //     if((idCon.value != "") && (pwCon.value != "")) {
    //         msg.textContent += idCon.value;
    //         msg.textContent += pwCon.value;
    //     }
    //     else {
    //         msg.innerHTML += '아이디 혹은 비밀번호는 필수입니다';
    //     }
    // }

    // 쌤 답안
//     lo.addEventListener('click', function () {
//         const id = document.querySelector('#id').value;
//         const pw = document.querySelector('#pw').value;
//         if (id == "") {
//             msg.innerHTML += '<br>아이디는 필수입니다'
//         } else if (pw == "") {
//             msg.innerHTML += '<br>비밀번호는 필수입니다'
//         } else {
//             msg.innerHTML += `<br>${id}, ${pw}`;
//         }

//         // debugger;
//     }
// )

    // 위 두 코드 기반으로 발전시킨 것
    lo.addEventListener('click', function () {
    const id = document.querySelector('#id').value;
    const pw = document.querySelector('#pw').value;
    const msg = document.querySelector('#con');

    // Java에서 Scanner 쓸 때 생각나서 이렇게 넣어봤는데 
    // 이러니까 중복으로 안 쌓이는 듯???
    // 그런데 무슨 원리로????? if문에서 쓴 것과 달리 +=가 아니라서?
    msg.innerHTML = '';


    if (id == "" || pw == "") {
        if (id == "") {
            msg.innerHTML += '<br>아이디는 필수입니다';
        }
        if (pw == "") {
            msg.innerHTML += '<br>비밀번호는 필수입니다';
        }
    } else {
        msg.innerHTML += '<br>' + id + ', ' + pw;
    }
});

}

window.addEventListener('resize', function() {
    console.log('resize');
    console.log(window.innerWidth);
})

window.addEventListener('scroll', function() {
    console.log('scroll');
    console.log('scrollTop', document.documentElement.scrollTop)
    // document.documentElement.scrollTop = 140;
})


function btnClick() {
    const msg = document.querySelector('#con');
    msg.innerHTML += '<br>btnClick 실행'
}

document.querySelector('#btnTop').addEventListener('click', function(){
    document.documentElement.scrollTop = 0;
    // window.scrollTo({top: 0, behavior: 'smooth'}});


    // for (let i = document.documentElement.scrollTop; i >= 0; i -= 10) {
    //     let time = (2000 - i) * 10;
    //     setTimeout(function() {
    //         console.log(i, time);
    //         document.documentElement.scrollTop = i;
    //     }, time)
        
    // }

})

// document.querySelector('#id').addEventListener( 'keydown', function() {
document.querySelector('#id').addEventListener( 'keypress', function(event) {
    console.log(event.keyCode);
    if(event.keyCode == 13) {
        console.log('Enter!!!');
        document.querySelector('#pw').focus();
    }
})
document.querySelector('#pw').addEventListener('keyup', function(event) {
    if(event.keyCode == 13) {
        document.querySelector('#login').click();
    }

})

document.querySelector('body').addEventListener('keydown', function() {
    // left(37) / right(39) / top() / bottom
    const game = document.querySelector('#game');
    console.log(game.style.left);
    if(event.keyCode == 37) {
        game.style.left = (parseInt(game.style.left) - 10) +'px';
    }
    else if(event.keyCode == 39) {
        game.style.left = (parseInt(game.style.left) + 10) +'px';
    }
    else if(event.keyCode == 38) {
        game.style.top = (parseInt(game.style.top) - 10) +'px';
    }
    else if(event.keyCode == 40) {
        game.style.top = (parseInt(game.style.top) + 10) +'px';
    }
})

