package sec05.exam02.staticc;

public class CalculatorExample {

	public static void main(String[] args) {	
		
		Calculator c1 = new Calculator(); // Exam 내의 다른 블럭을 다 주석처리해도 Static 블럭 안의 코드만은 실행됨. 주석 처리된 Scanner 코드로 확인 가능.
		c1.color = "black";
		System.out.println("c1.pi : " + c1.pi);
		
		System.out.println("Calculator.pi : " + Calculator.pi);
		
		test();	// 테스트용
		
	}
	
	// 1. 메소드명 test 만들기
	// 전달 인자, 리턴 타입 없음
	// 어떤 말이든 출력하는 테스트 메소드
	// 2. test 메소드 사용
	
	static void test() {	// 테스트용
		System.out.println("출력용");
	}
	
}
