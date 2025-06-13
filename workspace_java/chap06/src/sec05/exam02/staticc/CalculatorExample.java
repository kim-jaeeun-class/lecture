package sec05.exam02.staticc;

public class CalculatorExample {

	public static void main(String[] args) {
		
		Calculator c1 = new Calculator();
		c1.color = "black";
		System.out.println("c1.pi : " + c1.pi);
		
		System.out.println("Calculator.pi : " + Calculator.pi);
		
	}
}
