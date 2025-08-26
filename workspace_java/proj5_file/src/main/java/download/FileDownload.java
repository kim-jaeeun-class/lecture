package download;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/download")
public class FileDownload extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		// 파일명 받기
		String filename = request.getParameter("filename");
		System.out.println(filename);
		// 파일 읽어올 경로
		String path = "c:\\tmp\\upload";
		
		File file = new File(path + "\\" + filename);
		
		// 브라우저 캐시(메모리)를 사용하지 않도록 설정
		response.setHeader("Cache-control", "no-cache");
		
		// 현재 응답이 첨부파일이고,
		// 첨부파일 다운로드 받을 때, 원본 이름(filename)으로 받도록 설정(총 2가지가 설정됨)
		response.addHeader("Content-disposition", "attachment; fileName=" + filename);
		
		// 파일 읽기 시작 : File file의 file
		InputStream is = new FileInputStream(file);
		// 메모리로 퍼 올릴 바가지(버퍼 사이즈) 설정
		byte[] BUF = new byte[1024*8];	// 보통 8kB로 설정
		
		// 브라우저로 내보낼 객체
		OutputStream os = response.getOutputStream();
		// 얼마나 읽었는지
		int count = -1;
		
		// is.read[BUF]가 대입된 count가 -1과 같지 않은 동안
		// -1의 의미 : 바가지 크기만큼 읽으려 시도했는데, 읽을 것이 없을 경우
		while((count = is.read(BUF)) != -1) {
			// 0부터 읽은 만큼 브라우저로 내보내기
			// 0 : offset. 지금 읽은 것에서 얼마나 건너 뛸지.
			// count : 보낼 Byte 수
			os.write(BUF, 0, count);
		}
		
		os.flush();
		os.close();
		is.close();
	}

}
