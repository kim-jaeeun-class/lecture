package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/SetCookie")
public class SetCookie extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		// 만료일이 있는 쿠키
		Cookie c1 = new Cookie("addr", "Cheonan");
		c1.setMaxAge(30); // () 안의 값은 초 단위로 들어감
		response.addCookie(c1);
		
		// 만료일이 없는 쿠키 : 세션 쿠키
		// setMaxAge를 설정하지 않거나 음수(-1)로 설정함
		// 브라우저 메모리에만 저장됨(=모든 탭을 끌 경우 사라짐)
		
		Cookie c2 = new Cookie("dinner", "fish");
		c2.setMaxAge(-1);
		response.addCookie(c2);
		
		Cookie c3 = new Cookie("showPopup", "N");
		c3.setMaxAge(5);
		response.addCookie(c3);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
	}

}
