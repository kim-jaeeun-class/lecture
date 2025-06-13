package sec00.prac02.quiz;

import java.util.Scanner;

public class FruitMarketExam {

	// 오류 발생!!
	// 구글링 결과 나온 이유...
	// 입력 버퍼 검사 결과? enter키의 데이터가 남아 있어서??? 그걸 사용했다고 함...
	// 다음 nextLine, nextInt 작동 전에 적절하게 scan.nextLine()을 더 쓰면 해결된다고 함.
	// 일단 돌아가게는 했는데... 재고 차감 처리도 해보고 싶다.
	
	public static void main(String[] args) {
		FruitMarket market = new FruitMarket();
	
		Scanner sc = new Scanner(System.in);
		
		boolean service = true;
		
		while(service) {
			System.out.println(market.sName + "에 오신 것을 환영합니다.");
			System.out.println("원하는 서비스의 번호를 입력해주세요.");
			System.out.println("---------------------------------------------------------------------");
			System.out.println("1. 가격 문의 | 2. 현재 재고 | 3. 결제 결과 | 4. 배송 가능 여부 | 5. 종료");
			System.out.println("---------------------------------------------------------------------");
			int serviceNum = sc.nextInt();
			sc.nextLine();
			
			if (serviceNum == 5) {
				System.out.println("서비스를 종료합니다.");
				service = false;
			}
			else if (serviceNum == 1) { 	// 가격 문의
				System.out.println("원하는 과일의 이름과 개수를 순서대로 입력해주세요.");
				System.out.println("과일 이름");
				String name = sc.nextLine();
				
				System.out.println("개수");
				int num = sc.nextInt();
				sc.nextLine();
				
				if(market.askPrice(name, num) == -1) {
					System.out.println("말씀하신 상품은 존재하지 않습니다.");
				}
				else if (market.askPrice(name, num) <= 0) {	// -1은 어차피 if에서 빠지니까...
					System.out.println("잘못된 개수를 입력하셨습니다.");
				}
				else {
					System.out.println("가격은 총" + market.askPrice(name, num) + "원입니다.");
				};
			}
			else if (serviceNum == 2) { 	// 전체 목록 출력
				market.stockList();
			}
			else if (serviceNum == 3) { 	// 거스름돈
				System.out.println("결제하실 과일의 이름을 말씀해주세요.");
				String name = sc.nextLine();
				
				System.out.println("몇 개를 결제하시겠습니까?");
				int num = sc.nextInt();
				sc.nextLine();
				
				System.out.println("지불하실 금액은 얼마입니까?");
				int pay = sc.nextInt();
				sc.nextLine();
				
				if (num <= 0) {
					System.out.println("잘못된 개수를 입력했습니다.");
				}
				else {
					if (market.change(name, num, pay) < 0) {
						if (market.change(name, num, pay) == -1) {	// 리턴값 -1은 품목이 없는 경우니까
							System.out.println("존재하지 않는 상품입니다.");
						}
						else {	// 나머지 경우는 마이너스라도 계산은 됐으니까
							System.out.println("금액이 부족합니다.");
						}
					}
					else {
						System.out.println(":: "+ market.sName + " :: " + "결제가 완료됐습니다.");
						System.out.println("거스름돈은 " + market.change(name, num, pay) + "원입니다. 감사합니다.");
					}
				}
			}
			else if (serviceNum == 4) { 	// 성공 여부
				System.out.println("주소를 입력해주세요.");
				String address = sc.nextLine();
				
				System.out.println("주문하신 품목을 적어주세요.");
				String name = sc.nextLine();
				
				System.out.println("몇 개를 구매하셨습니까?");
				int num = sc.nextInt();
				sc.nextLine();
				
				if (market.delivery(address, name, num) == true) {
					System.out.println("주문이 완료되었습니다.");
				}
				else {
					System.out.println("주문 항목을 잘못 입력하셨습니다. 다시 시도해주세요.");
				}
				System.out.println();
			}
			else {
				System.out.println("잘못된 번호나 개수를 입력하셨습니다.");
			}
		}
	
	sc.close();
	
	}
}
