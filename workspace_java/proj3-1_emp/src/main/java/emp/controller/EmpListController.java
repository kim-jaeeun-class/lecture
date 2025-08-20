package emp.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@SuppressWarnings("serial")
@WebServlet("/list")
public class EmpListController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		System.out.println("/list doGet 실행");
		
//		주석 쓰는 시간대 기준, selectAllEmp에서 현재 아래 세 개만 list.add(dto) 해놔서 나머지는 null이나 0으로 뜸		
//		dto.setEmpno(rs.getInt("empno"));
//		dto.setEname(rs.getString("ename"));
//		dto.setSal(rs.getInt("sal"));
//		
//		list.add(dto);
		
		// DB 조회
		EmpService empService = new EmpService();
		List<EmpDTO> list = empService.getAllEmp();
		
		// 화면에 출력(응답 정적 자원 만들기)
		PrintWriter out = response.getWriter();
		
		out.println("<table style = 'border: 1px dotted; font-weight: 300; font-size: 0.9em'");
		
		out.println("	<tr>");
		out.println("		<th>empno</th><th>ename</th><th>sal</th>");
		out.println("	</tr>");
		
		for(EmpDTO dto : list) {
			System.out.println(dto);
			out.println("	<tr>");			
			out.println("		<td>"+ dto.getEmpno() +"</td>");
			out.println("		<td><a href=detail?empno=" + dto.getEmpno() + ">" + dto.getEname() + "</a></td>");
			out.println("		<td>"+ dto.getSal() +"</td>");
			out.println("	</tr>");
		}

		out.println("</table>");
		

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
