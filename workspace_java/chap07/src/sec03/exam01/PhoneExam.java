package sec03.exam01;

public class PhoneExam {

	public static void main(String[] args) {
		// Phone phone = new Phone(); abstract class는 new 불가
		SmartPhone sp = new SmartPhone();
		
		Phone phone = (Phone)sp;
	}

}
