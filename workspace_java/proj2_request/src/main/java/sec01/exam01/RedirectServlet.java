package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/rs")
public class RedirectServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/rs doGet 실행");
		
		// 요청 시 한글 깨짐 방지 구문
		request.setCharacterEncoding("utf-8");
		// 응답 시 한글 깨짐 방지 구문
		response.setContentType("text/html;charset=utf-8;");
		
		String text = request.getParameter("text");
		System.out.println("text: " + text);
		
		// 아래 코드에서 주소 적을 때는 브라우저 기준으로 적어주기
		// 여기에서는 절대주소
		// 이렇게 하면 rs로 진입해도 네트워크에서 302 found 처리된 후 as로 들어가짐
		// 연결된 주소는 get 방식으로만 연결됨
		response.sendRedirect("/proj2_request/as");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/rs doPost 실행");
		
		String text = request.getParameter("text");
		System.out.println("text: " + text);
		
		// 아래 코드에서 주소 적을 때는 브라우저 기준으로 적어주기
		// 여기에서는 절대주소
		// 이렇게 하면 rs로 진입해도 네트워크에서 302 found 처리된 후 as로 들어가짐
		response.sendRedirect("/proj2_request/as");
	}

}
