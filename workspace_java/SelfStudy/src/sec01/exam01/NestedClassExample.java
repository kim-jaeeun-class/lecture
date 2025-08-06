package sec01.exam01;

import sec01.exam01.Car.Engine;
import sec01.exam01.Car.Tire;

public class NestedClassExample {
	public static void main(String[] args) {
		
		// 바깥 클래스에서 멤버 클래스의 객체를 생성하는 코드를 빈칸에 작성
		
		Car myCar = new Car();
		
		Car.Tire tire = new Tire();// 세미콜론 앞에 코드 넣기
				
		Car.Engine engine = new Engine();// 세미콜론 앞에 코드 넣기
	}
}
