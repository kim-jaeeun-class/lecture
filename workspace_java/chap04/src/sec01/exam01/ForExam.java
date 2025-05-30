package sec01.exam01;

public class ForExam {

	public static void main(String[] args) {
		{
			int sum = 0;
			
			for(int i = 1; i <= 100; i++) {
				sum += i;
			}
			System.out.println(sum);
		}
		
		{
//			int sum = 0;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			sum += 1;
//			
//			System.out.println(sum);
			
			int sum = 0;
			int times = 10;
			
			for(int i = 1; i <= times; i++) { // 여기에서 i는 반복횟수로 잡은 것! i를 굳이... 중괄호 안에 넣을 필요 없음.
				sum += 1;
			}
			
			System.out.println(sum);
			
		}
		
		{
			// 1~5까지의 합 구하기
			
			/*
			for(int i = 1; i <= 5; i++) {
				sum += i;
			}
			를 분해해 아래에 표현.
			*/
			int sum = 0;
			int i = 1;
			
			sum += i; // i = 1
			i++; 
			
			sum += i; // i = 2
			i++;
			
			sum += i; // i = 3
			i++;
			
			sum += i; // i = 4
			i++;
			
			sum += i; // i = 5
			i++;
			
		}
		
		{
			// 구구단 2단을 출력하기.
			int dan = 2;
			int sum;
			for (int i = 1; i <= 9; i += 1) { // i는 여기에서 '2 곱하기 i는' 부분.
				sum = i * dan;
				System.out.println(dan + " X " + i + " = " + sum);
			}
			
		}
		
		{
			// 반복문 만들기 요령의 예시
			System.out.println(1);
			System.out.println(2);
			System.out.println(3);
			
			int i = 1;
			System.out.println(i);
			i += 1;
			
			System.out.println(i);
			i += 1;
			
			System.out.println(i);
			
			for(int i1 = 1; i1 <= 3; i1 += 1) { // 여기서 i1이 반복되지 않는 부분. 초기화식이 시작조건. 조건식이 종료조건.
				System.out.println(i1);			// 증감식은 반복되지 않도록 지정하는 규칙.
			}
			
			
		}
		
		{
			// 2~10 중 짝수만 출력
			
			for(int m = 2; m <= 10; m += 2) {
				System.out.println(m);
			}
			
			// 10~1 출력.
			
			int num = 10;
			int replay = 9;
			
			for (int i = 1; i <= replay ; i++) {
				System.out.println(num -= 1);
			}
		
			// 10~1 출력. 홀짝 구분이 되도록.
			
			num = 10; // 어디부터 시작할지 시작점 지정. 
			replay = 10; // 몇 번 뺄지 지정.
			
			for (int i = 1; i <= replay ; i++) { // 여기에서 i는 반복횟수. 빼는 횟수 변하게 할 필요 없으면 i <= 10 해도 됨.
				
				if (num % 2 == 0) {		// 시작되는 수가 출력돼야 하니까 if문을 앞에.
					System.out.println(num + "은 짝수입니다.");
				}
				else {
					System.out.println(num + "은 홀수입니다.");
				}
				
				num -= 1; // 이후로 num 감산.
			}	
		}
		
		{
			// 2~9단까지 쓰고 싶으면.
			
			System.out.println(":: 2 ~ 9단 ::");
			
			int min = 2; // 시작 단
			int max = 9; // 마무리 단
			int mul = 9; // 각 단에 얼마까지 곱할지
						
			for (int times = 1; times < max; times++) { // 여기는 단 지정 부분.
				for(int i = 1; i <= mul; i++) { // 여기는 n단 내에서 n * (1~9) 하는 부분.
					System.out.println(min + " X " + i + " = " + (min * i));
				}
				min++;
			}
			
			// 각 단 당 한 줄씩 출력
			
		}
		
		{
			// Q. 1~10까지 출력. 3개씩 옆으로 찍기?
			//  1 2 3
			//  4 5 6
			//  7 8 9
			//  10
			
			System.out.println("1~10을 3열로 - 다른 수로 바꿔도 되도록");
			
			for(int i = 1; i <= 10; i++) {
				if (i <= 3) {
					if ( i == 3 ) {
						System.out.println(i);
					}
					else { 
						System.out.print(i + " ");
					}
				}
				else if ((4 <= i) && (i <= 6)) {
					if ( i == 6 ) {
						System.out.println(i);
					}
					else { 
						System.out.print(i + " ");
					}
				}
				else if ((7 <= i) && (i <= 9)) {
					if ( i == 9 ) {
						System.out.println(i);
					}
					else { 
						System.out.print(i + " ");
					}
				}
				else {
					System.out.println(i);
				}
			}
		}
		
		{
			// Q. 1~100(n)까지 홀수의 개수.
			
		}
		
		{
			// Q. 구구단 각 단 당 한 행씩 출력
			
			System.out.println(":: 2 ~ 9단 :: 옆으로 출력하기");
			
			int min = 2; // 시작 단
			int max = 9; // 마무리 단
			int mul = 9; // 각 단에 얼마까지 곱할지
						
			for (int times = 1; times < max; times++) { // 여기는 단 지정 부분.
				for(int i = 1; i <= mul; i++) { // 여기는 n단 내에서 n * (1~9) 하는 부분.
					System.out.print(min + " X " + i + " = " + (min * i) + ", ");
				}
				min++;
				System.out.println();
			}
		}
		
		
		
		
	}
}

