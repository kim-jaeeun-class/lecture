// window.addEventListener('load', ()=>{}) 아래의 jQuery와 같은 의미
$(() => {
    init()
    bind()
})
function init() {
    const list_h1 = $('h1');
    // jQuery 배열 객체
    console.log(list_h1);
    // pure jsi
    console.log(list_h1[0]);
    // 아무것도 없으면 0개짜리 배열이 옴
    console.log($('#human'));

    $('h1').text('. 앞 부분 = querySelectorAll, text() = innerText');
    // html() = innerHTML
    $('h1').html('<a href="javascript:void(0)">a tag</a>');

    console.log($('#parent'));

    // 클래스 추가 : id가 parent인 곳에 class c1, c2, c3 추가
    $('#parent').addClass('c1');
    $('#parent').addClass('c2 c3');
    // 클래스 삭제 : c1, c2 삭제
    $('#parent').removeClass('c1 c2');
    // 토글 : 클래스가 있으면 제거, 없으면 추가
    $('#parent').toggleClass('c2');
    // 클래스 확인 : 현재 해당 클래스가 있는지 확인 (true/false로)
    console.log($('#parent').hasClass('c2'));
    // 속성값 가져오기 : .attr() = getAttribute()
    let human = $('#chk').attr('data-human');
    console.log(human);
    // 전달인자가 2개면 : .attr() = setAttribute()
    $('#chk').attr('data-human', '123');
    $('#chk').attr('data-game', 'newGame');

    // data-속성에서 속성명만 사용하면 하위 속성을 가져옴
    console.log($('#chk').data('game'));
    // html 수정 없이 추가 가능 개발자 도구에서 확인 불가한 속성 추가(나중에 따로 한 번 더 확인하기)
    $('#chk').data('dinner', 'stew');
    console.log($('#chk').data('dinner'));

    // 속성 삭제 : removeAttr() = removeAttribute()
    $('#chk').removeAttr('data-game');

    // 속성 추가 : $() 내에 태그 넣기 = createElement
    let child2 = $('<div>child2</div>');
    // child2[0]은 pure js라 append 가능
    console.log(child2[0]);

    // 자식의 마지막에 요소 추가
    $('#parent').append(child2);
    $('#parent').prepend('<div class = "child3">child3</div>');
    $('parent').after('<div id = "parent2">after 테스트용 parent2</div>')
    $('parent').before('<div id = "parent3">before 테스트용 parent3</div>')

    // 내용 비우기 $('#parent')[0].innerHTML = ""; $('#parent').html('');
    $('#parent').empty();

    // tag 삭제 : html 자체 삭제
    $('#parent').remove();

    // CSS 적용
    $('#input1').css('backgroundColor', 'coral')

    // DOM에 적용된 실제 CSS 값 읽기
    console.log($('#input1').css('backgroundColor'));
    console.log($('#input1').css('fontSize'));
    console.log($('#input1').width());
}
function bind() {
    // $('#btn1').on = document.querySelector.addEventListener()
    // $('#btn1').click(function(){})
    $('#btn1').on('click', function(event) {
        console.log( this === event.currentTarget );
        console.log($('#input1').val());
        $('#input1').val('input1 value is changed');
        console.log($('#input1').val());
        $('#chk')

        //  값 바꾸기

        // checked 여부 확인
        console.log($('#chk').prop('checked'));
        // checked 값 바꾸기
        $('#chk').prop('checked', true)
    })
    $('.btn').on('click', function(event) {
        console.log('버튼');
        console.log(event.target);
        console.log(this);

        bind();
    })
    // .btn의 클릭 이벤트 삭제
    $('.btn').off('click');
    // 이벤트종류.식별자로 bind 후,
    // 이벤트종류.식별자로 특정 이벤트만 unbind 가능
    $('.btn').on('click.dom', function() {
        console.log('dom button');
    });
    $('.btn').on('click.ajax', function() {
        console.log('ajax button');
    })
    $('.btn').off('click.ajax');

    $('#parent10').on('click', function(event) {
        console.log(this);
        console.log(event.target);

        // 자식 중에서 찾기
        // $('#parent10')[0].querySelector =
        $('#parent10').find('.child10');
        // 부모로 올라가기
        // $('#parent10').parentNode
        $('#parent10').parent();
    })
    $('.child10').on('click', function(event) {
        console.log(this);
        console.log(event.target);
        return false;
    })
    $('#btn3').on('click', ()=> {
        // 애니메이션 효과
        // $('.child10').fadeToggle();
        // $('.child10').hide();
        // $('.child10').show();
        // $('.child10').slideToggle();
        $('.child10').animate({
            width: '300px',
            height: '+=10px'
        })
    })
}