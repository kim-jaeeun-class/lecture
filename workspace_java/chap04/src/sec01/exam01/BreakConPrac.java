package sec01.exam01;

import java.util.Scanner;

public class BreakConPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  Q1.
		 *  특정 수(0)가 오기 전까지 반복.
		 *  수를 입력하면 음수인지 양수인지 표시.
		 */
		
		System.out.println("Q1. 음수 / 양수 구분");
		
		boolean number = true;
		
		while(number) {
			
			System.out.println("숫자를 입력하세요.");
			int num = sc.nextInt();
			
			if (num > 0) {
				System.out.println("양수입니다.");
			}
			else if (num < 0) {
				System.out.println("음수입니다.");
			}
			else {
				System.out.println("종료합니다.");
				number = false;
			}
		}
		
		/*
		 * Q2.
		 * 월을 입력하면 계절 출력.
		 * 0 입력 시 종료.
		 */
		
//		boolean month = true;
//		
//		while(month) {
//			System.out.println("월 수를 입력해주세요.");
//			int season = sc.nextInt();
//			
//			if (season < 0 || season >= 13) {
//				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
//			}
//			else {
//				if ( season >= 3 && season <= 5 ) {
//					System.out.println("봄입니다.");
//				}
//				else if ( season >= 6 && season <= 8 ) {
//					System.out.println("여름입니다.");
//				}
//				else if ( season >= 9 && season <= 11 ) {
//					System.out.println("가을입니다.");
//				}
//				else if ( season == 12 || season == 1 || season == 2) {
//					System.out.println("겨울입니다.");
//				}
//				else {
//					System.out.println("종료합니다.");
//					break;
//				}
//			}
//		}
//		개선 목적 : 겨울을 구분하는 조건이 지저분하지 않은지.
//		차라리 조건이 간결한 종료문을 앞으로 당기고 겨울을 else로 할 수 있지 않나?
		
		System.out.println("Q2. 계절 구분");
		
		boolean month = true;
		
		while(month) {
			System.out.println("월 수를 입력해주세요.");
			int season = sc.nextInt();
			
			if (season == 0) { // 종료문을 앞으로 당김
				System.out.println("종료합니다.");
				month = false;
			}
			else if (season < 0 || season >= 13) { // 예외는 뒤에
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요");
			}
			else {
				if ( season >= 3 && season <= 5 ) {
					System.out.println("봄입니다.");
				}
				else if ( season >= 6 && season <= 8 ) {
					System.out.println("여름입니다.");
				}
				else if ( season >= 9 && season <= 11 ) {
					System.out.println("가을입니다.");
				}
				else { // 가장 긴 겨울 조건을 else로 뻄. 어차피 0 이하나 13 이상은 else if 이후로 다 빠져서 ok.
					System.out.println("겨울입니다.");
				}
			}
		}
		
		
		/*
		 * Q3.
		 * 가위바위보. 입력하면 게임 결과 출력.
		 * 0이 입력될 때까지 반복.
		 */
			
