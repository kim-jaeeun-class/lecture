window.addEventListener('load', bind);

function bind() {
    document
        .querySelector('#keyword')
        .addEventListener('focus', () => {
            document
                .querySelector('#keyword')
                .style
                .backgroundColor = '#e3e4e6';
        })
    document
        .querySelector('#keyword')
        .addEventListener('blur', () => {
            document
                .querySelector('#keyword')
                .style
                .backgroundColor = '';
        })
    document
        .querySelector('#keyword')
        .addEventListener('input', () => {
            const r = parseInt(Math.random() * 256);
            const g = parseInt(Math.random() * 256);
            const b = parseInt(Math.random() * 256);
            const a = Math.random() * 256;

            document
                .querySelector('#keyword')
                .style
                .color = `rgba(${r},${g},${b},${a})`;
        })

    document
        .querySelector('#site')
        .addEventListener('change', () => {

            const value = document
                .querySelector('#site')
                .value;
            const form = document.querySelector('#form');

            if (value == 1) {
                // naver
                form.setAttribute('action', 'https://search.naver.com/search.naver');
            } else if (value == 2) {
                // google
                form.setAttribute('action', 'https://www.google.com/search');
            }
        })
    document
        .querySelector('#form')
        .addEventListener('submit', event => {
            // html 태그의 기본 기능을 막아줌
            event.preventDefault();

            const value = document
                .querySelector('#keyword')
                .value;

            if (value.trim().length < 2) {
                alert('검색어는 두 글자 이상 입력해주세요.');
            } else {
                document
                    .querySelector('#form')
                    .submit();
            }
        })

    addEventListener('copy', (event) => {
        event.preventDefault();
        alert('복사 금지');
    })

    addEventListener('selectstart', event => {
        event.preventDefault();
    })

    // 여기서부터 문제 파트!!!
    // select : 선택한 토핑 목록을 출력
    const select = () => {
        // 모든 토핑 체크박스를 가져옴
        // 속성으로 가져오려면 [type=값]으로... 나중에 써보기
        const checkboxes = document.querySelectorAll('.check');
        const checked = []; // 선택 토핑 저장 배열

        // 반복문으로 이렇게도 가능(난 forEach로 넣어둠)
        // let checked = document.querySelectAll('check:checked');
        // for(let i = 0; i < checked.length; i++) {
        //     if(checked[i].checked==true) {
        //         console.log(checked[i].value);
        //     }
        // }

        // 각 checkbox가 선택되었는지 확인
        checkboxes.forEach(checkbox => {
            if (checkbox.checked) {
                checked.push(checkbox.value); // 선택 항목만 배열에 저장
            }
        });

        // 출력 영역 초기화 후, 선택된 토핑 표시
        const list = document.querySelector('.list');
        list.innerHTML = '선택 토핑 목록 : ';
        if (checked.length > 0) {
            list.innerHTML += checked;
        }
    };

    // '선택' 버튼 클릭 시 select 실행.
    document
        .querySelector('#selectBtn')
        .addEventListener('click', select);

    // 전체 선택 체크박스를 가져오기
    const checkAll = document.querySelector('.checkAll');

    // 모든 개별 체크박스들을 가져오기
    const checks = document.querySelectorAll('.check');

    // 전체 선택을 클릭했을 때의 처리
    checkAll.addEventListener('change', () => {
        // 전체 선택이 체크되어 있으면 true, 아니면 false
        const checked = checkAll.checked;

        // 모든 개별 체크박스의 상태를 동일하게 설정
        checks.forEach(checkbox => {
            checkbox.checked = checked;
        });
    });

    // 개별 체크박스를 클릭했을 때의 처리
    checks.forEach(checkbox => {
        checkbox.addEventListener('change', () => {
            // 현재 체크된 개수 세기
            let count = 0;

            checks.forEach(cb => {
                if (cb.checked) 
                    count++;
                }
            );

            // 전체 개수와 체크된 개수가 같으면 전체 선택도 체크
            // 아니면 전체 선택 해제
            if (count == checks.length) {
                checkAll.checked = true;
            } else {
                checkAll.checked = false;
            }
        });
    });

    // callback을 화살표 함수로 하면,
    // this는 여전히 window로 유지
    document.querySelector('#parent').addEventListener('click', function(event) {
        console.log('부모 클릭');
        // event가 발생한 DOM을 알려줌
        console.log('event.target 확인 : ', event.target);
        // event가 적용된 DOM
        console.log('event.currentTarget 확인 : ', event.currentTarget);
        console.log(this === event.currentTarget);

        console.log('event.target.parentNode : ', event.target.parentNode);
    }, true)
    // document.querySelector('#child1').addEventListener('click', function() {
    //     // 전파 방지. 부모로 전달되는 이벤트 중지
    //     // event.stopPropagation()
    //     console.log('자식1 클릭');
    //     // event 내의 this는 더 이상 window가 아님
    //     // 고로 js에서 this는 정체를 알 때만 사용
    //     console.log('child 내부', this);
    // })

    // this : window 객체를 보유 & window 그 자체

    console.log('밖', this);
    console.log('밖', this === window);
}
