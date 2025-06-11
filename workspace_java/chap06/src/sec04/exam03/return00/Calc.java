package sec04.exam03.return00;

public class Calc {
	
	// 전원 메소드(ON)
	
	void powerOn() {
		System.out.println("전원을 켭니다.");
	}
	
	// 전원 메소드(OFF)
	
	void powerOff() {
		System.out.println("전원을 끕니다.");
		return;	// 생략 가능.
	}

	/*
	 * 더하기 기능 생성 : 두 수를 입력받아 더한 결과
	 * 메스드명(plus), 전달인자(int x, int y)
	 * 리턴 타입(int, 즉 두 수의 합);
	 */
	
	int plus(int x, int y) {
		return x + y;
	}
	
	// 나누기 메소드
	
	double divide(int a, int b) {
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		double result1;
		if ( b == 0 ) {
			System.out.println("잘못된 값입니다.");
			result1 = 0;
			return result1;	
		}
		else {
			result1 = (double) a / (double) b;
			return result1;	
		}							
	}
	
	
	// int 배열의 모든 값을 더하는 메소드 만들기
	
	int sum(int[] array) {
		int sum = 0;
		array[0] = 6;
		for (int i = 0; i < array.length; i++) {
			sum += array[i];
		}
		return sum;
	}
	
	// 가변인자
	int sum2(int ... values) {
		int sum = 0;
		if(values != null) {
			for (int i = 0; i < values.length; i++) {
				sum += values[i];
			}
		}
		return sum;
	}
	
	// 평균값 및 출력 (메소드 내에서 다른 메소드 호출하기)
	
	double avg(int x, int y) {
		int sum = plus(x, y); // 앞의 plus 메소드 활용. 두 값을 더한 값을 sum에 저장.
		double result = (double) sum / 2; // 평균값 구하기
		return result;
	}
	
	void execute(int a1, int a2) {
		double result = avg(a1, a2);
		System.out.println(a1 + "과 " + a2 + "의 평균은 " + result);
	}
	
	
}
