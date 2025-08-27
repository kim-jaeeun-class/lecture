package paging.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import paging.dto.PagingDTO;


public class PagingDAO {
	
	// DB 접속용 getConn 만들기
	private Connection Conn() {
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
	
	public List<PagingDTO> selectAll(int r) {
	    List<PagingDTO> list = new ArrayList<>();
	    try (Connection conn = Conn()) {
	        String query = "select * from (select test.*, row_number() over(order by hiredate desc) as r from test) where r >= ?";
	        PreparedStatement ps = conn.prepareStatement(query);
	        ps.setInt(1, r);

	        ResultSet rs = ps.executeQuery();
	        while(rs.next()) { 
	            PagingDTO dto = new PagingDTO();
	            dto.setEmpno(rs.getInt("empno"));
	            dto.setEname(rs.getString("ename"));
	            dto.setJob(rs.getString("job"));
	            dto.setMgr(rs.getInt("mgr"));
	            dto.setHiredate(rs.getDate("hiredate"));
	            dto.setComm(rs.getInt("comm"));
	            dto.setDeptno(rs.getInt("deptno"));
	            dto.setR(rs.getInt("r"));

	            list.add(dto);
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	
	public List<PagingDTO> selectPageEMP(PagingDTO dto) {
		List<PagingDTO> list = new ArrayList<>();
		
	    try (Connection conn = Conn()) {
	        String query = "select * ";
	        	   query += "from (select test.*, row_number() over(order by hiredate desc) as r from test) ";
	        	   query += "where r>=? and r<=?";
	        
	        PreparedStatement ps = conn.prepareStatement(query);
			ps.setInt(1, dto.getR());
			ps.setInt(2, dto.getR());

	        ResultSet rs = ps.executeQuery();
	        while(rs.next()) { 
	            PagingDTO dto1 = new PagingDTO();
	            dto1.setEmpno(rs.getInt("empno"));
	            dto1.setEname(rs.getString("ename"));
	            dto1.setJob(rs.getString("job"));
	            dto1.setMgr(rs.getInt("mgr"));
	            dto1.setHiredate(rs.getDate("hiredate"));
	            dto1.setComm(rs.getInt("comm"));
	            dto1.setDeptno(rs.getInt("deptno"));
	            dto1.setR(rs.getInt("r"));

	            list.add(dto);
	        }
	        
	    }
	    catch(Exception e) {
	        e.printStackTrace();
	    }
		return list;
	}
	
	public List<PagingDTO> selectAllEMP() {
	    List<PagingDTO> list = new ArrayList<>();
	    try (Connection conn = Conn()) {
	        String query = "select * from (select test.*, row_number() over(order by hiredate desc) as r from test)";
	        PreparedStatement ps = conn.prepareStatement(query);

	        ResultSet rs = ps.executeQuery();
	        while(rs.next()) { 
	            PagingDTO dto = new PagingDTO();
	            dto.setEmpno(rs.getInt("empno"));
	            dto.setEname(rs.getString("ename"));
	            dto.setJob(rs.getString("job"));
	            dto.setMgr(rs.getInt("mgr"));
	            dto.setHiredate(rs.getDate("hiredate"));
	            dto.setComm(rs.getInt("comm"));
	            dto.setDeptno(rs.getInt("deptno"));
	            dto.setR(rs.getInt("r"));

	            list.add(dto);
	        }
	    } catch(Exception e) {
	        e.printStackTrace();
	    }
	    return list;
	}
	
	public int selectTotalEMP() {
		
		int result = -1;
		
	    try (Connection conn = Conn()) {
	        String query = "select count(*) cnt from test";
	        
	        PreparedStatement ps = conn.prepareStatement(query);

	        ResultSet rs = ps.executeQuery();
	        
	        while(rs.next()) {
	        	result = rs.getInt("cnt");
	        }
	        
	    }
	    catch(Exception e) {
	        e.printStackTrace();
	    }
		return result;
	}
	
	public List<PagingDTO> search(PagingDTO dto) {
		List<PagingDTO> list = new ArrayList<>();
		
	    try (Connection conn = Conn()) {
	        String query = "select t1.* "
	        		+ "from\r\n"
	        		+ "    (select rownum r, t.* "
	        		+ "     from (select * "
	        		+ "           from test "
	        		+ "           where lower(ename) like lower('%' || ? || '%') "
	        		+ "           order by hiredate desc) t) t1 "
	        		+ "where r>=? and r<=?";
	        
	        PreparedStatement ps = conn.prepareStatement(query);
			ps.setString(1, dto.getKeyword());
	        ps.setInt(2, dto.getR());
			ps.setInt(3, dto.getR());
			

	        ResultSet rs = ps.executeQuery();
	        while(rs.next()) { 
	            PagingDTO dto1 = new PagingDTO();
	            dto1.setEmpno(rs.getInt("empno"));
	            dto1.setEname(rs.getString("ename"));
	            dto1.setJob(rs.getString("job"));
	            dto1.setMgr(rs.getInt("mgr"));
	            dto1.setHiredate(rs.getDate("hiredate"));
	            dto1.setComm(rs.getInt("comm"));
	            dto1.setDeptno(rs.getInt("deptno"));
	            dto1.setR(rs.getInt("r"));

	            list.add(dto);
	        }
	        
	    }
	    catch(Exception e) {
	        e.printStackTrace();
	    }
		return list;
	}


}
