<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>구구단 결과</title>
</head>
<body>
    <div>
        <h1>결과</h1>
    </div>
    <div>
        <%
            int[] result = (int[])request.getAttribute("result");
        	int num = (int)request.getAttribute("num");
            if(result != null) {
                out.println("구구단 결과");
                int i = 1;
                for(int n: result) {
                    out.println("<br>" + num + " * " + i + " = " + n);
                    i++;
                }
            }
        %>
    </div>
</body>
</html>