package sec02.exam01;

public class HumanException extends Exception {
	HumanException() {
		System.out.println("HumanException 생성자 파트");
	}
	
	HumanException(String message) {
		super(message);
		System.out.println("HumanException 생성자 - (String)이 있음");
	}
}
