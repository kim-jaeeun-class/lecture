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
    // 선택한 토핑 목록을 출력
    const select = () => {
        // 모든 토핑 체크박스를 가져옴 (NodeList)
        const checkboxes = document.querySelectorAll('.check');
        const checked = []; // 선택된 토핑을 저장할 배열

        // 각 checkbox가 선택되었는지 확인
        checkboxes.forEach(checkbox => {
            if (checkbox.checked) {
                checked.push(checkbox.value); // 선택된 항목만 배열에 저장
            }
        });

        // 출력 영역 초기화 후, 선택된 토핑 표시
        const list = document.querySelector('.list');
        list.innerHTML = '선택 토핑 목록 : ';
        if (checked.length > 0) {
            list.innerHTML += checked.join(', '); // 쉼표로 구분해 출력
        }
    };

    // '선택' 버튼 클릭 시 select 함수 실행. 정확한 버튼만 선택하기 위해 id 추가 필요 (HTML에서 <input>에 id="selectBtn" 부여)
    document
        .querySelector('#selectBtn')
        .addEventListener('click', select);

    // ✅ 전체 선택 체크박스를 가져오기
const checkAll = document.querySelector('.checkAll');

// ✅ 모든 개별 체크박스들을 가져오기
const checks = document.querySelectorAll('.check');

// ✅ 전체 선택을 클릭했을 때의 처리
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
            if (cb.checked) count++;
        });

        // 전체 개수와 체크된 개수가 같으면 전체 선택도 체크
        // 아니면 전체 선택 해제
        if (count == checks.length) {
            checkAll.checked = true;
        } else {
            checkAll.checked = false;
        }
    });
});
}
