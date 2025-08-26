package loginEMP.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import loginEMP.DTO.LoginEMPDTO;
import loginEMP.service.LoginEMPService;


@WebServlet("/memlist")
public class MemEMPController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		LoginEMPService login = new LoginEMPService();
		List<LoginEMPDTO> list = login.getAll();
		
		request.setAttribute("list", list);
		
		request.getRequestDispatcher("memberList.jsp").forward(request, response);
	}

}
