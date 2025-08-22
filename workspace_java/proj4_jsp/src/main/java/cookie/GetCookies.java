package cookie;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/GetCookies")
public class GetCookies extends HttpServlet {

	@SuppressWarnings("unused")
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		boolean isShow = true;	// 깃발
		
		Cookie[] cookies = request.getCookies();
		// 만약 cookie가 하나도 없을 경우 null
		if(cookies != null) {
			for(int i = 0; i < cookies.length; i++) {
				Cookie c = cookies[i];
				// cookie의 key를 가져옴
				String name = c.getName();
				// cookie의 value를 가져옴
				String value = c.getValue();
				
				System.out.println("name: " + name + ", value: " + value);
				
				
				
				if("showPopup".equals(name) && "N".equals(value)) {
					// 쿠키에 showPopup이 없고, value가 N이 아니면 팝업을 보여주는 if문
					isShow = false;
				}
			}
		}
		
		if(isShow) {
			response.getWriter().println("팝업 표시");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
	}

}
