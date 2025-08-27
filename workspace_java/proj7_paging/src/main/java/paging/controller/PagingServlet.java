package paging.controller;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import PagingService.PagingService;
import paging.dao.PagingDAO;
import paging.dto.PagingDTO;

@WebServlet("/paging")
public class PagingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    request.setCharacterEncoding("utf-8");
	    response.setContentType("text/html;charset=utf-8");

	    // rownum 조건 먹이기용
	    String rStr = request.getParameter("r");
	    int r = 1;
	    
	    if(rStr != null && !rStr.isEmpty()) {
	    	r = Integer.parseInt(rStr);
	    }
	    PagingDTO dto = new PagingDTO();
	    PagingService service = new PagingService();
	    List<PagingDTO> list = service.getAll(r);
	    Map map = service.getPageEMP(dto);
	    
	    // 여기 map에 맞게 수정하기
	    request.setAttribute(rStr, dto);

	    request.setAttribute("list", list);
	    request.getRequestDispatcher("paging.jsp").forward(request, response);
	    
	    // 실제 페이징
	    
	    String sPagePerRows = request.getParameter("rows");
	    String sPage = request.getParameter("pages");
	    
	    int pagePerRows = 10;
	    int page = 1;
	    
	    try {
	    	pagePerRows = Integer.parseInt(sPagePerRows);
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	    try {
	    	page = Integer.parseInt(sPage);
	    }
	    catch (Exception e) {
	    	e.printStackTrace();
	    }
	    
	    PagingDTO dto = new PagingDTO();
	    dto.setPagePerRows(pagePerRows);
	    dto.setPage(page);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    // 내가 따로 쓴 거
		int r = Integer.parseInt(request.getParameter("r"));
	    response.sendRedirect("paging?r=" + r);
	}


}
