package sec05.prac02.quiz;

public class Calc {
	
	int math(int num1, int num2, String op) {	// 숫자랑 연산자
		int result = 0;	// 일단 0이라는 값 설정해두고...
		
		if (op.equals("+")) {
			result = num1 + num2;
		}
		else if (op.equals("-")) {
			result = num1 - num2;
		}
		else if (op.equals("*")) {
			result = num1 * num2;
		}
		else if (op.equals("/")) {
			result = num1 / num2;
		}
		else if (op.equals("%")) {
			result = num1 % num2;
		}
		else {	// 이렇게 되면 result가 0이 될 수밖에 없다는 게 문제인데...
			System.out.println("잘못된 부호를 입력하셨습니다.");
		}
		return result;
	}
}
