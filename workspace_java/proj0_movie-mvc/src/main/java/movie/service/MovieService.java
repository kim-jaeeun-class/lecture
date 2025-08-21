package movie.service;

import java.util.List;

import movie.dao.MovieDAO;
import movie.dto.MovieDTO;

public class MovieService {
	MovieDAO movieDAO = new MovieDAO();
	
	public List<MovieDTO> getMovie() {
		List<MovieDTO> list = movieDAO.selectMovie();
		return list;
	}
	
	public MovieDTO getDetail(MovieDTO movieDTO) {
		return movieDAO.selectDetailMovie(movieDTO);
	}
	
	public int removeMovie(MovieDTO movieDTO) {
		return movieDAO.deleteMovie(movieDTO);
	}
	
	public int addMovie(MovieDTO movieDTO) {
		return movieDAO.insertMovie(movieDTO);
	}
	
	public int editMovie(MovieDTO movieDTO) {
		return movieDAO.updateMovie(movieDTO);
	}
}
