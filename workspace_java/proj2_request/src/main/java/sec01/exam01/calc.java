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
	
		int n1 = Integer.parseInt(num1);
		int n2 = Integer.parseInt(num2);
		int sum = n1 + n2;
		
        response.setContentType("application/json; charset=UTF-8");
        String json = String.format("{\"num1\":%d, \"num2\":%d, \"sum\":%d}", n1, n2, sum);
        response.getWriter().write(json);
	
	}
	
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        processRequest(request, response);
    }

    // 공통 처리 메서드
    private void processRequest(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String num1 = request.getParameter("numberC1");
        String num2 = request.getParameter("numberC2");

        int n1 = 0;
        int n2 = 0;
        try {
            n1 = Integer.parseInt(num1);
            n2 = Integer.parseInt(num2);
        } catch (NumberFormatException e) {
            // 에러 처리: 숫자 형식이 아니면 0으로 초기화하거나 에러 메시지 전송 가능
        }
        int sum = n1 + n2;

        response.setContentType("application/json; charset=UTF-8");
        String json = String.format("{\"num1\":%d, \"num2\":%d, \"sum\":%d}", n1, n2, sum);
        response.getWriter().write(json);
    }

}
