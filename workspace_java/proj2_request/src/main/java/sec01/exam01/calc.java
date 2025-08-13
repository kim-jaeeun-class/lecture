package sec01.exam01;
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

		try {
			int n1 = Integer.parseInt(num1);
			int n2 = Integer.parseInt(num2);
			int sum = n1 + n2;
			
//			PrintWriter out = response.getWriter();
//			out.println("<h1>NUM1 " + n1 + </h1>);
//			out.println("<h1>NUM2 " + n2 + </h1>);
//			out.println("<h1>SUM " + sum + </h1>);
			
	        response.setContentType("application/json; charset=UTF-8");
	        String json = String.format("{\"num1\":%d, \"num2\":%d, \"sum\":%d}", n1, n2, sum);
	        response.getWriter().write(json);
        	System.out.println("/calc doGet 실행");
        }
        catch(Exception e) {
        	e.printStackTrace();
        }
	
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String num1 = request.getParameter("numberC1");
        String num2 = request.getParameter("numberC2");

        int n1 = 0;
        int n2 = 0;
        try {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            // 에러 처리용
        }
        int sum = n1 + n2;

        response.setContentType("application/json; charset=UTF-8");
        String json = String.format("{\"num1\":%d, \"num2\":%d, \"sum\":%d}", n1, n2, sum);
        response.getWriter().write(json);
    }

}
