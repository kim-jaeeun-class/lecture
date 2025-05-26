package sec01.exam01;

public class VarPrac {

	public static void main(String[] args) {
		{
			int hour = 3; // hour 변수 지정 및 초기화
			int minute = 5; // minute 변수 지정 및 초기화
			System.out.println(hour + "시간" + minute + "분"); // hour와 minute는 초기화된 값으로 입력. 시간, 분은 문자열이라 그대로 출력.
			
			int totalMinute = (hour*60) + minute; // totalMinute라는 변수 지정 및 초기화
			System.out.println("총 " + totalMinute + "분"); // 총, 분은 문자열이라 그대로 출력. totalMinute는 초기화된 값으로 출력.
		}
		
		{
			int x = 3; // x 선언. 3으로 초기화.
			int y = 5; // y 선언. 5로 초기화.
			System.out.println("x : " + x + ", y : " + y);
			
			int temp = x; // temp 선언. temp를 x의 값 3으로 초기화. (temp = 3)
			x = y; // x 초기화. x는 y의 값 5로 초기화 됨. (x = 5)
			y = temp; // y 초기화. y는 temp의 값 3으로 초기화 됨. (y = 3)
			System.out.println("x : " + x + ", y : " + y);
		}
		
	
	
	} 

}
