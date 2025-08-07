package sec01.exam01;

public class NestedClassExample {
	public static void main(String[] args) {
		
		// 바깥 클래스에서 멤버 클래스의 객체를 생성하는 코드를 빈칸에 작성
		
		Car myCar = new Car();
		
		// 이건 이렇게 찍으니 되는... 듯?
		// 문제 의도대로 한 건지 모르겠다.
		Car.Tire tire = myCar.new Tire();// 세미콜론 앞에 코드 넣기
		
		// 이건 static이라 되는 것 같고...
		Car.Engine engine = new Car.Engine();// 세미콜론 앞에 코드 넣기
	}
}
