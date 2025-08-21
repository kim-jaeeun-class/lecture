<!-- HTML 주석 -->
<%-- JSP 주석 --%>
<%-- 디렉티브 태그 : 

    "<%@"로 시작하는 태그 %
    1. page
    2. include

--%>

<%@ 
    page 
    language="java" 
    contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>JSP 연습</title>
<style>
    h1 {
        font-size: 1.1em;
    }
</style>
</head>
<body>
    <%@ include file = "header.jsp" %>
    <h1>jsp.jsp</h1>

        <!-- 스크립틀릿(Scriptlet) -->
    <%
        // java 영역
        System.out.println("test");
    	out.println("<strong>brave</strong>");
    %>

    <table style = "border: 1px dotted darkblue">
        <% for(int i = 0; i < 5; i++) { %>
                <tr>
                    <td>제목</td>
                    <td>내용</td>
                </tr>
        <% } %>
    </table>
    <% 
        int a = 10; 
        String name = request.getParameter("name");
    %>
    a: <% out.println(a); %>
    name: <% out.println(name); %> <br>

    <!-- 표현식 -->
    <%= a %>
    <%= name %>

    <!-- 선언문 -->
    <%!
        String title = "F1";
        String getTitle() {
            return this.title;
        }
    %>

    <div>
        구구단 <br>
        <%
        for(int i = 1; i <= 9; i++) {
            out.println(3 + " * " + i + " = " + (3 * i) + "<br>");
        }
        %>
    </div>
<script>
    console.log("jsp");
</script>
</body>
</html>