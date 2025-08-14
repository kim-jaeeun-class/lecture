package quiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/oq")
public class OrderQuiz extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		// 변수명 지정
		String menu = request.getParameter("menu");
		String size = request.getParameter("size");
		String dough = request.getParameter("dough");
		String[] topping = request.getParameterValues("topping");
		String req = request.getParameter("request");
		
		// 가격 구하기
		int total = 0;
		int large = 0;
		int family = 6000;
		int party = 14000;
		
		if (size.equals("Large")) {
			if(menu.equals("멜로우 콘크림") || menu.equals("존스 페이버릿") || menu.equals("위스콘신 치즈 포테이토")) {
				total = 27500 + large;
			}
			else if(menu.equals("스타라이트 바질")) {
				total = 31500 + large;
			}

			else if(menu.equals("햄 머쉬룸 식스 치즈")) {
				total = 28500 + large;
			}
		}
		else if (size.equals("Family")) {
			if(menu.equals("멜로우 콘크림") || menu.equals("존스 페이버릿") || menu.equals("위스콘신 치즈 포테이토")) {
				total = 27500 + family;
			}
			else if(menu.equals("스타라이트 바질")) {
				total = 31500 + family;
			}

			else if(menu.equals("햄 머쉬룸 식스 치즈")) {
				total = 28500 + family;
			}
		}
		else if (size.equals("Party")) {
			if(menu.equals("멜로우 콘크림") || menu.equals("존스 페이버릿") || menu.equals("위스콘신 치즈 포테이토")) {
				total = 27500 + party;
			}
			else if(menu.equals("스타라이트 바질")) {
				total = 31500 + party;
			}
			else if(menu.equals("햄 머쉬룸 식스 치즈")) {
				total = 28500 + party;
			}
		}
		
		try {
			request.setAttribute("menu", menu);
			request.setAttribute("size", size);
			request.setAttribute("dough", dough);
			request.setAttribute("topping", topping);
			request.setAttribute("req", req);
			request.setAttribute("total", total);
			
			request.getRequestDispatcher("/quiz/orderResult.jsp").forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		System.out.println("try 왜 안 되냐...");
		
	}

}
