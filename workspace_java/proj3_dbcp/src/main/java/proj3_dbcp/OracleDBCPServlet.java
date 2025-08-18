package proj3_dbcp;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.sql.DataSource;

@WebServlet("/dbcp")
public class OracleDBCPServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			// JNDI 방식으로 context.xml의 DB 정보를 가져옴
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			// DB 접속
			Connection conn = dataFactory.getConnection();
			
			
			// SQL 준비
			String query = "select * from emp order by empno";
			PreparedStatement ps = conn.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			// rs 변수에는 테이블 전체가 들어있음
			ResultSet rs = ps.executeQuery();
			
			PrintWriter out = response.getWriter();
			
			while(rs.next()) {
				// 전달인자 = 컬럼명(대소문자 구분 X)
				int empno = rs.getInt("empno");
//				System.out.print(empno + ", ");
				out.print(empno + ", ");
				
				Date hiredate = rs.getDate("hiredate");
//				System.out.print(hiredate + ", ");
				out.print(hiredate.toLocalDate() + ", ");
				
				
				String ename = rs.getString("ename");
//				System.out.println(ename);
				out.println(ename);
			}
			
			rs.close();
			ps.close();
			conn.close(); // 커넥션 풀로 반환 : 대기열에 있으므로 연결은 되어 있는 상태(재활용 가능)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
