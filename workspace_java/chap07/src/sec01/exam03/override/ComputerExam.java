package sec01.exam03.override;

public class ComputerExam {

	public static void main(String[] args) {
		Calc calc = new Calc();
		System.out.println(calc.areaCircle(3));
		
		Computer com = new Computer();
		System.out.println(com.areaCircle(3));
		
		// Override 된 상태
		System.out.println(com.plus(3, 2));
	}

}
