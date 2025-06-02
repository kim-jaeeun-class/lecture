package sec01.exam01;

import java.util.Scanner;

public class BreakConPrac {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		/*
		 *  Q1.
		 *  특정 수(0)가 오기 전까지 반복.
		 *  수 입력. 음수 / 양수?
		 */
		
		int num = -123;
		
		while(num != 0) {
			
			System.out.println("숫자를 입력하세요.");
			num = sc.nextInt();
			
			if (num > 0) {
				System.out.println("양수입니다.");
			}
			else if (num < 0) {
				System.out.println("음수입니다.");
			}
			else {
				System.out.println("종료합니다.");
			}
		}
		
		/*
		 * Q2.
		 * 월을 입력하면 계절 출력.
		 * 0 입력 시 종료.
		 */
		
		boolean month = true;
		
		while(month) {
			System.out.println("월 수를 입력해주세요.");
			int season = sc.nextInt();
			
			if (season < 0 || season >= 13) {
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
				else if ( season == 12 || season == 1 || season == 2) {
					System.out.println("겨울입니다.");
				}
				else {
					System.out.println("종료합니다.");
					break;
				}
			}
		}
		
		
		/*
		 * Q3.
		 * 가위바위보. 입력하면 게임 결과 출력.
		 * 0이 입력될 때까지 반복.
		 */
			
		int bot = (int) (Math.random() * 3) + 1;
		boolean g = true;
		
		while (bot > 0 && g) {
			System.out.println("가위 = 1, 바위 = 2, 보 = 3");
			System.out.println("종료를 원할 시 0을 눌러주세요.");
			System.out.println("원하는 수를 입력해주세요.");
			
			bot = (int) (Math.random() * 3) + 1;
			int game = sc.nextInt(); // nextLine도 생각해보기.
			
			if (game < 0 || game > 3) {
				System.out.println("잘못된 수를 입력하였습니다. 다시 입력해주세요.");
			}
			else if (game == 0) {
				System.out.println("게임을 종료합니다.");
				g = false;
			}
			else { // 
				if (game == bot) {
					System.out.println("상대의 수 : " + bot);
					System.out.println("비겼습니다.");
				}
				else {
					if (game == 1) {
						if (bot == 2) {
							System.out.println("상대의 수 : " + bot);
							System.out.println("졌습니다.");
						}
						else {
							System.out.println("상대의 수 : " + bot);
							System.out.println("이겼습니다.");
						}
					}
					else if (game == 2) {
						if (bot == 1) {
							System.out.println("상대의 수 : " + bot);
							System.out.println("이겼습니다.");
						}
						else {
							System.out.println("상대의 수 : " + bot);
							System.out.println("졌습니다.");
						}
					}
					else {
						if (bot == 1) {
							System.out.println("상대의 수 : " + bot);
							System.out.println("졌습니다.");
						}
						else {
							System.out.println("상대의 수 : " + bot);
							System.out.println("이겼습니다.");
						}
					}
				}
			}
		}
		
		
		/*
		 * Q4.
		 * 은행에서 '1. 입금 / 2. 출금 / 3. 잔고확인 / 4. 종료'
		 * 조건 : 입금, 출금 시 음수 예금 불가. 출금 시 잔고보다 큰 금액 불가.
		 */
		
		boolean bank = true;
		
		int money = 10000;
		
		while(bank) {
			System.out.println("1. 입금 / 2. 출금 / 3. 잔고확인 / 4. 종료");
			System.out.println("원하는 서비스의 번호를 입력해주세요.");
			
			int service = sc.nextInt();
			
			if (service == 1) {
				System.out.println("입금할 금액을 입력해주세요.");
				int in = sc.nextInt();
				boolean inStatus = true;
				while (inStatus) {
					if (in <= 0) {
						System.out.println("잘못된 금액을 입력했습니다.");
						System.out.println("다시 실행해주세요.");
						inStatus = false;
					}
					else {
						System.out.println(in + "원을 입금하셨습니다.");
						money = money + in;
						System.out.println("현재 잔고 : " + money + "원");
						break;
					}
				}	
			}
			else if (service == 2) {
				System.out.println("출금할 금액을 입력해주세요.");
				int out = sc.nextInt();
				boolean outStatus = true;
				while (outStatus) {
					if (out <= 0) {
						System.out.println("잘못된 금액을 입력했습니다.");
						System.out.println("다시 실행해주세요.");
						outStatus = false;
					}
					else {
						System.out.println(out + "원을 입금하셨습니다.");
						money = money - out;
						System.out.println("현재 잔고 : " + money + "원");
						break;
					}
				}	
			}
			else if (service == 3) {
				System.out.println(money);
				System.out.println("추가로 원하는 서비스의 번호를 입력해주세요.");
				System.out.println("없을 시 4번을 눌러주세요.");
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
