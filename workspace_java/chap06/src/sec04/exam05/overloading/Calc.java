package sec04.exam05.overloading;

public class Calc {
	int plus(int a, int b) {
		System.out.println("int 실행");
		return a + b;
	}
//	int plus(int a, int b) { 매개변수가 다 int로 같아서 오버로딩 불가
//		return a + b;
//	}
	double plus(double a, double b) {
		System.out.println("double 실행");
		return a + b;
	}
	double plus(int a, double b) {
		System.out.println("int, double 실행");
		return a + b;
	}
	
//	int plus(int b, int a) {	// 사용 불가. 변수명이 달라도 타입이 다 같기 때문에.
//		System.out.println("int 실행");
//		return a + b;
//	}
	
}
