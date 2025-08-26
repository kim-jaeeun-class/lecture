package loginEMP.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import loginEMP.DTO.LoginEMPDTO;

public class LoginEMPDAO {
	// DB 접속용 getConn 만들기
	private Connection getConn() {
		Connection conn = null;
		try {
			// JNDI : 글씨로 자원을 가져오는 방식
			Context ctx = new InitialContext();
			DataSource dataFactory = (DataSource) ctx.lookup("java:/comp/env/jdbc/oracle");
			
			conn = dataFactory.getConnection();			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	
		return conn;
	}
	
	public List<LoginEMPDTO> getAll() {
		List<LoginEMPDTO> list = new ArrayList<LoginEMPDTO>();
		
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "select ename, empno from test";
			PreparedStatement ps = conn.prepareStatement(query);
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			
			rs.close();
			ps.close();
			conn.close();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	public LoginEMPDTO findIdPw(String id, int pw) {
		LoginEMPDTO dto = null;
		
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "select ename, empno from test where ename = ?";
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, dto.getEname());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			if(rs.next()) {
				dto = new LoginEMPDTO();
				
				dto.setEname(rs.getString("ename"));
				dto.setEmpno(rs.getInt("empno"));
				
				// 더 써야 함...
			}
			
			ps.close();
			rs.close();
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
	}

}
