package sec04.exam05.overloading;

public class CalcExam {

	public static void main(String[] args) {
		Calc c = new Calc();
		
		c.plus(1, 2);	 // int int를 주석 처리해도 double int 등으로 자동 형 변환해 실행 
		c.plus(1.5, 3.5);
		c.plus(1, 13.2);
		
		System.out.println();
	}

}
