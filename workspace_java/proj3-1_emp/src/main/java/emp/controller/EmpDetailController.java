package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@SuppressWarnings("serial")
@WebServlet("/detail")
public class EmpDetailController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/detail doGet 실행 : 하나의 상세 정보만 조회");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		int empno = 0;
		
		// 파라미터 empno를 int로 변환
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		// db 다녀온 후 출력
		try {
			EmpService empService = new EmpService();
			EmpDTO empDTO2 = empService.getOneEmp(empDTO);
			
			PrintWriter out = response.getWriter();
			out.println("<table style = 'border: 1px dotted; font-size: 0.9em;'>");
			out.println("	<tr><td>Empno: </td><td>" + empDTO2.getEmpno() + "</td></tr>");
			out.println("	<tr><td>Ename: </td><td>" + empDTO2.getEname() + "</td></tr>");
			out.println("	<tr><td>Job: </td><td>" + empDTO2.getJob() + "</td></tr>");
			out.println("	<tr><td>Mgr: </td><td>" + empDTO2.getMgr() + "</td></tr>");
			out.println("	<tr><td>Hiredate: </td><td>" + empDTO2.getHiredate() + "</td></tr>");
			out.println("	<tr><td>Sal: </td><td>" + empDTO2.getSal() + "</td></tr>");
			out.println("	<tr><td>Comm: </td><td>" + empDTO2.getComm() + "</td></tr>");
			out.println("	<tr><td>Deptno: </td><td>" + empDTO2.getDeptno() + "</td></tr>");
			out.println("</table>");
			
			out.println("<form method = 'get' action = 'edit'>");
			out.println("	<input type = 'hidden' name = 'empno' value =" + empDTO2.getEmpno() +">");
			out.println("	<input type = 'submit' value = '수정'>");            
            out.println("</form>");
			out.println("<form method = 'post' action = 'remove'>");
			out.println("	<input type = 'hidden' name = 'empno' value =" + empDTO2.getEmpno() +">");
			out.println("	<input type = 'submit' value = '삭제'>");  
			out.println("</form>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
	}

}
