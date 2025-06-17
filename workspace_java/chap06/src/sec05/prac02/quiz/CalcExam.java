package sec05.prac02.quiz;

import java.util.Scanner;

public class CalcExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Calc c = new Calc();
		
		System.out.println("첫 번째 수를 입력해주세요.");
		int num1 = sc.nextInt();
		sc.nextLine();	// 이거 넣어줘야 오류가 안 생긴다...
		
		System.out.println("사칙연산자를 입력해주세요. 단, +, -, *, /, % 형태만 인정.");
		String op = sc.nextLine();
		
		System.out.println("두 번째 수를 입력해주세요.");
		int num2 = sc.nextInt();
		
		int result = c.math(num1, num2, op);
		
		System.out.println(num1 + " " + op + " " + num2 + " = " + result);
		
		sc.close();
	}

}
