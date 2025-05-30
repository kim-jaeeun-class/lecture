/* if & switch 연습 */

package sec01.exam01;

import java.util.Scanner;

public class IfPrac {

	public static void main(String[] args) {
		// 169p 문제
		
		{
			// Q1. 코드 실행 시 출력되는 내용 확인 > 등급은 B입니다.
			int score = 85;
			System.out.print("등급은 ");
			
			if(score < 70) {
				System.out.print("D");
			}
			else if(score < 80) {
				System.out.print("C");
			}
			else if(score < 90) {
				System.out.print("B");
			}
			else {
				System.out.print("A");
			}
			System.out.println("입니다.");
		}
		
		{
			// Q2. 코드 실행 시 출력되는 내용 확인.
			// 어떤 혜택을 원하세요?
			// 우수 회원 혜택을 받으실 수 있습니다.
			// 일반 회원 혜택을 받으실 수 있습니다.
			// 감사합니다.
			
			System.out.println("어떤 혜택을 원하세요?");
			char grade = 'C';
			switch(grade) {
			case 'A' :
				System.out.println("VVIP 혜택을 받으실 수 있습니다.");
			case 'B' :
				System.out.println("VIP 혜택을 받으실 수 있습니다.");
				break;
			case 'C' :
				System.out.println("우수 회원 혜택을 받으실 수 있습니다.");
			case 'D' :
				System.out.println("일반 회원 혜택을 받으실 수 있습니다.");
				break;
			default :
				System.out.println("혜택이 없습니다.");
			}
			System.out.println("감사합니다.");
		}
		
///////////////////////////////////////////////// 퀴즈 /////////////////////////////////////////////////		
		
		
		Scanner scan = new Scanner(System.in);
		
		{
			// Q1. int에 임의의 수 할당. 그 수가 양수, 0, 음수인지의 여부를 구분해 출력.
			System.out.println("Q1");
			
			String num1 = scan.nextLine(); // 엔터 입력 후 적은 모든 것을 보임
			System.out.println("임의 정수 입력");
			int num = Integer.parseInt(num1);
			
			if (num > 0) {
				System.out.println(num+ "은(는) 양수입니다.");
			}
			else if (num == 0) {
				System.out.println(num+ "은(는) 0입니다.");
			}
			else {
				System.out.println(num+ "은(는) 음수입니다.");
			}
		}
		
		{
			// Q2. a와 b 두 수 중에서 큰 수 입력.
			System.out.println("Q2");		
			
			System.out.println("a");
			String numA = scan.nextLine();
			System.out.println("b");
			String numB = scan.nextLine();
						
			double a = Double.parseDouble(numA);
			double b = Double.parseDouble(numB);
			
			if (a > b) {
				System.out.println(a + "이(가) 더 큽니다.");
			}
			else if (a < b) {
				System.out.println(b + "이(가) 더 큽니다.");
			}
			else {
				System.out.println(a + "와(과) " + b + "는 같습니다.");
			}
		}
		
		{
			// Q3. 시간과 분이 있을 때, 35분이 지난 시간 출력.
			System.out.println("Q3");
			/*
			 * if문 배우기 이전... 24시간 기준이고, 범위 외의 값 출력 시 문제 있음.
			 * int h = 12; // 현재 시간
			 * int m = 40; // 현재 분
			 * int add = 35; // 추가할 분
			 * int hour = (((h*60) + m + add) / 60); // 추가됐을 때의 시간. int 연산자라 소수점은 생략됨.
			 * int min = ((h*60) + m + add) - (hour * 60); // 추가됐을 때의 분. 전체 분 - 시간 분량의 분
			 * System.out.println(hour + "시 " + min + "분");
			 */
			
			// 조건은 35분 추가였지만 plusM에 60분 넣어도 뜨게 한 번.
			
// 			// 너무 길어서 바꾸고 싶은데... 생각 좀 해보기.
//			
//			if ((h < 24) && (m < 60)) { // 24시 기준으로 표시 가능한 시간의 범위 내에서 출력 되도록.
//				if ( total < 1440 ) { // 추가 분까지 합쳐도 24시 미만일 때
//					System.out.println(plusM + "분을 더한 시간은" + (total / 60) + "시 " + (total % 60) + "분입니다.");
//				}
//				else if (total == (24 * 60)) { // 추가 분까지 합쳐서 정확하게 24시 일 때
//					System.out.println(plusM + "분을 더한 시간은 0시 00분입니다.");
//				}
//				else { // 추가 분을 합치면 24시를 초과할 때
//					System.out.println(plusM + "분을 더한 시간은" + ((total - (24 * 60)) / 60) + "시 " + ((total - (24 * 60)) % 60) + "분입니다.");
//				}
//			}
//			else {
//				System.out.println("정확한 시간과 분을 입력해주세요.");
//			}
			
			// 좀 간단하게 했는데 변수가 너무 많지 않나 고민.
			
			String h1 = scan.nextLine();
			String m1 = scan.nextLine();
			
			int plusM = 35;
			System.out.println("현재 시간");
			int h = Integer.parseInt(h1);
			System.out.println("현재 분");
			int m = Integer.parseInt(m1);
			
			
			if (h < 0 || h > 24 || m <= 0 || m > 60) {
				System.out.println("정확한 시간과 분을 입력해주세요.");
			}
			else {
				int total = ((h * 60) + m + plusM);
				int resetH = total % (24 * 60); // 만약... 24시간 넘어갈 경우를 위해. (24*60 = 하루치 분)으로 나눈 나머지를 이용해서 계산해도 되지 않나.
				int finalH = resetH / 60;
				int finalM = resetH % 60;
				
				System.out.println(plusM + "분을 더한 시간은 " + finalH + "시 " + finalM + "분입니다.");
			}			
		}
		
		{
			// Q4. 어떤 수가 15와 20 사이에 포함되는지의 여부.
			System.out.println("Q4");
			
			String num1 = scan.nextLine();
			System.out.println("임의 실수 입력");
			double num = Double.parseDouble(num1);
			
			if (num >= 15 && num <= 20) {
				System.out.println(num + "은(는) 15와 20 사이의 수입니다.");
			}
			else {
				System.out.println(num + "은(는) 범위에 해당하지 않는 수입니다.");
			}
		}
		
		{
			// Q5. 통장 잔액 = 10000. 출금액에 따라 다음 세 가지를 출력.
			// 잔액이 부족합니다. 얼마 출금했고 얼마 남았습니다. 정확히 입력해주세요.
			System.out.println("Q5");
			
			int money = 10000;
			
			System.out.println("출금액 입력");
			String money2 = scan.nextLine();
			
			int left = money - Integer.parseInt(money2);
			
			if (left >= 0) {
				System.out.println(money2 + "원을 출금했고," + left + "원이 남았습니다.");
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
		}
		
		{
			// Q6. 입력한 수에 따라 다음을 출력.
			// 100보다 큰 수이며, 양수이고, 홀수입니다.
			System.out.println("Q6");
			
			String num1 = scan.nextLine();
			System.out.println("임의 정수 입력");
			int num = Integer.parseInt(num1);
			
			if (num >= 100) {
				if (num % 2 == 1) {
					System.out.println("100보다 큰 수이며, 양수이고, 홀수입니다.");
				}
				else {
					System.out.println("100보다 큰 수이며, 양수이고, 짝수입니다.");
				}
			}
			else if (num > 0) {
				if (num % 2 != 0) {
					System.out.println("100보다 작은 수이며, 양수이고, 홀수입니다.");
				}
				else {
					System.out.println("100보다 작은 수이며, 양수이고, 짝수입니다.");
				}
			}
			else if (num == 0) {
				System.out.println("0입니다.");
			}
			else {
				if (num % 2 != 0) {
					System.out.println("100보다 작은 수이며, 음수이고, 홀수입니다.");
				}
				else {
					System.out.println("100보다 작은 수이며, 음수이고, 짝수입니다.");
				}
			}
		}
		
		{
			// Q7. 변수 : 어제 온도, 오늘 온도
			// "오늘 온도는 영하 3도입니다. 어제보다 5도 낮습니다." 식으로 출력
			System.out.println("Q7");
			
			String y1 = scan.nextLine();
			String t1 = scan.nextLine();
			
			System.out.println("어제 기온 입력");
			double y = Double.parseDouble(y1);
			System.out.println("오늘 기온 입력");
			double t = Double.parseDouble(t1);
			
			if (t > 0) {
				if (y > t) {
					System.out.println("오늘 온도는 영상 " + t + "도입니다." + "어제보다 " + (y-t) + "도 낮습니다.");
				}
				else if (y == t) {
					System.out.println("오늘 온도는 영상 " + t + "도입니다." + "어제와 같습니다.");
				}
				else {
					System.out.println("오늘 온도는 영상 " + t + "도입니다." + "어제보다 " + (t-y) + "도 높습니다.");
				}
			}
			else if (t == 0) {
				if (y > t) {
					System.out.println("오늘 온도는 0도입니다." + "어제보다 " + (y-t) + "도 낮습니다.");
				}
				else if (y == t) {
					System.out.println("오늘 온도는 0도입니다." + "어제와 같습니다.");
				}
				else {
					System.out.println("오늘 온도는 0도입니다." + "어제보다 " + (t-y) + "도 높습니다.");
				}
			}
			else {
				if (y > t) {
					System.out.println("오늘 온도는 영하" + -t + "도입니다." + "어제보다 " + (y-t) + "도 낮습니다.");
				}
				else if (y == t) {
					System.out.println("오늘 온도는 영하" + -t + "도입니다." + "어제와 같습니다.");
				}
				else {
					System.out.println("오늘 온도는 영하" + -t + "도입니다." + "어제보다 " + (t-y) + "도 높습니다.");
				}
			}
			
			// 이렇게도 할 수 있지 않나 하는 마음에 한 번 : if 블록 내부에서 변수 지정하기
			System.out.println("Q7-1");
			
			String y2 = scan.nextLine();
			String t2 = scan.nextLine();
			
			System.out.println("어제 기온 입력");
			double y3 = Double.parseDouble(y2);
			System.out.println("오늘 기온 입력");
			double t3 = Double.parseDouble(t2);
			
			String data1;
			String data2;
			
			if (t3 > 0) {
				data1 = "영상" + t3;
			}
			else if (t3 == 0) {
				data1 = "" + t3;
			}
			else {
				data1 = "영하" + -(t3);
			}
			
			if ((y3-t3) > 0) {
				data2 = "보다 " + (y3-t3) + "도 낮습니다.";
			}
			else if ((y3-t3) == 0) {
				data2 = "와 같습니다." ;
			}
			else {
				data2 = "보다 " + -(y3-t3) + "도 높습니다.";
			}
			
			System.out.println("오늘 온도는 " + data1 + "도입니다. 어제" + data2);
			
		}
		
		{
			// Q8. 변수에 두 자리 숫자가 존재 시,
			// 10의 자리와 1의 자리의 수가 같은지 판단.
			System.out.println("Q8");
			
			System.out.println("두 자리 양수 입력");
			String n1 = scan.nextLine();
						
			int n = Integer.parseInt(n1);
			
			if (n >= 100 || n < 10) {
				System.out.println("범위를 벗어난 값입니다.");
			}
			else if ( (n / 10) == (n % 10) ) {
				System.out.println(n + "의 10의 자릿수와 1의 자릿수는 같습니다.");
			}
			else {
				System.out.println(n + "의 10의 자릿수와 1의 자릿수는 다릅니다.");
			}
		}
		
		{
			// Q9. 사각형의 한 쪽 모서리 : x1 = 10, y1 = 20
			// 대각선의 모서리(반대 좌표) : x2 = 90, y2 = 100
			// 이 때, 새로운 점 x3와 y3는 사각형에 포함되는가?
			System.out.println("Q9");
			
			System.out.println("x 좌표 입력");
			String xIn = scan.nextLine();
			System.out.println("y 좌표 입력");
			String yIn = scan.nextLine();
			
			int x1 = 10;
			int y1 = 20;
			
			int x2 = 90;
			int y2 = 100;
			
			int x3 = Integer.parseInt(xIn);
			int y3 = Integer.parseInt(yIn);
			
			if (((x3 >= x1) && (x3 <= x2)) && ((y3 >= y1) && (y3 <= y2))) {
				System.out.println("이 좌표는 사각형에 포함됩니다.");
			}
			else {
				System.out.println("이 좌표는 사각형에 포함되지 않습니다.");
			}
		}
		
		scan.close(); // scanner 경고는 sc.close() 이렇게 닫아서 없앨 수 있다고 검색에서 나오는데... 써도 되나? > OKOK
		
	}

}
