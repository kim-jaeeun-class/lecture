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
		System.out.println("doGet");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		// 목록 가져오기
		TodoService todoService = new TodoService();
		List<TodoDTO> list = todoService.getList();
		
		PrintWriter out = response.getWriter();
		out.println("<table style = \"border: none;\">");
		
		// 목록 보여주기
		for(int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
			
			TodoDTO dto = list.get(i);
			out.println("<tr>");
			out.println("	<td>" + dto.getTno() + "</td>");
			out.println("	<td>" + dto.getTitle() + "</td>");
			out.println("	<td>" + dto.getDuedate() + "</td>");
			out.println("	<td>" + dto.getFinished() + "</td>");
			out.println("</tr>");
		}
		
		out.println("</table>");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("doPost");
		
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8;");
		
		String title = request.getParameter("title");
		String duedate = request.getParameter("duedate");	
		
		TodoDTO todoDTO = new TodoDTO();
		
		todoDTO.setTitle(title);
		Date date_duedate = Date.valueOf(duedate);
		todoDTO.setDuedate(date_duedate);
		
		System.out.println(todoDTO);
	}

}
