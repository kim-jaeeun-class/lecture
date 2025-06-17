package sec04.exam03.return00;

public class CalcExam {

	public static void main(String[] args) {
		
		Calc c = new Calc();
		System.out.println("전원");
		c.powerOn();	// 메소드 호출로 실행
		c.powerOff();
		
		System.out.println("덧셈");
		int sum = c.plus(5, 7);
		System.out.println("sum : " + sum);
		
		int a = 9;
		sum = c.plus(a, 7);
		System.out.println("sum : " + sum);
		
		
		// 나눗셈
		System.out.println("나눗셈");
		double divide = c.divide(0, 0);
		System.out.println("divide : " + divide);
		
		// 배열의 모든 값을 더하기
		int[] d = {1, 2, 3, 4, 5};
		int sum2 = c.sum(d);
		System.out.println(sum2);
		System.out.println(d[0]); // 6으로 출력. 얕은 복사.
		
		c.execute(23124, 2319);
	}

}
