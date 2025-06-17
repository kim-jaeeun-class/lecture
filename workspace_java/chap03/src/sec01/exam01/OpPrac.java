/* 연산자 연습 - 149~ 153p */

package sec01.exam01;

public class OpPrac {

	public static void main(String[] args) {
		{
			// Q1. 오류 찾기 및 원인 파악.
			/* byte b = 5; // int로 변환해야 함.
			b = -b; // 여기에서 오류.
			int result = 10 / b;
			System.out.println(result); */
			
			int b = 5;
			b = -b; 
			int result = 10 / b;
			System.out.println(result); // -값으로 나누기 결과 출력
		}
		
		{
			// Q2. 아래 코드 실행 시 출력 결과
			int x = 10;
			int y = 20;
			int z = ++x + y--; // 11 + 20 = 31
			System.out.println(z);
		}
		
		{
			// Q3. stop이 true일 때 반복을 멈춤. 그를 위해 while에 들어갈 조건식은?
			
			/*
			 * boolean stop = ...;
			 * while ( '조건식') {
			 * 
			 * */
		}
		
		{
			// Q4. 연필 534자루를 30명에게 똑같은 개수로 나누어 줌.
			//     1인당 보유 가능 수.
			//     남은 연필 수.
			
			int pencils = 534;
			int students = 30;
			
			int pPS = pencils / students;
			System.out.println("1인당 보유 가능 수 : " + pPS);
			
			int pLeft = pencils % students;
			System.out.println("남은 연필 수 : " + pLeft);
				   
		}
		
		{
			// Q5. 출력 결과가 5가 아닌 4로 나온 이유
			
			int var1 = 5;
			int var2 = 2;
			double var3 = var1 / var2; // 여기에서 var3이 2.0으로 나옴.
			int var4 = (int) (var3 + var2); // 고로 2 + 2 = 4.
			System.out.println("var4 : " + var4);
		}
		
		{
			// Q6. 10의 자리 이하를 버리는 코드 작성.
			int value = 356;
			System.out.println(((int)((double)value * 0.01) * 100));
		}
		
		{
			// Q7. 코드를 실행 시, "10%입니다."가 아닌 "10%가 아닙니다." 출력. 이유는?
			// float는 정확한 소수점 값이 아니라 근사치를 출력하기에 같지 않음.
			float var1 = 10f;
			float var2 = var1 / 100;
			if(var2 == 0.1) {
				System.out.println("10%입니다.");
			}
			else {
				System.out.println("10%가 아닙니다.");
			}
		}
		
		{
			// Q8. 사다리꼴의 넓이를 구하는 코드. 정확한 소수 자릿수가 나오도록 코드 작성.
			int lengthTop = 5;
			int lengthBottom = 10;
			int height = 7;
			double area = (((double)(lengthTop + lengthBottom) / 2) * height );
			System.out.println(area);
		}
		
		{
			// Q9. 첫 번째 수 / 두 번째 수의 결과를 "결과:값"으로 출력.
			//     두 번째 수에 0이나 0.0이 입력되면 "결과:무한대"로 출력.
			
			double a = 7.3;
			double b = 2.5;
			
			if (b != 0) {
				System.out.println("결과:" + a/b);
			}
			else {
				System.out.println("결과:무한대");
			}
			
			
		}
		
		{
			// Q10. 반지름이 10인 원의 넓이.
			// var2와 var3, "."를 + 연산해 원주율을 얻은 후 계산.
			
			int var1 = 10;
			int var2 = 3;
			int var3 = 14;
			
			double var4 = var1 * var1 * Double.parseDouble(var2 + "." + (int)var3);
			System.out.println("원의 넓이 : " + var4);
			
		}
		
		{
			// Q11. "id : java, pw : 12345" : 로그인 성공
			//      그 외 : 로그인 실패
			
//			Scanner scanner = new Scanner(System.in);
//			
//			System.out.print("아이디 : ");
//			String name = Scanner.nextLine(); // 코드 그대로 썼는데......
//			
//			System.out.print("패스워드 : ");
//			String strPassword = scanner.nextLine();
//			int password = Integer.parseInt(strPassword);
//			
//			if(name == "java") {
//				if(strPassword == "12345") {
//					System.out.println("로그인 성공");
//				}
//				else {
//					System.out.println("로그인 실패 : 패스워드가 틀림");
//				}
//			} else {
//				System.out.println("로그인 실패 : 아이디가 존재하지 않음");
//			}
		}
		
		{
			// Q12. 연산자 출력 결과
			
			int x = 10;
			int y = 5;
			System.out.println( (x > 7) && (y <= 5)); // true
			System.out.println( (x%3 == 2) || (y%2 != 1) ); // false || false. 고로 false.
		}
		
		{
			// Q13. 대입연산자 하나로 구성된 실행문으로 변경
			
			int value = 0;
			
			value += 10;
			value -= 10;
			value *= 10;
			value /= 10;
			
			System.out.println("Q13 : " + value);
		}
		
		{
			// Q14. 코드 실행 시 출력 결과
			
			int score = 85;
			String result = ( !(score > 90) ) ?  "가" : "나"; // 90 초과의 반대. 즉 90 이하. true이므로 가 출력.
			System.out.println(result);
		}
			
	}

}
