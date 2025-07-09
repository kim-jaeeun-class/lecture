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
    document.querySelector('#form').addEventListener('submit', event => {
            // html 태그의 기본 기능을 막아줌
            event.preventDefault();

            const value = document.querySelector('#keyword').value;

            if(value.trim().length < 2) {
                alert('검색어는 두 글자 이상 입력해주세요.');
            }
            else {
                document.querySelector('#form').submit();
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

    const select = () => {
        let checked = [];
        checked = document.querySelector('.check').value;
        // 써야 하는 건 아는데 머리가 안 돌아감...
        // 집 가서라도 추가시키기... 아니면 내일.

        console.log(checked);

        document.querySelector('.list').innerHTML = '선택 토핑 목록 : '
        if(checked != '') {
            document.querySelector('.list').innerHTML += checked; 
        }
    }

    addEventListener('click', select);
}
