package sec01.exam01;

public class VarTypeExam02 {

	public static void main(String[] args) {
		{
			int intValue = 10;
			byte byteValue = (byte) intValue; // 타입 변환. int > byte.
			
			intValue = 200;
			byteValue = (byte) intValue;
			System.out.println(byteValue); // byte의 저장 가능 값을 넘어감.
			
			double d = -3.14;
			int i = (int) d;
			System.out.println("i : " + i);
			
			int i2 = 100;
			long l1 = (long) i2;
			long l2 = i2;
			System.out.println(l1);
			System.out.println(l2);
			
			int i3 = 3;
			long l3 = 4L; // L이 없으면 자동 형 변환됨.
			long l4 = (long) i3 + l3; // (long) < 이 부분이 없어도 자동으로 형 변환.
			System.out.println(l4);
			
			int i7 = 10;
			double d7 = 5.5;
			double result = i7 + d7; // i7이 double로 형 변환 되는 과정 생략.
			System.out.println(result);
			
			double d8 = 10 / 4 ; // 오른쪽 / 연산이 먼저 진행돼서 int 기준으로 연산 완료 후 출력됨.
			/*
			 * 해결 방안
			 * double d8 = 10.0 / 4.0; 1. 추가적인 값 입력 필요
			 * double d8 = (double) 10 / (double) 4; 2. 강제 형 변환
			 * double d8 = (double) 10 / 4; 3. 강제 형 변환 + 자동 형 변환
			 */
			System.out.println("d8 : " + d8);
			
			String s1 = "123";
			// 오류 발생. int i8 = (int) s1;
			int i8 = Integer.parseInt(s1);
			System.out.println("i8 : " + i8);
			
			/*
			 * 위는 가능하지만, 아래 같은 경우는 오류 발생.
			 * String s2 = "123a";
			 * int i9 = Integer.parseInt(s2);
			 * System.out.println("i9 : " + i9);
			 */
						
		}
		
		{
			// Q. 회식비 43000. 참석 인원 4명. 인당 지불 비용은?
			// case 1(원 단위), case 2(참석 인원은 만 원 단위로만 지불), case 3(2번으로 받을 시, 주최자가 낼 비용)로 출력.
			// case 1.
			double total = 4.3;
			int count = 4;
			double price01 = total / (double) count;
			
			System.out.println("Case 01-1. 인당 가격 : " + price01 + "만 원");
			System.out.println("Case 01-2. 인당 가격 : " + (price01 * 10000) + "원");
			
			// case 2.
			// int price02 = (int) total / (count - 1);
			int price02 = (int) price01;
			
			System.out.println("Case 02-1. 인당 가격 : " + price02 + "만 원");
			System.out.println("Case 02-2. 인당 가격 : " + (price02 * 10000) + "원");
			
			// case 3. 주최차 포함 기준으로 써봤는데 왜 소수점이 나오는지. > JAVA 문제... 굳이 맞추고 싶으면 Math.ceil() 쓰기.
			double price03 = total - (price02 * (count - 1)); // total = 4.3, price02 = 1, (count - 1) = 3
			
			System.out.println("Case 03-1. 주최자 지불 비용 : " + price03 + "만 원");
			System.out.println("Case 03-2. 주최자 지불 비용 : " + Math.ceil(price03 * 10000) + "원");
			
		
		}
		
		
	}

}
