package sec01.exam01;

import java.util.Scanner;

public class self250608 {

	public static void main(String[] args) {
		// Q1. N개의 정수가 주어진다. 이때, 최솟값과 최댓값을 구하는 프로그램.
		// 금요일에 했던 최대값 구하기 첫 번째 버전 활용 가능하지 않을지.
		
//		Scanner sc = new Scanner(System.in);
//		
//		int N = sc.nextInt(); // 정수 개수 입력 받기
//		int[] a = new int[N]; // 길이가 N인 배열 생성
//		
//		for(int i = 0; i < N; i++) { // a에 정수 넣기
//			a[i] = sc.nextInt();
//		}
//		
//		for(int i = 0; i < N; i++) {
//			for(int j = i; j < N; j++) {
//				if(a[i] > a[j]) {
//					int temp = a[i];
//					a[i] = a[j];
//					a[j] = temp;
//				}
//			}
//		}
//		
//		System.out.print(a[0] + " " + a[N-1]);
//		문제점 : 시간 초과... 줄여야 함.

		
//		Scanner sc = new Scanner(System.in);
//				
//		int N = sc.nextInt(); // 정수 개수 입력 받기
//		int[] a = new int[N]; // 길이가 N인 배열 생성
//				
//		for(int i = 0; i < N; i++) { // a에 정수 넣기
//			a[i] = sc.nextInt();
//		}
//		
//		int min = a[0];	// 수업 때 나왔던 첫 번째 값과의 비교로 시도
//		int max = a[0];
//		
//		for(int i = 0; i < N; i++) {	// for 반복되면 시간 걸리니까 최대한 줄여보기...
//			if (a[i] < min) {	// 첫 번째 값보다 작으면
//				min = a[i];		// 그 값이 min이 됨.
//			}
//			if (a[i] > max) {	// 첫 번째 값보다 크면
//				max = a[i];		// 그 값이 max가 됨.
//			}
//		}
//		System.out.print(min + " " + max);
//		근데 코드 길이(용량?)은 두 번째 방법이 더 길게 나온다... 어째서일까.
//		...이렇게면 배열 안 써도 되지 않나 하는 마음에 다른 방식으로 아래에.
//		시간 차이 확인해보기.
		
		System.out.println("Q1.");
		
		Scanner sc = new Scanner(System.in);
		
		int N = sc.nextInt();
		int num = sc.nextInt(); // 수 입력 받을 변수 만들기.
		
		int min = num;	// 두 번째 방법과 비슷하게 min, max를
		int max = num;	// 처음 값으로 초기화
		
		for (int i = 1; i < N; i++) {	// N번 동안 값을 입력받기 위한 반복문
			num = sc.nextInt();		// 값 입력
			if (num < min) {	// 반복문에서 입력받은 값이 더 작으면
				min = num;		// 그 값으로 min 대체
			}
			if (num > max) {	// 반복문에서 입력받은 값이 더 크면
				max = num;		// 그 값으로 max 대체
			}
		}
		System.out.println();
		// 마지막 방법이 소요 시간이나 코드 길이나 더 짧다.
		
		/*
		 * 두 번째로 큰 값도 비슷하게 구할 수 있을 듯.
		  		int N = sc.nextInt();
				int num = sc.nextInt(); // 수 입력 받을 변수 만들기.

				int max = num;	// 처음 값으로 초기화
				int second = -100; // 자연수라고 치고. 그렇지만 정수일 경우에는 int의 범위 끝 값을 넣는 식 등으로 가야.
		
				for (int i = 1; i < N; i++) {	// N번 동안 값을 입력받기 위한 반복문
					num = sc.nextInt();		// 값 입력
					if (num > max) {	// 반복문에서 입력받은 값이 더 크면
						max = num;		// 그 값으로 max 대체
					}
					else if ((num < max) && (num > second) ) {	// 최댓값보단 작지만 두 번째 값보단 클 때
						second = num;	// num이 두 번쨰 값을 대체하기.
					}
				}
				System.out.println(max); // 아까우니까 최댓값도 출력해주기.
				System.out.println(second);	// 두 번쨰로 큰 값 출력.
		 */
		
		
		// Q2. 첫째 줄에는 별 1개, 둘째 줄에는 별 2개, N번째 줄에는 별 N개를 찍는 문제
		// 기존에 반복문에서 수행했던 문제. 복습 겸 풀기.
		
		N = sc.nextInt();
		
		for(int i = 1; i <= N; i++) {	// 행갈이
			for(int j = 1; j <= i; j++) {	// 별 개수
				System.out.print("*");
			}
			System.out.println();
		}
		
		// Q3. 고양이
		
		System.out.println("\\    /\\");
		System.out.println(" )  ( ')");
		System.out.println("(  /  )");
		System.out.print(" \\(__)|");
		
		// Q4. A X B
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		if (A > 0 && B > 0 && A < 10 && B < 10) {
			System.out.print(A * B);
		}
		
		// Q5. 시험 점수를 입력받아 90 ~ 100점은 A,
		//     80 ~ 89점은 B, 70 ~ 79점은 C, 
		//     60 ~ 69점은 D, 나머지 점수는 F를 출력하는 프로그램
		
		int score = sc.nextInt();
		
		if (score >= 0 && score <= 100) {
			if (score >= 90) {
				System.out.print("A");
			}
			else if (score >= 80) {
				System.out.print("B");
			}
			else if (score >= 70) {
				System.out.print("C");
			}
			else if (score >= 60) {
				System.out.print("D");
			}
			else {
				System.out.print("F");
			}
		}
		
		// Q6. 9개의 수 중 최댓값 구하기(아까랑 비슷한 문제...)
		// 떠올리면서 풀어보기.
		
		int max6 = sc.nextInt(); // 첫 번째 값
		int index = 1;

			for (int i = 2; i <= 9; i++) {
				int num6 = sc.nextInt(); // 2~9번째 값(총 8개)
				if ( num6 > max6) {
					max6 = num6;
					index = i;	// 큰 값이 나올 경우 인덱스를 i값(위치값)으로 변경
				}
			}

		System.out.println(max6);
		System.out.print(index);
		
		// Q7. 총 N개의 정수가 주어졌을 때, 정수 v가 몇 개인지.
		
		int N1 = sc.nextInt();	// 정수 총 개수
		int[] b = new int[N1];
		int num2 = 0; // 같은 개수 세기 용 
		
		for(int i = 0; i < N1; i++) {	// 배열로 우선 모든 정수 넣기
			b[i] = sc.nextInt();
		}
		
        int v = sc.nextInt(); // 비교값 v  
            
		for(int i = 0; i < N1; i++) {	// 처음부터 끝까지 비교하는 파트.
			if(v == b[i]) {	// 값이 같을 경우
				num2++;		// num2에 1씩 추가
			}
		}
		System.out.print(num2);
		
		// Q8. 세 자리수 곱셈(세로 계산 기준)에서 1행, 2행, 3행, 최종값을 출력.
		
		int first = sc.nextInt();	// 첫 번째 값
		int second = sc.nextInt();	// 두 번째 값
		
		System.out.println(first * (second % 10));	// 두 번째 값의 1의 자리를 구해서 곱하기
		System.out.println(first * ((second % 100) / 10));	// 두 번째 값의 10의 자리를 구해서 곱하기
		System.out.println(first * (second / 100));	// 두 번쨰 값의 100의 자리를 구해서 곱하기
		System.out.print(first * second);	// 최종값
		
		sc.close();
		
	}

}
