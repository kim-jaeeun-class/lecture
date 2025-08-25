<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<c:if test="${login ne true}">
	<c:redirect />
</c:if>

<!DOCTYPE html>
<html>
    <head>
        <meta charset="UTF-8">
        <title>JSTL</title>
    </head>
    <body>
        <c:set var="a" value="10" />
        <br>\${a} : ${a}
        <%
            String name = "human";
        %>
        <c:set var="name2" value="<%= name %>" />
        <c:set var="name3" value="${a}" />
        <br>\${name} : ${name}
        <br>\${name2} : ${name2}
        <br>\${name3} : ${name3}
        <br><hr><br>
        <c:set var="a1" value="1" scope="page" />
        * scope를 생략하면 page로 설정됨<br>
        * scope: page > request > session > application<br>

        <c:set var="game" value="lol" scope="page" />
        <c:set var="game" value="mabinogi" scope="request" />
        <c:set var="game" value="suddenattack" scope="session" />
        <c:set var="game" value="sevenknights" scope="application" />
        \${game} : ${game}

        <br>pageScope : ${pageScope.game}
        <br>requestScope : ${requestScope.game}
        <br>sessionScope : ${sessionScope.game}
        <br>applicationScope : ${applicationScope.game}

<%--    <jsp:forward page="jstl4-1.jsp" /> --%>

        <br><hr><br>
        <c:if test="true">
            always true<br>
        </c:if>
        <c:if test="${a eq 10}">
            'a = 10' is true<br>
        </c:if>
        <%-- <c:if test="${a ne 10}"> --%>
        <c:if test="${not(a eq 10)}">
            'a = 10' is not true<br>
        </c:if>
        <c:choose>
            <c:when test="a eq 8">
                a = 8
            </c:when>
            <c:when test="a eq 9">
                a = 9
            </c:when>
            <c:otherwise>
                a != 8 and a != 9
            </c:otherwise>
        </c:choose>

        <%
            List list = new ArrayList();
            for(int i = 0; i < 6; i++) {
                Map map = new HashMap();
                map.put("title", "music"+i);
                map.put("artist", "artist"+i);

                list.add(map);
            }
        %>
        <c:set var="list2" value="<%= list %>" scope="page" />
        <br>첫 번째 제목 : ${list2[0].title}
        <br>첫 번째 가수명 : ${list2[0].artist}

        <c:forEach var="song" items="${list2}">
            <br>title: ${song.title}
            <br>singer: ${song.artist}
        </c:forEach>
        <hr>
        <c:forEach var="i" begin="0" end="5" step="2">
            <br>title: ${list2[i].title}
            <br>singer: ${list2[i].artist}
        </c:forEach>
        <hr>
        <c:forEach var="i" begin="0" end="5" step="2" varStatus="loop">
            ${i}
            <c:if test="${not loop.last}">
            ,
            </c:if>
            <br>title: ${list2[i].title}
            <br>singer: ${list2[i].artist}
            <br>loop.index : ${loop.index}
            <br>loop.count : ${loop.count}
            <br>loop.first : ${loop.first}
            <br>loop.last : ${loop.last}
            <br>
        </c:forEach>

        * items, begin 등 동시 사용
        <c:forEach var="song" items="${list2}" begin="1" end="2">
            <br>${song.title}
        </c:forEach>
        <hr>
        * if 사용
        <c:forEach var="i" begin="2" end="9">
            <c:if test="${i != 5}">
                <c:forEach var="j" begin="1" end="9">
                    <br>${i} * ${j} = ${i * j}
                </c:forEach>
            </c:if>
            <br>
        </c:forEach>
        <hr>
        * choose 사용
        <c:forEach var="i" begin="2" end="9">
            <c:choose>
                <c:when test="${i != 5}">
                    <c:forEach var="j" begin="1" end="9">
                        <br>${i} * ${j} = ${i * j}
                    </c:forEach>
                </c:when>
            </c:choose>
            <br>
        </c:forEach>
        <hr>
        <br>* c:url
        <c:url var="url1" value="j/sp1.jsp">
            <c:param name="name" value="vvvv" />
        </c:url>
        <br><a href="${url1}">jsp1.jsp</a>
        <br>&nbsp;&nbsp;&nbsp;&nbsp;사용하는 이유
        <br>&nbsp;&nbsp;&nbsp;&nbsp; 1. 영어나 숫자 외 한글, 특수 문자가 encoding됨
        <br>&nbsp;&nbsp;&nbsp;&nbsp; 2. Context path 자동 추가
        <br>&nbsp;&nbsp;&nbsp;&nbsp; 3. 쿠키 금지일 때
        <hr>
        <br>param.addr \${param.addr}
        <br>c: out =<c:out value="${param.addr}" />
        <br>* 특수 문자를 사용해 문자 그 자체로 출력
    </body>
</html>