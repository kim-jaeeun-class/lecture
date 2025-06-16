package sec05.exam02.staticc;

//import java.util.Scanner;

public class Calculator {
	String color;
	static double pi = 3.14;
	
	static int price1;	// 이 코드는 성립하나, static int a 에서 static을 빼면 성립 불가
	static int a = 10; 
	static int price = a;
	
	static int price2;
//	price2 = 100; 사용 불가
	static {
		price2 = 100; // 사용 가능. 생성자로 price2값 지정이 불가하기 때문에 static 블럭을 지금처럼 유사 생성자로 사용.
	
//		System.out.println("값 입력");
//		Scanner sc = new Scanner(System.in);
//		sc.nextLine();
	}
	
	Calculator() {
		price = 10000;	// static이 아닌 곳에서 static을 가져다 쓰는 경우
	}

	public static void test() {
		// TODO Auto-generated method stub
		
	}
	
}
