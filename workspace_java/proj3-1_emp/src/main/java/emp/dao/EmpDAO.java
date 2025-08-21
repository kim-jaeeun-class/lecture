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
	
	public List<EmpDTO> selectAllEmp() {
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "select * from emp2";
			PreparedStatement ps = conn.prepareStatement(query);
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
			while(rs.next()) {
				EmpDTO dto = new EmpDTO();
				
				// dto 만들기
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setSal(rs.getInt("sal"));
				
				list.add(dto);
				
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
	
	// 한 명만 조회 : 추후 try에 if문 조정해서 전체 조회랑 합치기도 가능
	@SuppressWarnings("null")
	public EmpDTO selectOneEmp(EmpDTO empDTO) {
		EmpDTO resultDTO = null;
		
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "select * from emp2 ";
			query += "where empno = ? " ;
			PreparedStatement ps = conn.prepareStatement(query);
			// 첫 번째(첫 번째 인자의 숫자) 물음표에 두 번째 인자를 넣기
			ps.setInt(1, empDTO.getEmpno());
			
			// SQL 실행
			ResultSet rs = ps.executeQuery();
			
			// 결과 활용
//			while(rs.next()) {
//				int empno = rs.getInt("empno");
//				resultDTO.setEmpno(empno);
//				resultDTO.setEname(rs.getString("ename"));
//				resultDTO.setJob(rs.getString("job"));
//				resultDTO.setMgr(rs.getInt("mgr"));
//				resultDTO.setHiredate(rs.getDate("hiredate"));
//				resultDTO.setSal(rs.getInt("sal"));
//				resultDTO.setComm(rs.getInt("comm"));
//				resultDTO.setDeptno(rs.getInt("deptno"));					
//			}
			
			// while 말고 if도 사용 가능
			if(rs.next()) {
				resultDTO = new EmpDTO();
				
				int empno = rs.getInt("empno");
				resultDTO.setEmpno(empno);
				resultDTO.setEname(rs.getString("ename"));
				resultDTO.setJob(rs.getString("job"));
				resultDTO.setMgr(rs.getInt("mgr"));
				resultDTO.setHiredate(rs.getDate("hiredate"));
				resultDTO.setSal(rs.getInt("sal"));
				resultDTO.setComm(rs.getInt("comm"));
				resultDTO.setDeptno(rs.getInt("deptno"));	
			}
			
			
			rs.close();
			ps.close();
			conn.close(); // 커넥션 풀로 반환 : 대기열에 있으므로 연결은 되어 있는 상태(재활용 가능)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return resultDTO;
	}
	
	public int deleteEmp(EmpDTO empDTO) {
		
		int result = -1;
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "delete from emp2 ";
			query += "where empno = ? " ;
			PreparedStatement ps = conn.prepareStatement(query);
			// 첫 번째(첫 번째 인자의 숫자) 물음표에 두 번째 인자를 넣기
			ps.setInt(1, empDTO.getEmpno());
			
			// SQL 실행
			result = ps.executeUpdate();

			ps.close();
			conn.close(); // 커넥션 풀로 반환 : 대기열에 있으므로 연결은 되어 있는 상태(재활용 가능)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int insertEmp(EmpDTO empDTO) {
		
		int result = -1;
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "insert into emp2 ";
			query += "values(?, ?, ?, ?, ?, ?, ?, ?) ";
			PreparedStatement ps = conn.prepareStatement(query);
			// 첫 번째(첫 번째 인자의 숫자) 물음표에 두 번째 인자를 넣기
			ps.setInt(1, empDTO.getEmpno());
			ps.setString(2, empDTO.getEname());
			ps.setString(3, empDTO.getJob());
			ps.setInt(4, empDTO.getMgr());
			ps.setDate(5, empDTO.getHiredate());
			ps.setInt(6, empDTO.getSal());
			ps.setInt(7, empDTO.getComm());
			ps.setInt(8, empDTO.getDeptno());	
			
			// SQL 실행
			result = ps.executeUpdate();

			ps.close();
			conn.close(); // 커넥션 풀로 반환 : 대기열에 있으므로 연결은 되어 있는 상태(재활용 가능)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	public int updateEMP (EmpDTO empDTO) {
		
		int result = -1;
		try {
			// DB 접속 : 상단에서 생성해둠
			Connection conn = getConn();
			
			// SQL 준비
			String query = "update emp2 ";
			query += "set ";
			query += "ename = ?, ";
			query += "job = ?, ";
			query += "mgr = ?, ";
			query += "hiredate = ?, ";
			query += "sal = ?, ";
			query += "comm = ?, ";
			query += "deptno = ? ";
			query += "where empno = ? ";
			
			PreparedStatement ps = conn.prepareStatement(query);
			// 첫 번째(첫 번째 인자의 숫자) 물음표에 두 번째 인자를 넣기
			ps.setString(1, empDTO.getEname());
			ps.setString(2, empDTO.getJob());
			ps.setInt(3, empDTO.getMgr());
			ps.setDate(4, empDTO.getHiredate());
			ps.setInt(5, empDTO.getSal());
			ps.setInt(6, empDTO.getComm());
			ps.setInt(7, empDTO.getDeptno());	
			ps.setInt(8, empDTO.getEmpno());	
			
			// SQL 실행
			result = ps.executeUpdate();

			ps.close();
			conn.close(); // 커넥션 풀로 반환 : 대기열에 있으므로 연결은 되어 있는 상태(재활용 가능)
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	
	

}