//		boolean g = true;
//		
//		while (g) {
//			System.out.println("가위 = 1, 바위 = 2, 보 = 3");
//			System.out.println("종료를 원할 시 0을 눌러주세요.");
//			System.out.println("원하는 수를 입력해주세요.");
//			
//			int bot = (int) (Math.random() * 3) + 1;
//			int game = sc.nextInt(); // nextLine도 생각해보기.
//			
//			if (game < 0 || game > 3) {
//				System.out.println("잘못된 수를 입력하였습니다. 다시 입력해주세요.");
//			}
//			else if (game == 0) {
//				System.out.println("게임을 종료합니다.");
//				g = false;
//			}
//			else { // 
//				if (game == bot) {
//					System.out.println("상대의 수 : " + bot);
//					System.out.println("비겼습니다.");
//				}
//				else {
//					if (game == 1) {
//						if (bot == 2) {
//							System.out.println("상대의 수 : " + bot);
//							System.out.println("졌습니다.");
//						}
//						else {
//							System.out.println("상대의 수 : " + bot);
//							System.out.println("이겼습니다.");
//						}
//					}
//					else if (game == 2) {
//						if (bot == 1) {
//							System.out.println("상대의 수 : " + bot);
//							System.out.println("이겼습니다.");
//						}
//						else {
//							System.out.println("상대의 수 : " + bot);
//							System.out.println("졌습니다.");
//						}
//					}
//					else {
//						if (bot == 1) {
//							System.out.println("상대의 수 : " + bot);
//							System.out.println("졌습니다.");
//						}
//						else {
//							System.out.println("상대의 수 : " + bot);
//							System.out.println("이겼습니다.");
//						}
//					}
//				}
//			}
//		}
//		목표 : 조금만 깔끔하게! 이김, 짐의 공통 조건을 찾아서 간략하게 해보기.
		
		System.out.println("Q3. 기존 가위바위보 간략화 버전.");
		
		boolean g = true; // 생각해보니 어차피 while 안에서 bot 설정을 했다... boolean만 써도 된다.
		
		while (g) {
			System.out.println("가위 = 1, 바위 = 2, 보 = 3");
			System.out.println("종료를 원할 시 0을 눌러주세요.");
			System.out.println("원하는 수를 입력해주세요.");
			
			int bot = (int) (Math.random() * 3) + 1;
			int game = sc.nextInt(); // nextLine도 생각해보기.
			
			if (game < 0 || game > 3) {
				System.out.println("잘못된 수를 입력하였습니다. 다시 입력해주세요."); // 유효하지 않은 경우 제거
			}
			else if (game == 0) {
				System.out.println("게임을 종료합니다."); // 종료하는 경우 제거
				g = false;
			}
			else { // 실제 게임은 else에서
				System.out.println("상대의 수 : " + bot); // 이 부분은 겹치니까... 여기로 뺄 수 있을 듯.
				
				if (game == bot) { // 같으면 비김
					System.out.println("비겼습니다.");
				}
				else if ((game == 1 && bot == 3) || // 지금 숫자로는... 이기는 조건 작성은 그나마 여기까지? 규칙 만들기엔 지금 1, 2, 3으로는 어려울 듯.
						 (game == 2 && bot == 1) || 
						 (game == 3 && bot == 2)) { 
					System.out.println("이겼습니다");
				}
				else { // 비김 / 이김을 뺐으므로 나머지는 전부 졌습니다.
					System.out.println("졌습니다");
				}
			}
		}
		
		System.out.println("Q3. nextLine을 써서 작성"); // equals!!!! 자꾸 == 쓰려고 하지 말기.
		
		boolean g2 = true;
		
		while(g2) {
			System.out.println("가위, 바위, 보를 입력해주세요.");
			System.out.println("종료를 원할 시 0을 눌러주세요.");
			System.out.println("원하는 수를 입력해주세요.");
			
			int bot1 = (int) (Math.random() * 3) + 1; // String 랜덤출력은 모르곘으니까 bot1로 랜덤값 만들기.
			String bot; // 이걸 if문 내에 넣어서 bot1을 조건 삼아 조절해보기로.
			String game = sc.nextLine(); // 가위, 바위, 보 입력.
			
			if (bot1 == 1) {
				bot = "가위";
			}
			else if (bot1 == 2) {
				bot = "바위";
			}
			else {
				bot = "보";
			} // 여기까지 bot 설정.
			
			if (!(game.equals("가위") || game.equals("바위") || game.equals("보") || game.equals("0"))) { // 조건... 길다.
				System.out.println("잘못된 수를 입력하였습니다. 다시 입력해주세요.");
			}
			else if (game.equals("0")) { // 탈출 조건.
				System.out.println("게임을 종료합니다.");
				g2 = false;
			}
			else { // 실제 게임.
				System.out.println("상대의 수 : " + bot);
				
				if (game.equals(bot)) { // 같으면 비김
					System.out.println("비겼습니다.");
				}
				else if ((game.equals("가위") && bot.equals("보")) || // 간략화 할 방법 당장은 생각나지 않는다.
						 (game.equals("바위") && bot.equals("가위")) || 
						 (game.equals("보") && bot.equals("바위"))) { 
					System.out.println("이겼습니다");
				}
				else { // 비김, 이김이 다 빠졌으므로 나머지는 자동으로 짐.
					System.out.println("졌습니다");
				}
			}			
		}
		
		
		/*
		 * Q4.
		 * 은행에서 '1. 입금 / 2. 출금 / 3. 잔고확인 / 4. 종료'
		 * 조건 : 입금, 출금 시 음수 예금 불가. 출금 시 잔고보다 큰 금액 불가.
		 */
		
