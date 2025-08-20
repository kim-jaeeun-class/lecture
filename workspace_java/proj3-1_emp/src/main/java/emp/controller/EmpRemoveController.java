package emp.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import emp.dto.EmpDTO;
import emp.service.EmpService;

@SuppressWarnings("serial")
@WebServlet("/remove")
public class EmpRemoveController extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// delete 만들기 : 
		// 실행 시기 : detail 페이지에서 삭제 버튼 클릭 발생 시,
		// 삭제할 행 empno 구하기 : getParameter, setAttribute
		int empno = 0;
		try {
			String sEmpno = request.getParameter("empno");
			if(sEmpno != null) {
				empno = Integer.parseInt(sEmpno);
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		// DTO에 담아주기
		EmpDTO empDTO = new EmpDTO();
		empDTO.setEmpno(empno);
		
		// DB에 다녀오기 : Conn 연결, 
		EmpService empService = new EmpService();
		int result = empService.removeEmp(empDTO);
		System.out.println(result + " 만큼 삭제됐습니다");
		
		// 전체 목록 페이지 표시 : 
		response.sendRedirect("list");
		
	}

}
