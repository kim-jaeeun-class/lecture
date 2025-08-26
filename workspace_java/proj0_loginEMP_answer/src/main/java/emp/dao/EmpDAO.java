package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.dto.EmpDTO;


public class EmpDAO {
	
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
	
	// 리턴 내용
	// 회원이면 회원 EmpDTO
	// 비회원이면 null
	@SuppressWarnings("null")
	public EmpDTO getEmp(EmpDTO dto) {
		EmpDTO resultDTO = null;
		
		try {
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비 : count(*)로 해도 됨
			String query = "select * from test ";
			query += "where empno = ? and ename = ?";
			
			PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getEmpno());
			ps.setString(2, dto.getEname());
			
			// 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용 : if는 결과값이 존재한다면~
			if(rs.next()) {
				resultDTO = new EmpDTO();
				
				resultDTO.setEmpno(rs.getInt("empno"));
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultDTO;
	}
	
	public List selectAll() {
		List list = new ArrayList();
		
		try {
			// DB 접속
			Connection conn = getConn();
			
			// SQL 준비 : count(*)로 해도 됨
			String query = "select * from test ";
			
			PreparedStatement ps = conn.prepareStatement(query);
			
			// 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용 : if는 결과값이 존재한다면~
			while(rs.next()) {
				EmpDTO resultDTO = new EmpDTO();
				
				resultDTO.setEmpno(rs.getInt("empno"));
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
				
				list.add(resultDTO);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return list;
	}


}
