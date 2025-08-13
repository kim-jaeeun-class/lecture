package sec01.exam01;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class RequestServlet
 */
@WebServlet("/req")
public class RequestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doGet");
		
		// 요청 시 한글 깨짐 방지 구문
		request.setCharacterEncoding("utf-8");
		// 응답 시 한글 깨짐 방지 구문
		response.setContentType("text/html;charset=utf-8;");
		
		// 전달받은 파라미터의 키를 적어 해당 값 얻어오기
		String num1 = request.getParameter("num1");
		System.out.println("num1: " + num1);
		
		// 없으면 null
		String pw = request.getParameter("pw");
		System.out.println("pw: " + pw);
		
		String check = request.getParameter("check");
		System.out.println("check: " + check);
		
		
		String[] checks = request.getParameterValues("check");
		System.out.println("checks:" + checks);
		if(checks != null) {
			for(String chk : checks) {
				System.out.println(chk);
			}
		}
		
		System.out.println(request.getParameter("chk"));
		System.out.println(request.getParameter("btn1"));
		System.out.println(request.getParameter("btn2"));
		System.out.println(request.getParameter("r1"));
		System.out.println(request.getParameter("r2"));
		System.out.println(request.getParameter("date"));
		System.out.println(request.getParameter("number1"));
		System.out.println(request.getParameter("select1"));
		System.out.println(request.getParameter("textarea1"));
		
		response.getWriter().println("{\"k\":123}");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/req doPost");
		
		System.out.println(request.getParameter("num2: " + request.getParameter("num2")));
		response.getWriter().println("{\"k\":456}");
	}

}
