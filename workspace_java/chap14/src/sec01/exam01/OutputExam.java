package sec01.exam01;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class OutputExam {

	public static void main(String[] args) {
		
		String path = "c:\\tmp";
		String fileName = "stream.txt";
		
		OutputStream os = null;
		
		try {
			// 스트림 열기
//			os = new FileOutputStream(path + "\\" + fileName); 기기 간 호환성 문제로 이것보단 아래 것을 사용
			os = new FileOutputStream(path + System.getProperty("file.separator") + fileName);
			
			// 이쪽 데이터를 바꾸면 덮어쓰는 방식으로 나옴
			String data = "abc\n한글\n123\n더더더테스트";
			
			byte[] datas = data.getBytes();
			
			// 쓰기 : 같은 코드 2번 쓰면 문서 내에 글이 두 번 작성됨
			os.write(datas, 0, datas.length);
			// 버퍼에 남은 데이터 모두 출력
			os.flush();
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		finally {
			if(os != null) {
				try {
					os.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}
	
	static void saveTxt(String data) {
		
		String path = "c:\\tmp";
		String fileName = "stream.txt";
		
		//try-with-resources : close()를 자동으로 진행
		try(OutputStream os = 
				new FileOutputStream(
				path + System.getProperty("file.separator") + fileName);) {
			byte[] datas = data.getBytes();
			os.write(datas, 0, datas.length);
			os.flush();			
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
