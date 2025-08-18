package proj3_dbcp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class OracleJDBCExam {

	public static void main(String[] args) {
		String url = "jdbc:oracle:thin:@125.181.132.133:51521:xe";
		String user = "scott4_1";
		String password = "tiger";
		String driver = "oracle.jdbc.driver.OracleDriver";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
		Connection conn = null;
		
		try {
			// Class.forName() : String을 이용한 class 생성
			// Oracle 드라이버 로드
			Class.forName(driver);
			
			// DB 접속
			conn = DriverManager.getConnection(url, user, password);
			
			// SQL 준비
			String query = "select * from emp";
			ps = conn.prepareStatement(query);
			
			// SQL 실행 및 결과 확보
			// rs 변수에는 테이블 전체가 들어있음
			rs = ps.executeQuery();
			
			// 결과 활용
			// rs.next() : 다음 줄이 있는지 체크
			// next 실행 이후 rs 변수는 한 줄로 변경됨
			// (= 커서가 다음 줄로 이동됨)
//			if(rs.next()) {
//				int empno = rs.getInt("empno");
//				System.out.println("첫 번째 empno 값: " + empno);
//				
//				String ename = rs.getString("ename");
//				System.out.println("첫 번째 ename 값: " + ename);
//			}
//			if(rs.next()) {
//				int empno = rs.getInt("empno");
//				System.out.println("두 번째 empno 값: " + empno);
//				
//				String ename = rs.getString("ename");
//				System.out.println("두 번째 ename 값: " + ename);
//			}
//			rs.next();
			
			while(rs.next()) {
				// 전달인자 = 컬럼명(대소문자 구분 X)
				int empno = rs.getInt("empno");
				System.out.print(empno + ", ");
				String ename = rs.getString("ename");
				System.out.println(ename);
			}
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
			if(conn != null || ps != null) {
				try {
					conn.close();
					ps.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}

}
