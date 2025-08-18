package todo.DAO;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import todo.DTO.TodoDTO;

// DAO : Data Access Object
public class TodoDAO {
	
	// tbl_todo의 모든 항목을 돌려주는 메소드
	// 메소드명 : selectAll
	// 전달인자 : 없음
	// 리턴 타입 : List<TodoDTO>
	
	public List<TodoDTO> selectAll() {
		List<TodoDTO> list = new ArrayList<>();
		try {

			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			Connection conn = dataFactory.getConnection();
			
			String query = "select * from tbl_todo";
			PreparedStatement ps = conn.prepareStatement(query);
			
			ResultSet rs = ps.executeQuery();
			
			while(rs.next()) {
				int tno = rs.getInt("tno");
				System.out.println(tno);
				String title = rs.getString("title");
				Date duedate = rs.getDate("duedate");
				int finished = rs.getInt("finished");
				
//				Map map = new HashMap();
//				map.put("tno", tno);
//				map.put("title", title);
//				map.put("duedate", duedate);
//				map.put("finished", finished);
//				list.app(map);
				
				TodoDTO todoDTO = new TodoDTO();
				todoDTO.setTno(tno);
				todoDTO.setTitle(title);
				todoDTO.setDuedate(duedate);
				todoDTO.setFinished(finished);
				list.add(todoDTO);
			}
			
			rs.close();
			ps.close();
			conn.close(); // 커넥션 풀로 반환 : 대기열에 있으므로 연결은 되어 있는 상태(재활용 가능)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
}
