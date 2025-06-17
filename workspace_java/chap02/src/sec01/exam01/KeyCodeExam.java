package sec01.exam01;

import java.io.IOException;
import java.util.Scanner;

public class KeyCodeExam {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		{
			//print
			System.out.println(1);
			System.out.println(2);
			System.out.print(3);
			System.out.print(4);
			System.out.println(5);
			System.out.println(6);
		}
		
		{
			// printf
			System.out.printf("이름 : %s", "김자바");
			System.out.println();
			System.out.printf("이름 : %s, 나이 : %d", "김자바", 25);
			System.out.println();
			System.out.printf("이름 : %6s, 나이 : %04d", "김자바", 25);
		} // 혹시 모르니 주석 처리하고 아랫부분 실행해보기

		
		{ 
			// system.in.read
			
			try {
				int keyCode = System.in.read();
				System.out.println("KeyCode : " + keyCode);
				
				keyCode = System.in.read();
				System.out.println("KeyCode : " + keyCode);
				
				keyCode = System.in.read();
				System.out.println("KeyCode : " + keyCode);
			} catch (IOException e) {
				e.printStackTrace();
			}
			
		}
		
		{
			Scanner scan = new Scanner(System.in);
			String inputData = scan.nextLine(); // 엔터 입력 후 적은 모든 것을 보임
			System.out.println("inputData : " + inputData);
			
			String inputData2 = scan.next(); // 엔터 입력 후 ~ 띄어쓰기 전까지만 보임. nextLine에 비해 잘 사용하지 않음. 띄어쓰기 뒤의 값은 뒷 부분에서 쓰이는 듯.
			System.out.println("inputData : " + inputData2);
			
			int input = scan.nextInt(); // 엔터 쳤을 때의 숫자
			System.out.println("input : " + input * 10);
			
			int input2 = scan.nextInt();
			System.out.print("입력한 x값: " + input2);
		}
	}

}