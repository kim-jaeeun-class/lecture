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
		
		{
			// Q1. int에 임의의 수 할당. 그 수가 양수, 0, 음수인지의 여부를 구분해 출력.
			Scanner scan = new Scanner(System.in);
			String num = scan.nextLine(); // 엔터 입력 후 적은 모든 것을 보임
			
			if (Integer.parseInt(num) > 0) {
				System.out.println(num+ "은 양수입니다.");
			}
			else if (Integer.parseInt(num) == 0) {
				System.out.println(num+ "은 0입니다.");
			}
			else {
				System.out.println(num+ "은 음수입니다.");
			}
			
		}
		
		{
			// Q2. a와 b 두 수 중에서 큰 수 입력.
						
			Scanner scan = new Scanner(System.in);
			String a = scan.nextLine();
			String b = scan.nextLine();
			
			if (Double.parseDouble(a) > Double.parseDouble(b) ) {
				System.out.println(a + "이/가 더 큽니다.");
			}
			else if (Double.parseDouble(a) < Double.parseDouble(b) ) {
				System.out.println(b + "이/가 더 큽니다.");
			}
			else {
				System.out.println(a + "와/과 " + b + "는 같습니다.");
			}
			
			
		}
		
		{
			// Q3. 시간과 분이 있을 때, 35분이 지난 시간 출력.
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
		
		{
			// Q4. 어떤 수가 15와 20 사이에 포함되는지의 여부.
			Scanner scan = new Scanner(System.in);
			String num = scan.nextLine();
			
			if (Double.parseDouble(num) >= 15 && Double.parseDouble(num) <= 20) {
				System.out.println(num + "은 15와 20 사이의 수입니다.");
			}
			else {
				System.out.println(num + "은 범위에 해당하지 않는 수입니다.");
			}
			
		}
		
		{
			// Q5. 통장 잔액 = 10000. 출금액에 따라 다음 세 가지를 출력.
			// 잔액이 부족합니다. 얼마 출금했고 얼마 남았습니다. 정확히 입력해주세요.
			
			int money = 10000;
			
			Scanner scan = new Scanner(System.in);
			String money2 = scan.nextLine();
			
			int left = money - Integer.parseInt(money2);
			
			if (left >= 0) {
				System.out.println(money2 + "를 출금했고," + left + "가 남았습니다.");
			}
			else {
				System.out.println("잔액이 부족합니다.");
			}
			
		}
		
		{
			// Q6. 입력한 수에 따라 다음을 출력.
			// 100보다 큰 수이며, 양수이고, 홀수입니다.
			
			Scanner scan = new Scanner(System.in);
			String num = scan.nextLine();
			
			if (Integer.parseInt(num) > 100) {
				// To-Do 여기부터 쓰기!!!!!
			}
			
			
		}
		
		{
			// Q7. 변수 : 어제 온도, 오늘 온도
			// "오늘 온도는 영하 3도입니다. 어제보다 5도 낮습니다." 식으로 출력
		}
		
		{
			// Q8. 변수에 두 자리 숫자가 존재 시,
			// 10의 자리와 1의 자리의 수가 같은지 판단.
		}
		
		{
			// Q9. 사각형의 한 쪽 모서리 : x1 = 10, y1 = 20
			// 대각선의 모서리(반대 좌표) : x2 = 90, y2 = 100
			// 이 때, 새로운 점 x3와 y3는 사각형에 포함되는가?
		}
		
		
	}

}
