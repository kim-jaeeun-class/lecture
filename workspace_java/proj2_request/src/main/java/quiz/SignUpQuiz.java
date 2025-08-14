package quiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/su")
public class SignUpQuiz extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("signup doPost 확인");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String pwCheck = request.getParameter("pwCheck");
		
		try {
			if(id.equals("") || pw.equals("") || pwCheck.equals("")) {
				request.getRequestDispatcher("quiz/signUp.jsp").forward(request, response);
			}
			else {
				request.setAttribute("id", id);
				request.setAttribute("pw", pw);
				request.setAttribute("pwCheck", pwCheck);
				
				request.getRequestDispatcher("quiz/signUpResult.jsp").forward(request, response);
			}

		}
		catch(Exception e) {
			e.printStackTrace();
		}
		

	}

}
