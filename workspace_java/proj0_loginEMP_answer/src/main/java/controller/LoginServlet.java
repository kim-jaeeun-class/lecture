package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

@WebServlet("/list")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// DB에서 목록 조회
		EmpDAO dao = new EmpDAO();
		List list = dao.selectAll();
		
		// list.jsp로 보내기
		request.setAttribute("list", list);
		request.getRequestDispatcher("list.jsp").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String sEmpno = request.getParameter("empno"); // pw
		String ename = request.getParameter("ename"); // id
		
		int empno = Integer.parseInt(sEmpno);
		
		EmpDTO dto = new EmpDTO();
		dto.setEname(ename);
		dto.setEmpno(empno);
		
		// DB 다녀오기
		EmpDAO dao = new EmpDAO();
		// 원래 resultDTO로 쓰던 것
		dto = dao.getEmp(dto);
		
		// 로그인 성패 판단
		if(dto == null) {
			// 비회원 : sendRedirect로 로그인 페이지로 보내기
			// ?msg=1 라는 파라미터를 보내, c:if를 활용해 로그인 경고를 띄워줄 수 있음
			response.sendRedirect("login.jsp?msg=1");
		}
		else {
			// 회원 : 세션에 넣기
			HttpSession session = request.getSession();
			session.setAttribute("dto", dto);
			
			// list 서블릿으로 보냄 -> DB 조회 -> list.jsp로 이동
			response.sendRedirect("list");
		}
	}

}
