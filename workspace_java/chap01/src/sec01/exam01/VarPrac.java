package sec01.exam01;

public class VarPrac {

	public static void main(String[] args) {
		{
			int hour = 3; // hour 변수 지정 및 초기화
			int minute = 5; // minute 변수 지정 및 초기화
			System.out.println(hour + "시간" + minute + "분"); // hour와 minute는 할당된 값으로 입력. 시간, 분은 문자열이라 그대로 출력.
			
			int totalMinute = (hour*60) + minute; // totalMinute라는 변수 지정 및 할당
			System.out.println("총 " + totalMinute + "분"); // 총, 분은 문자열이라 그대로 출력. totalMinute는 할당된 값으로 출력.
		}
		
		{
			int x = 3; // x 선언. 3으로 할당.
			int y = 5; // y 선언. 5로 할당.
			System.out.println("x : " + x + ", y : " + y);
			
			int temp = x; // temp 선언. temp를 x의 값 3으로 할당. (temp = 3)
			x = y; // x 초기화. x는 y의 값 5로 할당됨. (x = 5)
			y = temp; // y 초기화. y는 temp의 값 3으로 할당됨. (y = 3)
			System.out.println("x : " + x + ", y : " + y);
		}
		
		{
			int v1 = 0;
			if (true) {  
				int v2 = 0; 
				if (true) { 
					int v3 = 0;
					v1 = 1;
					v2 = 1;
					v3 = 1;
					v1 = v2 + v3;
				}
			}
			System.out.println(v1);
		} 
		
		{
			// VarTypeExam의 Q2를 나머지 연산자 써서 해보기
			
			int num = 537;
			int hun = num / 100;
			int ten = (num % 100) / 10;
			int one = (num % 100) % 10;
			
			System.out.println(hun); // 테스트 1. 백의 자리.
			System.out.println(ten); // 테스트 2. 십의 자리.
			System.out.println(one); // 테스트 3. 일의 자리.
			
			System.out.println("백의 자리 : " + hun + "\n십의 자리 : " + ten + "\n일의 자리 : " + one); // 최종 출력
		}
	
	
	} 

}
