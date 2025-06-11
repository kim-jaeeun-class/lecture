package sec04.exam03.return00;

public class CarExam2 {

	public static void main(String[] args) {
		Car2 car2 = new Car2();
		car2.setGas(3);
		
		boolean status = car2.isLeftGas();
		System.out.println("?");
		
		if(status) {	// if (car.isLeftGas()) {로 써도 됨
			System.out.println("출발!");
			car2.run();
		}
		
		Car2 c2 = new Car2();
		c2.setGas(3);
		c2.run();
	}
}
