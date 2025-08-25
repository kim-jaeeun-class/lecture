package loginEMP.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import loginEMP.DTO.LoginEMPDTO;
import loginEMP.service.LoginEMPService;

@WebServlet("/login")
public class LoginEMPController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		HttpSession session = request.getSession();
		
		session.setAttribute("k", "v");
		
		String id = request.getParameter("empno");
		String pw = request.getParameter("ename");
		
		if("KING".equals(id)) {
			
		}
		else if() {
			
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		LoginEMPService service = new LoginEMPService();
		List<LoginEMPDTO> list = service.getAll();
		
	}

}
