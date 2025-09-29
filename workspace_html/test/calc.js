// ================
// 숫자 클릭
// ================
document.querySelector(".number").addEventListener("click", () => {
    // if로 숫자별로 분기 주는 건... 너무 노가다인가?
    // 기존 숫자 있으면 concat 같은 걸로 더해서 input에 뜨게 하는 느낌

    const one = document.querySelector("#one");
    const two = document.querySelector("#two");
    const three = document.querySelector("#three");
    const four = document.querySelector("#four");
    const five = document.querySelector("#five");
    const six = document.querySelector("#six");
    const seven = document.querySelector("#seven");
    const eight = document.querySelector("#eight");
    const nine = document.querySelector("#nine");

    // 여기에 AddEventListener 추가 안 하고
    // id명으로 if 조건 주고 싶은데...
    // 애초에 addEventListener 안에 addEventListener 할 거면
    // 그냥 이렇게 안 묶었다...

    // input이면 name이나 value를 따올 수 있는데
    // 그냥 단순 div로도 해도 괜찮은지 모르겠다

})


// ================
// 사칙연산 클릭
// ================
.document.querySelector(".btn").addEventListener("click", () => {
    // 의외로 고민인 버튼...
    // 기존 숫자 입력값, 사칙연산 버튼 누른 후의 숫자 입력값을
    // 구분해서 합계를 내는 방법

    // 여기 안에서 다시 상단의 .number용 클릭 이벤트를 이용해서
    // 그 값을 받은 다음에... 걔로 더하면 되나???
    // input 창에 보이게 하는 건 number 클릭 이벤이랑
    // 같은 맥락으로 진행할 수 있지만
    // 그 concat된 걸 따로 저장해둘 방법도 고민해야 함

    // 저장이 아니라 = 클릭할 때 split으로 받아오기가 나은 듯
})

// ================
// = 클릭
// ================
.document.querySelector(".equal").addEventListener("click", () => {

})
