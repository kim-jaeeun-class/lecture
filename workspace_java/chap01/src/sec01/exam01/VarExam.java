package sec01.exam01;

public class VarExam {

	public static void main(String[] args) {
			
		int value; // 변수 선언
		value = 5; // 변수 초기화
		
		int result = value + 10; // 변수 value를 사용한 연산 진행
		
		System.out.println(result); // 연산의 결과 result를 출력
		
		int hour = 3; // hour 변수 선언 & 초기화
		int minute = 5; // minute 변수 선언 & 초기화
		System.out.println(hour + "시간," + minute + "분"); // 문자열은 ""로 입력.
		
		/* int value; 식의 재선언 불가 */
		value = value + 1; // 변수 value에 1을 더해 value 값을 초기화
		System.out.println(value + " : Value ver.2");
		
		/* 단축키 목록
		 * 한 줄 지우기 : ctrl + d
		 * 한 줄 복사   : ctrl + alt + 상하 방향키
		 * 주석 단축키  : ctrl + /
		 * 한 줄 이동   : alt + 상하 방향키
		 * 자동 정렬    : ctrl + shift + f */
		
		int a = 10;
		// int b; 이 상태로만 println(b) 시 b 출력 불가
		System.out.println("a : " + a);
		
		int x = 10;
		int y = x;
		System.out.println(y);
		
		{
			System.out.println(x); // 출력 가능
			int z = 5;
			System.out.println(z); // 출력 가능
		}
		// int z = 7;
		// System.out.println(z); // 출력 불가. z는 중괄호 내에서 완결됨. 윗 주석처럼 새로 선언해야 출력 가능.

		
		// 숙제
		int x1 = 20;
		int x2 = 30;
		
		int qqq = x1;
		x1 = x2;
		x2 = qqq;
		
		
		System.out.println("x1 : " + x1); // 30 나오게 출력.
		System.out.println("x2 : " + x2); // 20 나오게 출력.
		
		
	}

}
