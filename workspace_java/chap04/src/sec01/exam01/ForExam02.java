package sec01.exam01;

public class ForExam02 {

	public static void main(String[] args) {
		
		// Q1. 주사위 2개로 나올 수 있는 모든 조합.
		// 출력 : [1,1], [1,2], … , [6,6]
		
		System.out.println("Q1. 주사위 2개로 나올 수 있는 모든 조합");
		
		int dice = 6;
		
		for(int i = 1; i <= dice; i++) {
			for(int i1 = 1; i1 <= dice; i1++) {
				if(i == dice && i1 ==dice) {
					System.out.print("[" + i + "," + i1 + "]");
				}
				else {
					System.out.print("[" + i + "," + i1 + "]" + " ");
				}
			}
		}
		System.out.println();
		
		// Q2. 주사위 2개의 합 별로 나올 수 있는 조합.
		// 합2 : [1,1] / 합3 : [1,2], [2,1] / … / 합12 : [6,6]
		
//		for(int i = 1; i <= dice; i++) {
//			for(int i1 = 1; i1 <= dice; i1++) {
//				int sum = i + i1;
//				for(sum = 2; sum <= dice*2; sum++) {
//					System.out.println(sum + " : ");
//				}
//			}
//		}
		
		System.out.println("Q2. 주사위 합 별로 나올 수 있는 조합");
		
		for(int i = 2; i <= dice*2; i++) {
			System.out.print("합" + i + " : ");
			for(int i1 = 1; i1 <= dice; i1++) {
					for(int i2 = 1; i2 <= dice; i2++) {
						if (i1 + i2 == i) {
							System.out.print("[" + i1 + "," + i2 + "]" + " ");
						}	
					}
			}
			System.out.println();
		}
		
		// Q3. 각 합 별 조합의 수 출력.
		// Q2에 count.
		
		System.out.println("Q3. 각 합 별 조합의 수 출력");
		
		for(int i = 2; i <= dice * 2; i++) {	// 합의 최솟값(2)부터 최댓값(2개를 더하는 거니 개당 최댓값 * 2로 처리.)
			int count = 0;	// 숫자 세기용
			System.out.print("합" + i + " : ");
			for(int i1 = 1; i1 <= dice; i1++) {		// 다이스1
					for(int i2 = 1; i2 <= dice; i2++) {		// 다이스2
						if (i1 + i2 == i) {		// 두 주사위의 값이 합n이면 아래를 출력 후 count에 1 더하기.
							System.out.print("[" + i1 + "," + i2 + "]" + " ");
							count++;
						}	
					}
			}
			System.out.println();
			System.out.println("└합" + i + "의 총 개수 : " + count);
		}
		
		// Q4. 순서 관계 없이 중복 제거.
		// [1,2], [2,1] 같은 것은 중복 취급.
		
		System.out.println("Q4. 조합의 중복을 제거해 출력");
		
		for(int i = 2; i <= dice * 2; i++) {
			System.out.print("합" + i + " : ");
			for(int i1 = 1; i1 <= dice; i1++) {
					for(int i2 = 1; i2 <= dice; i2++) { // int i2 = i1 식으로도 가능(나중에 써보기)
						if (i1 + i2 == i && i1 <= i2) { // [1, 2]랑 [2, 1]이 있으면 [1, 2]만 출력되도록.
							System.out.print("[" + i1 + "," + i2 + "]" + " ");
						}	
					}
			}
			System.out.println();
		}
		
		// Q5. 입력 받은 정수에 따라 달리 출력.
		// 3이면
		/*
		 *  00 01 02
		 *  10 11 12
		 *  20 21 22
		 */
		// 4면
		/*
		 * 00 01 02 03
		 * 10 11 12 13
		 * 20 21 22 23
		 * 30 31 32 33
		 */
		
		System.out.println("Q5. 입력받은 정수에 따라 (n-1)까지의 숫자를 2개의 조합으로 한 요소를 배치해 정사각형 모양 출력");
		
		int row = 5;
		
		for(int i = 1; i <= row; i++) { // 여기는 행갈이
		System.out.println("행갈이 확인");
		}
		
		for(int i = 0; i < row; i++) {
			System.out.print(i);
		} // 0, 1, 2 표시
		
		System.out.println();
		
		for(int i = 0; i < row; i++) {
			System.out.print(i + " ");
		} //
		
		System.out.println();

		for(int i1 = 0; i1 < row; i1++) {
			for(int i2 = 0; i2 < row; i2++) {
				System.out.print("" + i1 + i2 + " ");
			}
			System.out.println();
		}
		
		
		// Q6. 입력 받은 정수에 따라 달리 출력.
		// 3이면
		/*
		 * +++
		 * +.+
		 * +++
		 */
		// 5면
		/*
		 * +++++
		 * +...+
		 * +...+
		 * +...+
		 * +++++
		 */
		
		System.out.println("Q6");
		
		int max = 9;
		
		for(int i = 1; i <= max; i++) {
			if(i == 1 || i == max) {
				for(int i1 = 1; i1 <= max; i1 ++) {
					System.out.print("+");
				}
				System.out.println();
			}
			else {
				System.out.print("+");
				for(int i2 = 1; i2 <= (max - 2); i2++) {
					System.out.print(".");
				}
				System.out.print("+");
				System.out.println();
			}
		}
		
	}

}
