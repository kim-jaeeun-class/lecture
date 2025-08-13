package sec01.exam01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/fs")
public class ForwardServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/fs doGet 실행");
		
		String text = request.getParameter("text");
		System.out.println("text: " + text);
		
		response.getWriter().println("ForwardServlet");
		
		// Another Servlet으로 이동
		// 이후 as의 doGet이 됨(들어온 대로 연결)
		RequestDispatcher rDis = request.getRequestDispatcher("as");
		rDis.forward(request, response);
		// 위 두 줄은 이렇게 작성도 가능 : request.getRequestDispatcher("as").forward(request, response);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/fs doPost 실행");

		String text = request.getParameter("text");
		System.out.println("text: " + text);
		
		response.getWriter().println("ForwardServlet Post");
		
		// Another Servlet으로 이동
		// 이후 as의 doGet이 됨(들어온 대로 연결)
		RequestDispatcher rDis = request.getRequestDispatcher("as");
		rDis.forward(request, response);
	}

}
