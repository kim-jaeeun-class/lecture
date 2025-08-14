package quiz;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/99")
public class _99Quiz extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		int num = Integer.parseInt(request.getParameter("num"));
		int[] result = new int[9];
		
		for(int i = 1; i <= 9; i++) {
			result[i-1] = num * i;
		}
		
		try {
			request.setAttribute("num", num);
			request.setAttribute("result", result);
			
			request.getRequestDispatcher("quiz/99Result.jsp").forward(request, response);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		
	}

}
