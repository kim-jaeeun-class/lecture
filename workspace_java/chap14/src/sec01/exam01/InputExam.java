package sec01.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

public class InputExam {
	public static void main(String[] args) {
		// 파일 경로 지정
		// 지금 내가 작성한 파일은 예제용 tmp 폴더가 아니라 JAVA 툴 폴더로 바꿔봄
		String fullPath = "D:\\tools\\Java\\STS 3\\STS.ini";
		
		try(InputStream is = new FileInputStream(fullPath);) {
			// 얼마나 가져갈지 크기 설정
//			int BUFFER_SIZE = 1024 * 8;
			int BUFFER_SIZE = 20;
			byte[] datas = new byte[BUFFER_SIZE];
			
			String data = "";
			int result = 0;
			
			result = is.read(datas);
//			if(result != -1) {
//				data += new String(datas, 0, result);				
//			}
//			while(result != -1) {
//				result = is.read(datas);
//				if(result != -1) {
//					data += new String(datas, 0, result);
//				}
//			}
			
			// 위 주석을 간략화한 버전
			while((result = is.read(datas)) != -1) {
				data += new String(datas, 0, result);
				System.out.println("-------------------------------");
				System.out.println(data);
			}
			
		}
		catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