//		boolean bank = true;
//		
//		int money = 10000;
//		
//		while(bank) {
//			System.out.println("1. 입금 / 2. 출금 / 3. 잔고확인 / 4. 종료");
//			System.out.println("원하는 서비스의 번호를 입력해주세요.");
//			
//			int service = sc.nextInt();
//			
//			if (service == 1) {
//				System.out.println("입금할 금액을 입력해주세요.");
//				int in = sc.nextInt();
//				boolean inStatus = true;
//				while (inStatus) {
//					if (in <= 0) {
//						System.out.println("잘못된 금액을 입력했습니다.");
//						System.out.println("다시 실행해주세요.");
//						inStatus = false;
//					}
//					else {
//						System.out.println(in + "원을 입금하셨습니다.");
//						money = money + in;
//						System.out.println("현재 잔고 : " + money + "원");
//						break;
//					}
//				}	
//			}
//			else if (service == 2) {
//				System.out.println("출금할 금액을 입력해주세요.");
//				int out = sc.nextInt();
//				boolean outStatus = true;
//				while (outStatus) {
//					if (out <= 0) {
//						System.out.println("잘못된 금액을 입력했습니다.");
//						System.out.println("다시 실행해주세요.");
//						outStatus = false;
//					}
//					else if (out > money) { // 출금액이 많은 경우 작성 깜빡했다...
//						System.out.println("잔고가 부족합니다.");
//						System.out.println("다시 실행해주세요.");
//						outStatus = false;
//					}
//					else {
//						System.out.println(out + "원을 출금하셨습니다.");
//						money = money - out;
//						System.out.println("현재 잔고 : " + money + "원");
//						break;
//					}
//				}	
//			}
//			else if (service == 3) {
//				System.out.println(money);
//			}
//			else if (service == 4) {
//				System.out.println("서비스를 종료합니다.");
//				bank = false;
//			}
//			else {
//				System.out.println("잘못된 번호를 입력하셨습니다.");
//				System.out.println("번호를 다시 입력해주세요.");
//			}
//		}
//		여기를 간단하게 하기도 가능할지... 한 번 시도.
		
		System.out.println("Q4. 은행");
		
		boolean bank = true;
		
		int money = 10000;
		
		while(bank) {
			System.out.println("1. 입금 / 2. 출금 / 3. 잔고확인 / 4. 종료");
			System.out.println("원하는 서비스의 번호를 입력해주세요.");
			
			int service = sc.nextInt();
			
			if (service == 1) {
				System.out.println("입금할 금액을 입력해주세요.");
				int in = sc.nextInt();
				if (in <= 0) {	// while을 쓸... 필요가 없지 않나 싶어서 뺐는데 잘 된다. 2번도 마찬가지로 진행.
					System.out.println("잘못된 금액을 입력했습니다.");
					System.out.println("다시 실행해주세요.");
				}
				else {
					System.out.println(in + "원을 입금하셨습니다.");
					money = money + in;
					System.out.println("현재 잔고 : " + money + "원");
				}
			}	
			else if (service == 2) {
				System.out.println("출금할 금액을 입력해주세요.");
				int out = sc.nextInt();
				if (out <= 0) {
					System.out.println("잘못된 금액을 입력했습니다.");
					System.out.println("다시 실행해주세요.");
				}
				else if (out > money) { // 출금액이 많은 경우 작성 깜빡했다...
					System.out.println("잔고가 부족합니다.");
					System.out.println("다시 실행해주세요.");
				}
				else {
					System.out.println(out + "원을 출금하셨습니다.");
					money = money - out;
					System.out.println("현재 잔고 : " + money + "원");
				}
			}	
			else if (service == 3) {
				System.out.println("현재 잔고 : " + money + "원");
			}
			else if (service == 4) {
				System.out.println("서비스를 종료합니다.");
				bank = false;
			}
			else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
				System.out.println("번호를 다시 입력해주세요.");
			}
		}
		sc.close();
	}

}
