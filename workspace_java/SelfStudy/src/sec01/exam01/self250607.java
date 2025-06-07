package sec01.exam01;

import java.util.Scanner;

public class self250607 {

	public static void main(String[] args) {
		
		/* 
		 * 전체적으로 배웠던~실제 했던 내용이라 이유 달 만한 부분은 없었으나,
		 * 사이트에 정답 체크 시킬 때 1라인 제거 후 3~5 라인을 아래처럼 변경시키지 않으면
		 * 컴파일 에러 발생하므로 꼭 바꿔두기.
		 * 
		 * import java.util.*;
		 *
		 * public class Main{
		 */
		
		// Q1. A + B
		Scanner sc = new Scanner(System.in);

		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if ( A > 0 && B > 0 && A < 10 && B < 10) {
			System.out.println(A + B);
		}
		
		// Q2. Hello World!
		
		System.out.print("Hello World!");
		System.out.println();
		
		// Q3. A/B, 단 (0 < A, B < 10).
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if ( A > 0 && B > 0 && A < 10 && B < 10) {
			System.out.println(A / B);
		}
		
		// Q4. 첫째 줄에 A+B, 둘째 줄에 A-B, 셋째 줄에 A*B, 넷째 줄에 A/B, 다섯째 줄에 A%B. (1 ≤ A, B ≤ 10,000)
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if ( A >= 1 &&  B >= 1 && A <= 10000 && B <= 10000) {
			System.out.println(A + B);
			System.out.println(A - B);
			System.out.println(A * B);
			System.out.println(A / B);
			System.out.print(A % B);
		}
		
		System.out.println();
		
		// Q5. A-B
		
		A = sc.nextInt();
		B = sc.nextInt();
		
		if ( A > 0 && B > 0 && A < 10 && B < 10) {
			System.out.println(A - B);
		}
		
		System.out.println();
		
		// Q6. 구구단
		
		int N = sc.nextInt();
		
		for(int i = 1; i <= 9; i++) {
			if (i != 9) {
				System.out.println(N + " * " + i + " = " + N * i);
			}
			else {
				System.out.print(N + " * " + i + " = " + N * i);
			}
			
		}
		
		System.out.println();
		
		// Q7.
		
		long D = sc.nextLong(); // 여기는 10의 12승이라 long!
		long E = sc.nextLong();
		long C = sc.nextLong();
		
		if ( D >= 1 &&  E >= 1 &&  C >= 1 &&
			 D <= 1000000000000L && 
			 E <= 1000000000000L &&
			 C <= 1000000000000L) {
			System.out.print(D + E + C);
		}
		
		System.out.println();
		
		// Q8.
		
		sc.nextLine(); // 버퍼 비우기?
		
		String id = sc.nextLine();
		
		System.out.print(id + "??!");
		
		// Q9.
		
		int F = sc.nextInt();
		int G = sc.nextInt();
		
		if (F >= -10000 && G >= -10000 && F <= 10000 && G <= 10000) {
			if (F > G) {
				System.out.print(">");
			}
			else if (F < G) {
				System.out.print("<");
			}
			else {
				System.out.print("==");
			}
		}
		
		System.out.println();
		
		// Q10.
		
		int H = sc.nextInt();
		int M = sc.nextInt();
		
		int totalM = (H * 60) + M - 45;
		
		if (0 <= H && 0 <= M && 23 >= H && 59 >= M) {
			if (totalM < 0) { // 45분 이르게 했다가 음수 나올 경우를 위해
				System.out.print((totalM + (24 * 60)) / 60 + " ");
				System.out.print((totalM + (24 * 60)) % 60);
			}
			else {
				System.out.print(totalM / 60 + " ");
				System.out.print(totalM % 60);
			}

		}

		System.out.println();
		
		sc.close();
		
	}

}
