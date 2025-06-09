package sec01.exam01;

import java.util.Scanner;

public class ArrayPrac02 {

	public static void main(String[] args) {
		
		// 222p
		// Q3.
		
		int max = 0;
		int[] array = {1, 5, 3, 8, 2};
		
		// for문 작성 위치(아래부터 작성)
		for (int i = 0; i < array.length; i++) {
			if (max < array[i]) {
				max = array[i];
			}
		}
		System.out.println("max : " + max);
		
		// Q4. 
		
		int[][] array2 = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		// 작성 위치(아래부터 작성)
		int count = 0;
		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				sum += array2[i][j];
				count++;
			}
		}
		avg = (double) sum / (double) count;
				
		System.out.println("sum : " + sum);
		System.out.println("avg : " + avg);
		
		
		// Q5.
		
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner scanner = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------------");
			System.out.println("1.학생수 | 2.점수입력 | 3.점수리스트 | 4.분석 | 5.종료");
			System.out.println("----------------------------------------------------");
			System.out.print("선택> ");
			
			int selectNo = Integer.parseInt(scanner.nextLine()); // nextInt로도 바꿔보기. 
																 // 안 되면 if, else if문 nextInt를 전부 nextLine으로 바꾼 후
																 // Integer.parseInt();로 감싸기밖에 방법이 없다...
			
			if(selectNo == 1) {
				studentNum = scanner.nextInt();
				System.out.println("학생수> " + studentNum);
			}
			else if(selectNo == 2) {
				scores = new int[studentNum];
				for(int i = 0; i < studentNum; i++) {
					scores[i] = scanner.nextInt();
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}
			else if(selectNo == 3) {
				for(int i = 0; i < studentNum; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}
			else if(selectNo == 4) {
				int count1 = 0;
				int sum1 = 0;
				int max1 = scores[0]; 
				for(int i = 0; i < studentNum; i++) {
					sum1 += scores[i];
					count++;
					if (max1 < scores[i]) {
						max1 = scores[i];
					}
				}
				
				double avg1 = (double) sum1 / (double) count1;
				System.out.println("최고 점수 : " + max1);
				System.out.println("평균 점수 : " + avg1);
			}
			else if(selectNo == 5) {
				run = false;
			}
			
		}
		System.out.println("프로그램 종료");
		
//		scanner.close();
	}

}
