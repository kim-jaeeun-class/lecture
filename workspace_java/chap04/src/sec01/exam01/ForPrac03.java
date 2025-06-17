package sec01.exam01;

import java.util.Scanner;

public class ForPrac03 {

	public static void main(String[] args) {
		
		// Q2.
		
		System.out.println("Q2.");
		
		int sumQ3 = 0;
		for(int i = 1; i <= 100; i++) {
			if (i % 3 == 0) {
				sumQ3 += i;
			}
		}
		System.out.println(sumQ3);
	
		
		// Q3.
		
		System.out.println("Q3.");
		
		boolean game = true;
		int count = 0;
		
		while(game) {
			int dice1 = (int) (Math.random() * 6) + 1;
			int dice2 = (int) (Math.random() * 6) + 1;
			
			if ( (dice1 + dice2) == 5 ) {
				game = false;
			}
			else {
				System.out.println( "(" + dice1 + ", " + dice2 + ")" );
				count++;
			}
		}
		System.out.println("총 게임 수 : "+ count);
	
		
		// Q4.
		
		System.out.println("Q4.");
		
		for(int x = 1; x <= 10; x++) {
			for(int y = 1; y <= 10; y++) {
				if(((4 * x) + (5 * y)) == 60) {
					System.out.println("(" + x + ", " + y + ")");
				}
			}
		}
		
		
		// Q5.
		
		System.out.println("Q5.");
		
		int lineNum = 4; // 줄 수 달라도 출력되도록
		
		for (int i = 1; i <= lineNum; i++) {
			for(int i2 = 1; i2 <= i; i2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q6.
		
		System.out.println("Q6.");
		
		for (int i = 1; i <= lineNum; i++) {
			for(int i1 = 1; i1 <= (lineNum - i); i1++) {
				System.out.print(" ");
			}
			for(int i2 = 1; i2 <= i; i2++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		// Q7.
		
		System.out.println("Q6.");
		
		boolean run = true;
		int balance = 0;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("------------------------------------");
			System.out.println("1.예금 | 2.출금 | 3.잔고 | 4.종료");
			System.out.println("------------------------------------");
			System.out.println("선택> ");
			
			// 여기가 코드 넣는 곳
			int num = scanner.nextInt();
			
			if(num <= 0 || num > 4) {
				System.out.println("잘못 입력했습니다.");
			}
			else if(num == 1) {
				int in = scanner.nextInt();
				balance += in;
				System.out.println("예금액>" + in);
			}
			else if(num == 2) {
				int out = scanner.nextInt();
				balance -= out;
				System.out.println("출금액>" + out);
			}
			else if(num == 3) {
				System.out.println("잔고>" + balance);
			}
			else {
				run = false;
			}
			
			
		}
		System.out.println("프로그램 종료");
		scanner.close();
		
	}

}
