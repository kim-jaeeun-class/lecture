package sec01.exam01;

import java.util.Scanner;

public class ArrayPrac {

	public static void main(String[] args) {
		// Q1. 깊은 복사
		
		System.out.print("Q0. ");
		
		int[] q0A = {1, 2, 3};
		int[] q0B = new int[q0A.length];
		
		for(int i = 0; i < q0A.length; i++) {
			q0B[i] = q0A[i];
		}
		for(int i = 0; i < q0A.length; i++) {
			System.out.print(q0B[i]);
		}
		System.out.println();
		
		
		// Q1. 배열 뒤집기
		System.out.print("Q1. ");
		int[] q1A = {1, 2, 3};
		int[] q1B = new int[q1A.length];
		
		for(int i = 0; i < q1A.length; i++) {
			q1B[i] = q1A[(q1A.length - (i + 1))];
		}
		for(int i = 0; i < q1A.length; i++) {
			if (i == (q1A.length - 1)) {
				System.out.print("q1B[" + i + "] : " + q1B[i]);
			}
			else {
				System.out.print("q1B[" + i + "] : " + q1B[i] + ", ");
			}
		}
		System.out.println();
		
		
		// Q2 ~ Q7. [3, 4, 7, 5, 1, 4, 9]
		// Q2. 홀수의 개수 찾기
		int[] q2A = {3, 4, 7, 5, 1, 4, 9};
		int count = 0;
		
		for(int i = 0; i < q2A.length ; i++) {
			if (q2A[i] % 2 != 0) {
				count++;
			}
		}
		System.out.println("Q2. 홀수의 개수 : " + count);
		
		
		// Q3. 4보다 큰 수의 개수 구하기
		
		int count1 = 0;
		
		for(int i = 0; i < q2A.length ; i++) {
			if (q2A[i] > 4) {
				count1++;
			}
		}
		System.out.println("Q3. 4보다 큰 수의 개수 : " + count1);
		
		
		// Q4. 최대값 구하기
		
		System.out.print("Q4. 배열 : ");
//		int[] q4A = new int[q2A.length];
//		
//		for(int i = 0; i < q4A.length ; i++) {
//			q4A[i] = q2A[i]; // 우선 q4A 배열 내부 값 지정
//		}
//		
//		for(int i = 0; i < q4A.length ; i++) { // 이건 각 배열 위치에 넣으려면 있어야 함.
//			for(int j = i; j < q4A.length; j++) { // 이 쪽 부분을 조정... > 완료!!!
//				if(q4A[i] > q4A[j]) { // 교환하는 정렬 방식 써보고 싶었는데... 이 위에 뭔가 더 있어야 할 듯.
//					int temp = q4A[i];
//					q4A[i] = q4A[j];
//					q4A[j] = temp;
//				}
//			}
//			System.out.print(q4A[i] + " ");
//		}
//		System.out.println();
//		System.out.println("max는 " + q4A[q4A.length - 1]);
//		개선안 : 정렬 외의 다른 방법(첫 번쨰 값이랑 비교?)도 있다고 하니 한 번 시도해보기.
		
		for (int i = 0; i < q2A.length; i++) {
		    System.out.print(q2A[i] + " ");
		}

		int max = q2A[0]; // 첫 번째 값을 기준점 삼기.

		for (int i = 1; i < q2A.length; i++) {
		    if (q2A[i] > max) {	// 그 다음값과 비교할 때, 더 크면 원래 max값(0 위치)이랑 바꿔주기.
		        max = q2A[i];
		    }
		}

		System.out.println();
		System.out.println("max는 " + max);
		
		// Q5. 두 번째로 큰 수 구하기.
		
		System.out.print("Q5 : ");
		
//		int[] q5A = new int[q2A.length];
//		
//		for(int i = 0; i < q5A.length ; i++) {
//			q5A[i] = q2A[i];
//		}
//		
//		for(int i = 0; i < q5A.length ; i++) {
//			for(int j = i; j < q5A.length; j++) {
//				if(q5A[i] > q5A[j]) {
//					int temp = q5A[i];
//					q5A[i] = q5A[j];
//					q5A[j] = temp;
//				}
//			}
//		}
//		System.out.println();
//		System.out.println("'max - 1'은 " + q5A[q5A.length - 2]);
//		개선안 : 4번의 다른 방법을 기반으로 시도.
		
		int secMax = max;
		
		for (int i = 0; i < q2A.length; i++) {
			if (q2A[i] != max) { // max값이 아니면
				secMax = q2A[i]; // secMax에 대입시키기. max보다 작기만 하면 ok.
				break;
			}
		}
		
		for (int i = 0; i < q2A.length; i++) { // 최댓값 구할 때처럼. 대체하는 식으로.
			if (q2A[i] != max && q2A[i] > secMax) { // max는 아니지만 secMax보다 크면,
				secMax = q2A[i]; // 대체하기를 끝 위치까지 반복.
			}
		}
		System.out.println("secMax는 " + secMax);
		
		
		
		// Q6. 오른쪽으로 배열값을 한 칸씩 밀기. 빈 칸(가장 왼쪽 값)은 초기값 0으로.
		// 복사 이용해서 하면 될 듯.
		
		System.out.print("Q6 : [");
		int[] q6 = new int[q2A.length + 1] ;
		
		for(int i = 1; i < q2A.length + 1; i++) {
			q6[i] = q2A[(i-1)];
		}
		for(int i = 0; i < q6.length; i++) {
			if (i == (q6.length-1)) {
				System.out.print(q6[i]);
			}
			else {
				System.out.print(q6[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		
		// Q7. Q6과 유사. 단, 6번과 달리 0을 넣는 게 아니라, 맨 끝 값을 처음으로 보내기.
		
		System.out.print("Q7 : [");
		int[] q7 = new int[q2A.length] ;
		
		q7[0] = q2A[(q2A.length - 1)]; // 위랑 거의 똑같지만 먼저 0 위치의 값 설정.
		
		for(int i = 1; i < q2A.length; i++) {
			q7[i] = q2A[(i-1)]; // 이후 나머지 부분에 채우기.
		}
		for(int i = 0; i < q7.length; i++) {
			if (i == (q7.length-1)) {
				System.out.print(q7[i]);
			}
			else {
				System.out.print(q7[i] + " ");
			}
		}
		System.out.print("]");
		System.out.println();
		
		
		// Q8. 임시 비밀번호 8자리 생성.(랜덤 사용)
		// Q8-1. 숫자만
		// Q8-2. 소문자만
		// Q8-3. 숫자 2개 이상. 대/소문자 각 1개 이상.
		
		int pwLength = 8;
		
		int[] pwAll = new int[pwLength];
		
		System.out.print("Q8-1. PW : ");
		for (int i = 0; i < pwAll.length; i++) {
			int pw = (int) (Math.random() * 10); // 이번에는 0도 포함되므로 굳이 +1 쓸 필요 없음
			pwAll[i] = pw;
			System.out.print(pwAll[i]);
		}
		System.out.println();
		
		
		System.out.print("Q8-2. PW : ");
		
		char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		char zero = '0';
		
		char[] PW2 = new char [pwLength]; // 배열 길이 8로 출력되는 점 확인

		for (int i = 0; i < PW2.length; i++) { // pw 최종 출력용.
			char pw2 = (char) (a + (Math.random()) * (z - a +1)); // 처음에 +1 안 했는데 그러니까 z가 안 나온다...
			PW2[i] = pw2;
			System.out.print(PW2[i]);
		}
		System.out.println();
		
		
		System.out.print("Q8-3. PW : "); // 문제 잘못 봤다!!!!! 대문자만 아니다!!
		
		char[] PW3 = new char[pwLength];
		
		// 여기는 필수 조건 지정 파트
		PW3[0] = (char) (zero + (int)(Math.random() * 10)); // 미리 지정 안 하고 시작부터 랜덤은 도저히 모르겠다...
		PW3[1] = (char) (zero + (int)(Math.random() * 10)); // 위랑 이건 숫자
		PW3[2] = (char) (a + (int)(Math.random() * (z - a +1))); // 이건 소문자
		PW3[3] = (char) (A + (int)(Math.random() * (Z - A +1))); // 이건 대문자
		
		// 나머지 부분... 랜덤하게 채우기.
		
		for (int i = 4; i < pwLength; i++) {
			int type = (int)(Math.random() * 3); { // 0이면 숫자, 1은 소문자, 2는 대문자로?
				if (type == 0) { // 실행문은 위 필수 조건 복붙
					PW3[i] = (char) (zero + (int)(Math.random() * 10));
				}
				else if (type == 1) {
					PW3[i] = (char) (a + (int)(Math.random() * (z - a +1)));
				}
				else {
					PW3[i] = (char) (A + (int)(Math.random() * (Z - A +1)));
				}
			}
		}
		
		// 이걸.... 이제 어떻게 섞냐... 4번 풀었던 걸로 쓰는 거 말곤 생각 안 난다. 일단 가보자.
		for (int i = 0; i < pwLength; i++) {
		    int j = (int)(Math.random() * (i + 1));
		    char temp = PW3[i];
		    PW3[i] = PW3[j];
		    PW3[j] = temp;
		}
		
		for (int i = 0; i < pwLength; i++) {
		    System.out.print(PW3[i]);
		}
		System.out.println();

		
		// Q9. 자리 : 10개.
		// 자리 번호 : 1~10.
		// 메뉴 : 1. 예약 / 2. 모든 좌석 현황 / 3. 잔여 좌석(예약 가능 번호만 출력) / 0. 종료
		// 예약 가능 시, "n번 자리 예약했습니다."
		// 예약 불가 시, "이미 예약되어 있습니다."
		
		System.out.println("Q9.");
		
		int seatLength = 10;
		int[] seat = new int[seatLength];
		Scanner sc = new Scanner(System.in);
		boolean sys = true;
		
		while(sys) {
			System.out.println("1. 예약 / 2. 모든 좌석 현황 / 3. 잔여 좌석(예약 가능 번호만 출력) / 0. 종료");
			System.out.println("원하는 번호를 입력해주세요.");
			int input = sc.nextInt();
			
			if (input == 0) {
				System.out.println("자리 예약 서비스를 종료합니다.");
				sys = false;
			}
			else if (input == 1) {
				System.out.println("원하시는 자리의 번호를 입력해주세요. 자리 번호 : 1 ~ " + seatLength);
				int res = sc.nextInt();
				if (res < 1 || res > seatLength) {
					System.out.println("존재하지 않는 자리 번호입니다.");
				}
				else if (seat[res - 1] == 0) {
					System.out.println(res + "번 자리를 예약했습니다.");
					seat[res - 1] = 1;
				}
				else { // res는 10까지 뜨니 주의.
					System.out.println("이미 선점된 자리입니다.");
				}
			}
			else if (input == 2) {
				System.out.print("남은 좌석 : ");
				for(int i = 0; i < seat.length; i++) {
					if (seat[i] == 0) {
						System.out.print((i+1) + "번 ");
					}
				}
				System.out.println();
				System.out.print("선점된 좌석 : ");
				for(int i = 0; i < seat.length; i++) {
					if (seat[i] != 0) {
						System.out.print((i+1) + "번 ");
					}
				}
				System.out.println();
			}
			else if (input == 3) {
				System.out.print("현재 남아 있는 자리 번호는 ");
				int count2 = 0;
				for(int i = 0; i < seat.length; i++) {
					if (seat[i] == 0) {
						System.out.print((i+1) + " ");
						count++;
					}
				}
				System.out.println("번 입니다.");
				System.out.println("현재 남아있는 자리의 수는 총" + count2 + "자리입니다.");
			}
			else {
				System.out.println("잘못된 번호를 입력했습니다. 다시 입력해주세요.");
			}
		}
		
		sc.close();
		
		
		// Q10. 로또 6자리. 단, 중복 없이 출력.
		
		
		int[] lotto = new int[6];
		int[] lottoEx = new int[6];
		
		for(int i = 0; i < 6; i++) { // 기본
			lottoEx[i] = (int) (Math.random() * 45) + 1;
		}
		
		System.out.print("로또 번호 ");
//		for(int i = 0; i < 6; i++) {
//			lotto[i] = (int) (Math.random() * 45) + 1; // 여기에 0 값이 아닌 다른 걸 넣기.
//			for(int j = i; j < 6; j++) {
//				int num = (int) (Math.random() * 45) + 1;
//				if (lotto[i] != lotto[j]) {
//					lotto[i] = num;
//					break;
//				}
//				else {
//					continue;
//				}
//			}
//			System.out.print(":: " + lotto[i] + " ");
//		}
		
		// 랜덤값 출력 : (int) (Math.random() * 45) + 1;
		
		for(int i = 0; i < 6; i++) {
			int num = (int) (Math.random() * 45) + i;
			
			for(int j = 0; j < i; j++) { // 0부터 i 하나 전 위치까지의 수 비교.
				if(lotto[j] == num) {	// 중복 값 확인.
					i--;	// 같으면 돌아가게 시키기. 계속계속 뽑기...
					break; // for문 깨버리기... i가 -1 돼서 이전 과정 다시 반복할 수 있음.
				}
			}
			if (lotto[i] == 0) { // 이전 코드에서 자꾸 0으로 빠지는 문제 있었으니까... 아예 막아버리기.
				lotto[i] = num;  // 근데 0 위치인 값은 그냥 for(j)문 위에 지정해두고 가도 된다.
			}
			System.out.print(":: " + lotto[i] + " ");
		}
		
		// boolean으로 flag를 드는 방식으로도 출력 가능.
		
		
	}

}
