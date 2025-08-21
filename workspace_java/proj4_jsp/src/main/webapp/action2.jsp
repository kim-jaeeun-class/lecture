<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Action</title>
</head>
<body>
    <!-- 상대경로, 절대경로 맞추기 필요-->
    <jsp:include page="header.jsp"></jsp:include>
<%--     <jsp:include page="jsp.jsp?name=a"></jsp:include> --%>
    <jsp:include page="jsp1.jsp">
        <jsp:param name="name" value="val" />
    </jsp:include>

    <jsp:forward page="header.jsp" />
</body>
</html>