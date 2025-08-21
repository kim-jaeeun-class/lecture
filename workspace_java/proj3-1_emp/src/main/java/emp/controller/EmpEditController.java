package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/edit")
public class EmpEditController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
			out.println("<form method = 'post' action = 'edit'>");
			out.println("<table style = 'border: 1px dotted; font-size: 0.9em;'>");
			out.println("	<tr><td>Empno: </td><td><input type = 'text' name = 'empno' value ='" + empDTO2.getEmpno() + "'</td></tr>");
			out.println("	<tr><td>Ename: </td><td><input type = 'text' name = 'ename' value ='" + empDTO2.getEname() + "'</td></tr>");
			out.println("	<tr><td>Job: </td><td><input type = 'text' name = 'job' value ='" + empDTO2.getJob() + "'</td></tr>");
			out.println("	<tr><td>Mgr: </td><td><input type = 'text' name = 'mgr' value ='" + empDTO2.getMgr() + "'</td></tr>");
			out.println("	<tr><td>Hiredate: </td><td><input type = 'date' name = 'hiredate' value ='" + empDTO2.getHiredate() + "'</td></tr>");
			out.println("	<tr><td>Sal: </td><td><input type = 'text' name = 'sal' value ='" + empDTO2.getSal() + "'</td></tr>");
			out.println("	<tr><td>Comm: </td><td><input type = 'text' name = 'comm' value ='" + empDTO2.getComm() + "'</td></tr>");
			out.println("	<tr><td>Deptno: </td><td><input type = 'text' name = 'deptno' value ='" + empDTO2.getDeptno() + "'</td></tr>");
			out.println("</table>");
			

			out.println("	<input type = 'hidden' name = 'empno' value =" + empDTO2.getEmpno() +">");
			out.println("	<input type = 'submit' value = '수정'>");            
            out.println("</form>");
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		EmpDTO empDTO = new EmpDTO();
		
		try {
			String sEmpno = request.getParameter("empno");
			String ename = request.getParameter("ename");
			String job = request.getParameter("job");
			String sMgr = request.getParameter("mgr");
			String sHiredate = request.getParameter("hiredate");
			String sSal = request.getParameter("sal");
			String sComm = request.getParameter("comm");
			String sDeptno = request.getParameter("deptno");
			
			Date hiredate = Date.valueOf(sHiredate);
			int empno = Integer.parseInt(sEmpno);
			int mgr = Integer.parseInt(sMgr);
			int sal = Integer.parseInt(sSal);
			int comm = Integer.parseInt(sComm);
			int deptno = Integer.parseInt(sDeptno);
			
			// 잊지 말기!!!
			empDTO.setEmpno(empno);
			empDTO.setEname(ename);
			empDTO.setJob(job);
			empDTO.setMgr(mgr);
			empDTO.setHiredate(hiredate);
			empDTO.setSal(sal);
			empDTO.setComm(comm);
			empDTO.setDeptno(deptno);

			
			// DB 삽입
			empDTO.setEmpno(empno);
			EmpService empService = new EmpService();
			int result = empService.editEmp(empDTO);
			System.out.println("삽입 결과: " + result);
			
			// 이동
			response.sendRedirect("list");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
