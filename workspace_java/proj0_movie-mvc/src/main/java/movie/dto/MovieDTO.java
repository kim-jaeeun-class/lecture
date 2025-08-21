package movie.dto;

import java.sql.Date;

public class MovieDTO {
	private Integer movieid;
	private String title;
	private String imgurl;
	private Date opendate;
	public int getMovieid() {
		return movieid;
	}
	public void setMovieid(int movieid) {
		this.movieid = movieid;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getImgurl() {
		return imgurl;
	}
	public void setImgurl(String imgurl) {
		this.imgurl = imgurl;
	}
	public Date getOpendate() {
		return opendate;
	}
	public void setOpendate(Date opendate) {
		this.opendate = opendate;
	}
	
	@Override
	public String toString() {
		return "MovieDTO [movieid=" + movieid + ", title=" + title + ", imgurl=" + imgurl + ", opendate=" + opendate
				+ "]";
	}
	
	
}
