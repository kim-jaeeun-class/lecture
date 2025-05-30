package sec01.exam01;

import java.util.Scanner;

public class ForPrac02 {

	public static void main(String[] args) {
		
		// 0단계. 행 수(n)대로 +를 1개씩 줄마다 출력.
		
		System.out.println("0단계");
		
		int n = 5; // 높이 지정
		
		for(int i = 1; i <= n; i++) {
			System.out.println("+");
		}
		
		// 1단계. 열 수(n1)대로 +를 1개씩 한 줄에 출력.
		
		System.out.println("1단계");
		
		int n1 = 5;
		
		for(int i = 1; i <= n1; i++) {
			System.out.print("+");
		}
		
		System.out.println();
		
		// 2단계. 1단계처럼 열 수(n2)대로 +를 1개씩 한 줄에 출력. + 뒤에 .도 삽입.
		
		System.out.println("2단계");
		
		int n2 = 5;
		
		for(int i = 1; i <= n2; i++) {
			System.out.print("+");
			System.out.print(".");
		}
		
		System.out.println();
		
		// 3단계. 행 수(n3), 열 수(n4)에 맞춰 +를 출력.
		
		System.out.println("3단계");
		
		int n3 = 3;
		int n4 = 5;
		
		for(int i1 = 1; i1 <= n3; i1++) {	// 감싸진 for문이 다 작동되면 행갈이+재시작 되도록 println 삽입.
			for(int i2 = 1; i2 <= n4; i2++) {	// 1단계 for문 적용
				System.out.print("+");
			}
			System.out.println();
		}
		
		// 4단계. 행과 열의 수 = n5. n5*n5 구조가 되도록 출력. 단, 들어가는 값은 각 행당의 위치값(1행이면 1)이 출력되도록. 
		
		System.out.println("4단계");
		
		int n5 = 5;
		
		for(int i1 = 1; i1 <= n5; i1++) {	// 3단계와 거의 동일. 대신 출력 값을 행의 위치 값(i1)으로 지정.
			for(int i2 = 1; i2 <= n5; i2++) {
				System.out.print(i1);
			}
			System.out.println();
		}
		
		// 5단계. 최대 행 수 및 열 수= n6. 1행에는 1이 1개, 2행에는 2가 2개, 3행에는 3이 3개... 식으로 출력.
		
		System.out.println("5단계");
		
		int n6 = 5;
		
		for(int i1 = 1; i1 <= n6; i1++) { // 개행 부분은 삭제하면 안 될 거고. 행 수 = 그 행의 값 개수가 되게 하는 부분을 생각하기.
			for(int i2 = 1; i2 <= i1; i2++) {
					System.out.print(i1);
				}
			System.out.println();
			}
		
		// 6단계. 최대 행 수 및 열 수 = n7. 5단계와 비슷하나, 출력값을 그 행의 위치값이 아니라 +가 나오도록.
		
		System.out.println("6단계");
		
		int n7 = 5;
		
		for(int i1 = 1; i1 <= n7; i1++) {
			for(int i2 = 1; i2 <= i1; i2++) {
					System.out.print("+");
				}
			System.out.println();
		}
		
		// 7단계. 최대 행 수 및 열 수 = n8. 5단계의 역순으로. 예를 들어 1행에서는 1을 n8개, 2행에서는 2를 n8-1개.
		
		System.out.println("7단계");
		
		int n8 = 5;
		
		for(int i1 = 1; i1 <= n8; i1++) {
			for(int i2 = 1; i2 <= (n8 - (i1 + 1)); i2++) { // n8 - 0, n8 - 1... 을 구현하기 위한 조건.
					System.out.print(i1);
				}
			System.out.println();
		}
		
		// 8단계. 최대 행 수 및 열 수 = n9. 6단계랑 비슷. 단, 행의 빈 부분에는 . 출력.
		
		System.out.println("8단계");
		
		int n9 = 5;
		
		for(int i1 = 1; i1 <= n9; i1++) {
			for(int i2 = 1; i2 <= i1; i2++) {
					System.out.print("+");
			}
			for(int i3 = 1; i3 <= (n8 - i1); i3++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		// 9단계. 최대 행 수 및 열 수 = n10. 8단계의 순서를 반대로. 점이 먼저. +가 뒤로.
		
		System.out.println("9단계");
		
		int n10 = 5;
		
		for(int i1 = 1; i1 <= n10; i1++) {
			for(int i3 = 1; i3 <= (n10 - i1); i3++) {
				System.out.print(".");
			}
			for(int i2 = 1; i2 <= i1; i2++) {
					System.out.print("+");
			}
			System.out.println();
		}
		
		// 10단계. 총 행 수 = n11. (열 수는 다름!) .은 행 수 -1, +는 행수 +=2로.
		
		System.out.println("10단계");
		
		int n11 = 5;
		
		for(int i1 = 1; i1 <= n11; i1++) {
			for(int i3 = 1; i3 <= (n11 - i1); i3++) {
				System.out.print(".");
			}
			for(int i2 = 1; i2 <= ((i1 * 2) - 1); i2++) {
					System.out.print("+");
			}
			System.out.println();
		}
		
		// 11단계. 총 행 수 = n12. 10단계의 +를 중간에 옮기기. 10단계의 .은 양 옆에 뜨도록.
		
		System.out.println("11단계");
		
		int n12 = 5;
		
		for(int i1 = 1; i1 <= n12; i1++) {
			for(int i3 = 1; i3 <= (n12 - i1); i3++) {
				System.out.print(".");
			}
			for(int i2 = 1; i2 <= ((i1 * 2) - 1); i2++) {
					System.out.print("+");
			}
			for(int i3 = 1; i3 <= (n12 - i1); i3++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		// 12단계. 입력받은 줄 수대로 11단계의 구조 출력.
		
		System.out.println("11단계");
		
		System.out.println("출력하길 원하는 행 수를 입력하세요.");
		
		Scanner scan = new Scanner(System.in);
		String lineNum1 = scan.nextLine();
		int lineNum = Integer.parseInt(lineNum1);
		
		for(int i1 = 1; i1 <= lineNum; i1++) {
			for(int i3 = 1; i3 <= (lineNum - i1); i3++) {
				System.out.print(".");
			}
			for(int i2 = 1; i2 <= ((i1 * 2) - 1); i2++) {
					System.out.print("+");
			}
			for(int i3 = 1; i3 <= (lineNum - i1); i3++) {
				System.out.print(".");
			}
			System.out.println();
		}
		
		scan.close();
		
	}

}
