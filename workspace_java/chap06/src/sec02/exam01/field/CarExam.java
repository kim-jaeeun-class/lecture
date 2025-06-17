package sec02.exam01.field;

public class CarExam {
	static int a = 10;
	public static void main(String[] args) {
		
		Car myCar = new Car(); // 객체(클래스) 생성
		
		System.out.println(myCar.company);
		myCar.company = "벤틀리";
		System.out.println(myCar.company);	// 바뀐 값 벤틀리로 출력
		
		System.out.println(myCar.speed);
		myCar.speed = 150;
		System.out.println(myCar.speed);
		
		Car myCar2 = new Car();
		System.out.println(myCar2.company);	// 원래 값(현대자동차)으로 출력
											// 이유 : myCar과 myCar2는 다른 인스턴스기 때문
		
		System.out.println("a : " + a);	// 가능!
		
	}

}
