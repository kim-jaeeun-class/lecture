import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/calc")
public class calc extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String num1 = request.getParameter("numberC1");
		String num2 = request.getParameter("numberC2");
		String btn = request.getParameter("buttonC");
	
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(btn);
	
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println(request.getParameter("numberC1"));
		System.out.println(request.getParameter("numberC2"));
		System.out.println(request.getParameter("buttonC"));
	}

}
