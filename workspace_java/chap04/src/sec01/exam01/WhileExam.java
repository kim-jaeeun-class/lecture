package sec01.exam01;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
				
		{
			int i = 1;
			while (i <= 10) {
				System.out.println(i);
				i++;
			}
		}
		
		/*
		 * 메뉴를 고르시오
		 * 1 : 커피, 2 : 차, 0 : 종료
		 */
		
		System.out.println("메뉴를 고르시오.");
		System.out.println("1 : 커피 / 2 : 차 / 0 : 종료");
		
		Scanner sc = new Scanner(System.in);
		int menu = sc.nextInt();
		
		if(menu == 1) {
			System.out.println("커피를 준비하겠습니다.");
		}
		else if(menu == 2) {
			System.out.println("차를 준비하겠습니다.");
		}
		else if(menu == 0) {
			System.out.println("주문을 종료합니다.");
		}
		else {
			System.out.println("잘못 입력하셨습니다.");
		}
		
		int menu1 = -1; // 여기에서 값을 설정하지 않으면 while 조건 설정 불가
		
		while(menu1 != 0) { // for( ; menu1 != 0; ) { 으로 바꿀 수 있음.
			
			System.out.println("메뉴를 고르시오.");
			System.out.println("1 : 커피 / 2 : 차 / 0 : 종료");
			
			menu1 = sc.nextInt();
			
			if(menu1 == 1) {
				System.out.println("커피를 준비하겠습니다.");
			}
			else if(menu1 == 2) {
				System.out.println("차를 준비하겠습니다.");
			}
			else if(menu1 == 0) {
				System.out.println("주문을 종료합니다.");
			}
			else {
				System.out.println("잘못 입력하셨습니다.");
			}
		}
		
		
		
		
		sc.close();
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
