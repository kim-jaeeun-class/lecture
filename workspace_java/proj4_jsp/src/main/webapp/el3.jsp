<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>EL</title>
    </head>
    <body>
        ${10}
        <br>위의 10은 아래 코드처럼 작성함<br>
        \${10}
        <!-- 글씨가 있는지 표시하기 위해서 []나 원하는 다른 기호를 사용 가능 -->
        [${null}]
        ${10/4}
        <br>
        ${10 div 4}
        <br>
        div : 나누기 기호
        <br>
        [${10%4}]
        <br>
        ${10 mod 4}
        <br>mod : 나머지 기호
        ${10==4} and ${"a"=="a"}
        <br>==으로 tf 확인 가능. ==는 eq로 대체 가능.
        <br>
        ${"a" ne "a"}
        <br> !=는 ne로 나타낼 수 있음
        el은 계산 시, 문자를 숫자로 바꿈. 고로 문자 사용 시 따옴표 여부와 관계 없이 numberformat 오류 발생.
        <br> \${not("a" eq "a")} 이런 사용도 가능
        <br> \${100 > 10} = \${100 gt 10}
        <br> \${100 < 10} = \${100 ls 10}
        <br> \${"abc" < "abd"} : true로 출력(글씨 비교 가능)
        <br> \${100 >= 10} = \${100 ge 10} 
        <br> \${100 <= 10} = \${100 le 10}
        <br> \${(100 <= 10) eq "false"} : true로 출력됨
        <br> \${ (100 > 10) && (7 != 3)} = \${ (100 > 10) and (7 != 3)}
        <br> \${ (100 > 10) || (7 != 3)} = \${ (100 > 10) or (7 != 3)}
        <br>

        <hr>

        <br>\${empty "글씨"}
        <br>\${empty "null"} : ${empty "null"}
        <br>\${empty ""} : ${empty ""}
        <br>empty는 출력할 것이 있으면 false, 없으면 true로 나옴
        <br><br>
        request.getParameter("a") : <%= request.getParameter("a")%>
        <br>\${param.a} : ${param.a}
        <br>\${param.b} : [${param.b}]
        <br>\${paramValues.a[0]} : ${paramValues.a[0]}
        <br>\${paramValues.a[110]} : ${paramValues.a[110]}
        <br>
        <hr>
        <br>
        <br>request.getAttribute("a") : <%= request.getAttribute("a") %>
        <br>\${a} : ${a}
        <br>\${b} : *${b}*
        <br>\${list} : ${list}
        <br>\${list[0]} : ${list[0]}
        <br>\${arr} : ${arr}
        <br>\${arr[0]} : ${arr[0]}
        <br>\${map} : ${map}
        <br>\${map["k1"]} : ${map["k1"]}
        <br>\${map.k1} : ${map.k1}
        <br><hr><br>
        <br>\${dto} : ${dto}
        <br>\${dto.ename} : ${dto.ename}
        <script>
            const count = 3;
            const sum = 30;
            // 역슬래시 작성하지 않으면 내용이 보이지 않음
            console.log(`합은 \${sum}이고 개수는 \${count}`);
        </script>
    </body>
</html>