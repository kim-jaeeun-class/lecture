package todo.controller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import todo.DTO.TodoDTO;
import todo_service.TodoService;

@WebServlet("/todo")
public class TodoController extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo goGet 실행");
		
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		PrintWriter out = response.getWriter();
		
		TodoService todoService = new TodoService();
		
		String command = request.getParameter("command");
		if("detail".equals(command)) {
			
			String str_tno = request.getParameter("tno");
			if(str_tno != null) {
				int tno = Integer.parseInt(str_tno);
				TodoDTO todoDTO = new TodoDTO();
				todoDTO.setTno(tno);
				
				// db에서 개별 조회
				TodoDTO todoDTO2 = todoService.getTodo(todoDTO);
				
				// 화면에 표시
				out.println("<div>");
				out.println("<br>tno: "+ todoDTO2.getTno());
				out.println("<br>title: "+ todoDTO2.getTitle());
				out.println("<br>duedate: "+ todoDTO2.getDuedate());
				out.println("<br>finished: "+ todoDTO2.getFinished());
				out.println("</div>");
				out.println("<a href='modify?tno="+ todoDTO2.getTno() +"'><button>수정</button></a>");
				
			}
			
			
		} else {
			// 전체 목록 가져오기
			List<TodoDTO> list = todoService.getList();
			
			out.println("<a href='register.html'><button>글쓰기</button></a>");
			out.println("<table style='border:1px dotted'>");
			// 목록 보여주기
			for(int i=0; i<list.size(); i++) {
				System.out.println(list.get(i));
				
				TodoDTO dto = list.get(i);
				out.println("<tr>");
				out.println("	<td>"+ dto.getTno() +"</td>");
				out.println("	<td> <a href='todo?command=detail&tno="+ dto.getTno() +"'>"+ dto.getTitle() +"</a></td>");
				out.println("	<td>"+ dto.getDuedate() +"</td>");
				out.println("	<td>"+ dto.getFinished() +"</td>");
				out.println("	<td>");
				out.println("		<form method='post' action='todo'>");
				out.println("			<input type='hidden' name='tno' value='"+ dto.getTno() +"'>");
				out.println("			<input type='hidden' name='command' value='del'>");
				out.println("			<input type='submit' value='삭제'>");
				out.println("		</form>");
				out.println("	</td>");
				out.println("</tr>");
			}
			out.println("</table>");
		}
		
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("/todo goPost 실행");
		// 한글 깨짐 방지
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		
		TodoService todoService = new TodoService();
		TodoDTO todoDTO = new TodoDTO();
		
		String command = request.getParameter("command");
//		if(command != null && command.equals("del")) {
		if("del".equals(command)) {
			// delete
			String str_tno = request.getParameter("tno");
			System.out.println("str_tno: "+ str_tno);
			
			try {
				int tno = Integer.parseInt(str_tno);
				todoDTO.setTno(tno);
				
				int result = todoService.removeTodo(todoDTO);
				System.out.println(result +" 행 이(가) 삭제되었습니다.");
				
				if(result == -1) {
					response.getWriter().println("<script>");
					response.getWriter().println("alert('삭제 실패')");
					response.getWriter().println("</script>");
				} else {
					response.sendRedirect("todo");
				}
			} catch(Exception e) {
				e.printStackTrace();
			}
		} else {
			// insert
			
			String title = request.getParameter("title");
			String duedate = request.getParameter("duedate");
			
			todoDTO.setTitle(title);
			
			Date date_duedate = Date.valueOf(duedate);
			todoDTO.setDuedate(date_duedate);
			
			System.out.println(todoDTO);
			
			
			int result = todoService.addTodo(todoDTO);
			
			if(result == -1) {
				response.getWriter().println("<script>");
				response.getWriter().println("alert('추가 실패')");
				response.getWriter().println("</script>");
			} else {
				response.sendRedirect("todo");
			}
		}
		
	}

}
