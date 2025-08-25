package session;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@SuppressWarnings("serial")
@WebServlet("/session")
public class SessionServlet extends HttpServlet {

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 기존 세션이 없는 경우 -> 새 세션 생성
		// 기존 세션이 있는 경우 -> 기존 세션을 가져옴
		HttpSession session = request.getSession();
		
		// 기존 세션이 없으면 null
		// 있으면 그것을 가져옴
//		HttpSession session = request.getSession(false);
		
		// key-value를 담을 수 있음
		session.setAttribute("k", "v");
		
		String id = session.getId();
		System.out.println("getId(): " + id);
		
		// 새 세션인지의 여부를 알려줌. getSession(false)와 자주 함께 쓰임
		boolean isNew = session.isNew();
		System.out.println("isNew(): " + isNew);
		
		String userID = request.getParameter("id");
		if("admini".equals(userID)) {
			// 일반 아이디
			session.setAttribute("login", true);
			session.setAttribute("userID", userID);
		}
		else if("admin".equals(userID)) {
			// 관리자 아이디
			session.setAttribute("login", true);
			session.setAttribute("userID", userID);
			session.setAttribute("level", "1");
		}
	}
}
