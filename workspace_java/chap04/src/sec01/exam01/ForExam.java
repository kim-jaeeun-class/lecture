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
	}
}

