package servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 필터에서 로그인 여부 확인 적용했으므로 전부 주석 처리
//		HttpSession session = request.getSession();
//		
//		// login 세션이 null이 아니면 web-inf view 폴더의 main.jsp로 이동
//		
//		if(session.getAttribute("login") != null) {
//			request.setAttribute("codeName", "3500");
//			System.out.println("forward 진행 전");
//			// forward는 필터를 거치지 않고 실행됨
//			request.getRequestDispatcher("/WEB-INF/view/main.jsp").forward(request, response);
//		}
//		// null인 경우(로그인 정보 틀림, MainServlet로 바로 진입) login.html로 이동시킴
//		else {
//			response.sendRedirect("login.html");
//		}
		
		request.setAttribute("codeName", "3500");
		System.out.println("forward 진행 전");
		// forward는 필터를 거치지 않고 실행됨
		request.getRequestDispatcher("/WEB-INF/view/main.jsp").forward(request, response);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
