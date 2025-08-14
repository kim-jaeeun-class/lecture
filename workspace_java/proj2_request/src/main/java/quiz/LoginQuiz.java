package quiz;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/login")
public class LoginQuiz extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		System.out.println("doPost 연결되나????"); // 됐음
		
		// 요청 시 한글 깨짐 방지 구문
		request.setCharacterEncoding("utf-8");
		// 응답 시 한글 깨짐 방지 구문
		response.setContentType("text/html;charset=utf-8;");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
//		System.out.println("출력 확인용 : " + "id는 " + id + "pw는 " + pw);
		
		try {
			if(id.equals("") | pw.equals("")) {
				response.getWriter().println("아이디 혹은 비밀번호를 확인해주세요.");
				System.out.println("출력 확인용 : " + "id는 " + id + "pw는 " + pw);
			}
			else if(id.equals("admin") && pw.equals("1234")) {
				response.getWriter().println("관리자 페이지");
				System.out.println("출력 확인용 : " + "id는 " + id + "pw는 " + pw);
			}
			else {
				System.out.println("id: " + id + ", pw: " + pw);
				response.getWriter().println("id: " + id);
				response.getWriter().println("pw: " + pw);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
