package sec02.exam01;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ThrowsExam {
	public static void main(String[] args) {
		try {
			test();
		}
		catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// throw용 try-catch
		try {
			test2(2313);
		}
		catch (HumanException e) {
			e.printStackTrace();
			System.out.println("getMessage 써보기");
			System.out.println(e.getMessage());
			
			String errorCode = e.getMessage();
			if(errorCode.equals("EV10")) {
				System.out.println("볼륨은 10 이하만 가능합니다.");
			}
		}
		
		// try-with-resources
		// 이쪽은 try-with-resources를 안 쓴 상태
		FileInputStream fis = null;
		try {
			fis = new FileInputStream("C:\\tmp\\text.txt");
			// fis 관련 작업 코드가 있다고 치기
			// 뭔가... 중도 예외 발생
		}
		catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		finally {
			if(fis != null) {
				try {
					fis.close();
				}
				catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		// try-with-resources를 쓰기
		// close() 자동 실행해줌
		// Closable 인터페이스가 있는 클래스만 () 안에 넣을 수 있음
		try(
//				String a = ""; Closable 인터페이스가 없어서 사용 불가
				FileInputStream fis2 = new FileInputStream("C:\\tmp\\text.txt");) {
			System.out.println("TWR 테스트용");
			System.out.println(fis2);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	static void test() throws ClassNotFoundException, IOException {
		Class.forName("testText");
	}
	
	static void test2(int volume) throws HumanException {
		if(volume > 10) {
			throw new HumanException("EV10");
		}
		else if(volume < 0) {
			throw new HumanException("EV0");
		}
		System.out.println("volume : " + volume);
	}
	
	static void test3() {
		try {
			"ㅁ".equals(null);
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
