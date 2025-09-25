<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="tiles" uri="http://tiles.apache.org/tags-tiles" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title><tiles:insertAttribute name="title" /></title>
<style>
    div {
        border: 1px solid black;
    }
    .main_wrapper {
        display: flex;
    }

    .main_wrapper .side {
        flex-grow: 1;
    }
    .main_wrapper .content {
        flex-grow: 4;
    }
    
    @media(max-width: 768px) {
    	.main_wrapper {
    		display: block;
    	}
    }

</style>
</head>
<body>
    <%-- <%@ import %> --%>
    <%-- <jsp:include page> --%>

    <!-- header -->
    <header>
		<tiles:insertAttribute name="header" />
	</header>
	
	
    <!-- main -->
    <section class="main_wrapper">
        <!-- side -->
        <aside class = "side">
			<tiles:insertAttribute name="side" />
		</aside>
		
        <!-- content -->
        <article class = "content">
			<tiles:insertAttribute name="content" />
		</article>    
    </section>
    
    
    <!-- footer -->
    <footer>
		<tiles:insertAttribute name="footer" />
	</footer>
</body>
</html>