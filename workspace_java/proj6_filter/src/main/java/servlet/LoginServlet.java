package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String pw = request.getParameter("pw");
		// 비밀번호 체크
		if("1234".equals(pw)) {
			// session 가져오기
			HttpSession session = request.getSession();
			// 세션 설정해주기
			session.setAttribute("login", "Y");
			// MainServlet로 응답 전달
			response.sendRedirect("main");
		}
		else {
			// 비밀번호 체크했을 때, 올바르지 않은 정보면 login.html로 이동
			response.sendRedirect("login.html");
		}
	}

}
