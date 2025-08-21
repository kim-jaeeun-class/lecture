package emp.controller;

import java.io.IOException;
import java.sql.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@WebServlet("/add")
public class EmpAddController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

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
			int result = empService.addEmp(empDTO);
			System.out.println("삽입 결과: " + result);
			
			// 이동
			response.sendRedirect("list");
		}
		catch (Exception e) {
			e.printStackTrace();
		}

		
	}
	
//	// 파라미터 스트링 값을 줌 : 같은 식으로 post의 try-catch(sEmpno 부분) 변경 가능
//	
//	// 조건 : 문제점 - 리턴 타입이 조건에 따라 달라짐 
//	// String -> return String
//	// int -> return int
//	
//	private Object getParam(String param) {
//		Object o = 
//		return param;
//	}

}
