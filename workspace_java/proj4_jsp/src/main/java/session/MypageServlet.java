package session;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/mypage")
public class MypageServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html; charset=utf-8;");
		
		HttpSession session = request.getSession(false);
		if(session == null) {
			// 로그인 안 했을 경우
			System.out.println("처음 방문 + 로그인 X");
			response.sendRedirect("cookie5.jsp");
		}
		else {
			// getAttribute : 없을 경우 null
			// 로그인 했으면 true, 안 했으면 false
			System.out.println("재방문 + 로그인 X");
			Boolean login = (Boolean)session.getAttribute("login");
			if(login == null || login != true) {
				// 로그인 안 함
				response.sendRedirect("cookie5.jsp");
			}
			else {
				response.getWriter().println("로그인 시 진입 가능");
				response.getWriter().println("id: " + session.getAttribute("userID"));				
			}
		}
		

	}

}
