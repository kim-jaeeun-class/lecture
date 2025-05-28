package sec01.exam01;

public class VarTypeExam01 {

	public static void main(String[] args) {
		
		{
			byte b1; // 정수 타입 byte로 b1 선언
			b1 = 127;
			System.out.println("b1 : " + b1); // 출력 가능
			/* b1 = 128;
			System.out.println("b1 : " + b1); // 출력 불가. byte는 최대 127까지만 저장 가능. */
		}
		
		{
			int var1 = 0b1011; // 2진수
			int var2 = 0206; // 8진수
			int var3 = 365; // 10진수
			int var4 = 0xB3; // 16진수
			
			System.out.println("var1 : " + var1); // 2진수를 10진수 값으로 출력
			System.out.println("var2 : " + var2); // 8진수를 10진수 값으로 출력
			System.out.println("var3 : " + var3); // 10진수 출력
			System.out.println("var4 : " + var4); // 16진수를 10진수 값으로 출력
		}
		
		{
			char c1 = 65; // 코드상 65가 A.
			System.out.println("c1 : " + c1);
			c1 = 65 + 2;
			System.out.println("c1 : " + c1);
			char c2 = 'F'; // char 타입에서만 '' 사용.
			System.out.println("c2 : " + c2);
			System.out.println("c2 - c1 : " + (c2 - c1));
			char c3 = '한';
			System.out.println("c3 + 1 : " + (c3 + 1)); // 숫자로 출력
		}
		
		{
			/* char var1 = "A"; // ""로 저장되는 데이터를 String이라고 함. 고로 이 코드는 출력 불가. */
			String s1 = "김재은"; // String은 단일 문자, 문자열 모두 출력 가능.
			System.out.println("s1 : " + s1);
			
			String s2 = "가나다";
			String s3 = "가\"나다";
			String s4 = "가\t나\n다";
			
			System.out.println("s2 : " + s2);
			System.out.println("s3 : " + s3);
			System.out.println("s4 : " + s4);
			
			s2 = s2 + "글씨";
			System.out.println("s2(NEW) : " + s2 + 3);
			s4 = s4 + "글씨";
			System.out.println("s4(NEW) : " + s4 + 2 + 4); // 숫자 연산이 아니라 단순 이어쓰기 취급.
			
			String s5 = 3 + 2 + "글씨"; 
			/* 왼쪽에서 숫자 연산 먼저 진행 후, "글씨"를 만나 문자열로 취급. 
			 * 숫자 연산이 "글씨" 뒤로 가면 이어쓰기 취급.
			 * 뒤에 두고 숫자 연산을 시키고 싶으면 괄호로 우선순위 변경. */
			System.out.println("s5 : " + s5);
			
			int i1 = 2100000000; // 출력 가능
			// int i2 = 2200000000; 출력 불가
			long l1 = 2200000000L; // long 타입은 뒤에 L을 붙여야 출력 가능. 안 붙이면 int 취급.
			
			System.out.println("i1 & l1 : " + i1 + ", " + l1);
			
			float f1 = 3.14f; // f 없이는 정상 출력 불가.
			double d1 = 3.14; 
			System.out.println("f1 : " + f1); // float, double 모두 정상 출력
			System.out.println("d1 : " + d1);
			
			double d2 = 0.12345678901234567890;
			System.out.println("d2 : " + d2); // 일정 자릿수 이하는 자동 반올림. float도 동일.
			
			double d3 = 6e-2;
			System.out.println("d3 : " + d3); // 실수 리터럴
			
			boolean bl1 = true;
			boolean bl2 = false;
			System.out.println(bl1);
			System.out.println(bl2);
			
			{
				// Q1. 내 나이를 저장하기.
				int age;
				age = 2025 - 1997; // 출생년도 입력(만 나이 기준)
				System.out.println("Q1. 나이 : " + age);
				
				// Q2. 자차 소유 여부.
				boolean car = false;
				System.out.println("Q2. 차 : " + car);
				
				// Q3. 우리 집에 있는 스마트폰 개수
				int phone;
				phone = 1;
				System.out.println("Q3. 스마트폰 개수 : " + phone);
				
				// Q4. 이름
				String name = "이름";
				System.out.println("Q4. 이름 : " + name);
				
				// Q5. 1평이 3.3 제곱미터일 때, 5평은?
				double area = 3.3 * 5;
				System.out.println("Q5. 5평 : " + area);
				
				
			}
			
			{
				// Q0. 두 변수 a, b에 3, 4를 할당. "3과 4"로 출력
				int a = 3;
				int b = 4;
				
				System.out.println(a + "과 " + b);
				
				// Q1. 두 변수 a, b에 3, 4를 할당. "3 > 4의 결과는 false입니다" 출력.
				System.out.println(a + " > " + b + "의 결과는 " + (a > b) + "입니다");
				
				// Q1-1. "6 > 5의 결과는 true입니다" 출력.
				a = 6;
				b = 5;		
				System.out.println(a + " > " + b + "의 결과는 " + (a > b) + "입니다");
				
				// Q2. 숫자 537을 "백의 자리 : 5, 십의 자리 : 3, 일의 자리 : 7로 출력"
				int num = 537;
				int hun = num / 100;
				int ten = (num - (hun * 100)) / 10;
				int one = (num - (hun * 100) - (ten * 10));
				
				System.out.println("백의 자리 : " + hun); // 테스트 1. 백의 자리.
				System.out.println("십의 자리 : " + ten); // 테스트 2. 십의 자리.
				System.out.println("일의 자리 : " + one); // 테스트 3. 일의 자리.
				
				System.out.println("백의 자리 : " + hun + "\n십의 자리 : " + ten + "\n일의 자리 : " + one); // 최종 출력
				
				
				//Q3. 현재 시간에 추가 시간(분 기준) 더한 값 출력해보기... (취소된 문제)
				
				int h = 12; // 현재 시간
				int m = 40; // 현재 분
				int add = 35; // 추가할 분
				int hour = (((h*60) + m + add) / 60); // 추가됐을 때의 시간. int 연산자라 소수점은 생략됨.
				/* 
				 * 근데 24시 기준으로 됐는데, 12시간 기준으로 구할 방법이 if 제외하고 없나?
				 * 22시나 23시를 현재 시간으로 넣으면 24시, 25시도 얼마든지 나올 수 있는데...
				 */
				int min = ((h*60) + m + add) - (hour * 60); // 추가됐을 때의 분. 전체 분 - 시간 분량의 분
				
				System.out.println(hour + "시 " + min + "분");
			}
			
		}

	}

}
