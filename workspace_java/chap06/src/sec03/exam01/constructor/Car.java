package sec03.exam01.constructor;

public class Car {
//	Car() {
//		System.out.println("Car 생성자 실행");
//	}
//	Car() { // 이런 형태일 때, 자동으로 기본 생성자 추가
//		
//	} 
	
	String model = "아반떼";
	String color = "빨강";
	int maxSpeed;
	
	CarExam carExam = new CarExam();
	
	Car() {
		color = "빨강";
	}
	
//	Car(String c) {
//		color = c;
//	}
	
	Car(String c) {
//		color = c;
//		model = "아반떼";
//		maxSpeed = 240;
//		
//		Car("아반떼", c, 240); 불가!
		
		this("아반떼", c, 240); // Car로 실행하면 오류 발생. new가 된 자신을 실행하도록.
	}
	
	Car(String m, String c, int ms) {
		model = m;
		color = c;
		maxSpeed = ms;
	}
	
	void setColor(String color) {
		this.color = "빨강";
	}
} 
