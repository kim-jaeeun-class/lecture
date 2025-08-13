package sec01.exam01;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc/in2")
public class Input2Servlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		String num1 = request.getParameter("num1");
		String num2 = request.getParameter("num2");
		
		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int sum = n1 + n2;
			
			System.out.println(sum);
			
			request.setAttribute("number3", sum);
			
			int n4 = (int)request.getAttribute("number3");
			System.out.println("n4: " + n4);
			
			request.getRequestDispatcher("/WEB-INF/view/calc/inputResult.jsp").forward(request, response);
			
			// 이 위까지가 계산 진행 및 계산 결과 화면으로 이동하는 코드
			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
