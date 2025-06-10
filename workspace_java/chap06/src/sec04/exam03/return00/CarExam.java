package sec04.exam03.return00;

public class CarExam {

	public static void main(String[] args) {
		Car car = new Car();
		car.setGas(3);
		
		boolean status = car.isLeftGas();
		System.out.println("?");
		
		if(status) {	// if (car.isLeftGas()) {로 써도 됨
			System.out.println("출발!");
			car.run();
		}
	}
}
