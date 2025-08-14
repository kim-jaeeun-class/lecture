<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>주문 완료</title>
<style>
	.block-c {
		margin: 1%;
	}
	.block {
		border: 1px dotted;
        border-radius: 10px;
        width: 50%;
	}
</style>
</head>
<body>
    <h1>주문 내역</h1>
    <div class = "block">
	    <div class = "block-c">
		    <%
		        String menu = String.valueOf(request.getAttribute("menu"));
		    	out.println("주문 메뉴: " + menu);
		    %>   
	    </div>
	    <div class = "block-c">
	    	<%
		        String size = String.valueOf(request.getAttribute("size"));
		        out.println("사이즈: " + size);
	    	%>
	    </div>
		<div class = "block-c">
			<%
		        String dough = String.valueOf(request.getAttribute("dough"));
		        out.println("도우 종류: " + dough);		
			%>
		</div>
	    <div class = "block-c">
	    	<%
		        String[] top;
		        if (request.getAttribute("topping") instanceof String[]) {
		            top = (String[]) request.getAttribute("topping");
		    		if(top != null) {
		                out.println("토핑 종류: ");
		                boolean last = false;
		    			for(String t: top) {
		    				if(t.equals(top[top.length - 1])) {
		    					last = true;
		    				}
		    				if (last) {
		    					out.println(t);
		    				}
		    				else {
		    					out.println(t + ",");
		    				}
		    			}
		    		}
		        }    	
	    	%>
	    </div>
	    <div class = "block-c">
	    	<%
		        String req = String.valueOf(request.getAttribute("req"));
		        out.println("요청 사항: " + req);    	
	    	%>
	    </div>
	    <div class = "block-c">
	    	<%
	    		int total = (int) request.getAttribute("total"); 
	    		out.println("총 금액: " + total);
	    	%>
	    </div>
    </div>
</body>
</html>