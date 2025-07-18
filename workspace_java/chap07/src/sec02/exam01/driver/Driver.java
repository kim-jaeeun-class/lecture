package sec02.exam01.driver;

public class Driver {
	void driveTico(Tico tico) {
		System.out.println("Only for TICO");
		tico.run();
		tico.autoRun();
	}
	
	void drive(Car car) {
		System.out.println("Run");
		car.start();
		car.run();
		
		// Tico의 부모라면,
		if(car instanceof Tico) {
			System.out.println("Tico?");
			Tico tico = (Tico) car;
			tico.autoRun();
		}
		car.stop();
		
//		car.autoRun(); 사용 불가
	}
} 
