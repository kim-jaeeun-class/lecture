package movie.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.sql.DataSource;

import emp.dto.EmpDTO;
import movie.dto.MovieDTO;

public class MovieDAO {
	
	// connection
	private Connection getConn() {
		Connection conn = null;
		try {
			Context ctxt = new InitialContext();
			DataSource dataFactory = (DataSource) ctxt.lookup("java:/comp/env/jdbc/oracle");
			
			conn = dataFactory.getConnection();
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
		return conn;
	}
	
	// allList
	public List<MovieDTO> selectMovie() {
		List<MovieDTO> list = new ArrayList<MovieDTO>();
		try {
			Connection conn = getConn();
			
			String query = "select * from movie";
			PreparedStatement pre = conn.prepareStatement(query);
			
			ResultSet res = pre.executeQuery();
			
			while(res.next()) {
				MovieDTO dto = new MovieDTO();
				
				// dto 만들기
				dto.setMovieid(res.getInt("movieid"));
				dto.setTitle(res.getString("title"));
				dto.setImgurl(res.getString("imgurl"));
				dto.setOpendate(res.getDate("opendate"));
				
				list.add(dto);
				
			}
			
			res.close();
			pre.close();
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}
	
	// detail
	public MovieDTO selectDetailMovie(MovieDTO movieDTO) {
		MovieDTO resultDTO = null;
		
		try {
			Connection conn = getConn();
			
			String query = "select * from movie ";
			query += "where movieid = ?";
			
			PreparedStatement pre = conn.prepareStatement(query);
			
			pre.setInt(1, movieDTO.getMovieid());
			
			ResultSet res = pre.executeQuery();
			
			if(res.next()) {
				resultDTO = new MovieDTO();
				
				int movieid = res.getInt("movieid");
				resultDTO.setMovieid(movieid);
				resultDTO.setTitle(res.getString("title"));
				resultDTO.setImgurl(res.getString("imgurl"));
				resultDTO.setOpendate(res.getDate("opendate"));
			}
			
			conn.close();
			pre.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return resultDTO;
	}
	
	// delete
	public int deleteMovie(MovieDTO movieDTO) {
		int result = -1;
		try {
			Connection conn = getConn();
			
			String query = "delete from movie ";
			query += "where movieid = ?";
			PreparedStatement pre = conn.prepareStatement(query);
			// 위치 숫자, movieDTO.get변수명()
			pre.setInt(1, movieDTO.getMovieid());
			
			result = pre.executeUpdate();
			
			pre.close();
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// insert
	public int insertMovie(MovieDTO movieDTO) {
		int result = -1;
		
		try {
			Connection conn = getConn();
			
			String query = "";
			PreparedStatement pre = conn.prepareStatement(query);
			
			pre.setInt(1, movieDTO.getA());
			
			result = pre.executeUpdate();
			
			conn.close();
			pre.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	// update
	public int updateMovie(MovieDTO movieDTO) {
		int result = -1;
		try {
			Connection conn = getConn();
			
			String query = "";
			
			PreparedStatement pre = conn.prepareStatement(query);
			pre.setString(1, movieDTO.getA());
			
			result = pre.executeUpdate();
			
			pre.close();
			conn.close();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
}
