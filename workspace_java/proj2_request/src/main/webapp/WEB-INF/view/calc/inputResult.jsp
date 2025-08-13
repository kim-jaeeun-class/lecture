<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>inputResult</title>
    </head>
    <body>
        <h1>계산 결과</h1>

        <!-- 아래의 %는 java 영역-->
        결과 : 
        <strong>
            <%
                int num3 = (int)request.getAttribute("number3");
                out.println(num3);
            %>            
        </strong>
    </body>
</html>