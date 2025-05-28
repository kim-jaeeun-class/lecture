package sec01.exam01;

public class OpExam {

	public static void main(String[] args) {
		
		{
			int x = 10;
						
			x++;
			System.out.println("x : " + x);
			
			++x;
			System.out.println("x : " + x);
			
			
			 x = 10;
			 x = x + 3;
			 x += 3; // 위와 같은 코드
			  
			 x += 1;
			 x++; // 위와 같은 코드. 1을 증가할 때만 사용 가능.
			
			int y = 10;
			y--;
			--y;
			System.out.println("y : " + y);
			
			x = 10;
			int z = ++x;
			System.out.println("z : " + z);
			
			x = 10;
			z = x++;
			System.out.println("x : " + x);
			System.out.println("z : " + z);
			
			x = 10;
			y = 10;
			z = ++x + ++y + x++ + y++;
			System.out.println("x 최종 : " + x);
			System.out.println("y 최종 : " + y);
			System.out.println("z 최종 : " + z);
			
			x = 10;
			System.out.println("x++ : " + x++);
			
			x = 1;
			z = x++ + ++x;
			System.out.println("x : " + x); // 3으로 출력.
			System.out.println("z : " + z); // 4로 출력.
			
			x = 1;
			z = x++ - --x * x++ - x--;
			System.out.println("x : " + x);
			System.out.println("z : " + z);
			
		}
		
		{
			boolean a = false;
			a = !a;
			System.out.println(a);
		}
		
		{
			double d = 7.3;
			double e = d / 0;
			System.out.println(e); // 0으로 나눠도 제대로 값이 나오지 않음.
		}
		
		{
			System.out.println(0.1 == 0.1f);
		}
		
		{
			String s1 = "123";
			String s2 = "123";
			System.out.println(s1 == s2); // 문자열이 같은지 비교하는 게 아니라 주소를 비교함.
			System.out.println(s1.equals(s2)); // String의 비교를 위해선 .equals를 사용해야 함.
			System.out.println("123".equals(s2));
		}
		
		{
			// Q1. 예산 10000원. 4500원 프라푸치노 구매 가능 개수. 잔액.
			
			int money = 10000;
			int coffee = 4500;
			int count = money / coffee;
			int change = money % coffee;
			
			System.out.println("총 음료 잔 수 : " + count);
			System.out.println("잔액 : " + change);
			
			// Q2.
			int tea = 8000;
			double discount = tea * 0.85;
			
			System.out.println("할인가 : " + discount);
			
			// Q3.
			
			int score = 87;
			System.out.println("내 점수는 80과 90 사이다. 참? 거짓?");
			System.out.println(80 < score && 90 > score);
			
			// Q4.
			
			int a = 957;
			int ex = a % 100;
			int result1 = a - ex;
			
			System.out.println(result1);
			// 10의 자리 이하를 버림하는 법
			int k = 1937;
			k /= 100;
			k *= 100;
			System.out.println(k); // case 2.
			
			// Q5. 
			double v1 = 1000.0;
			double v2 = 794.0;
			double divide = v1 / v2;
			double divideAn = ((int) (divide * 1000)) / 1000.0; // Case 1. 형 변환으로 처리
			System.out.printf("%.3f \n", divide); // Case 2. printf로 처리
			System.out.println(divideAn); // case 1.
			
			double v3 = (v1 / v2) * 1000;
			int v4 = (int) v3;
			double v5 = (double) v4 / 1000;
			System.out.println(v5); // 위 연산과 동일한 값 출력
			
		}
		
		{
			int s = 95;
			String grade = ( s > 90 ) ? "A" : "B";
			System.out.println("grade : " + grade);
		}
		
	}

}
