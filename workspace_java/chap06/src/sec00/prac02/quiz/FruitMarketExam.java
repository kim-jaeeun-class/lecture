package sec00.prac02.quiz;

import java.util.Scanner;

public class FruitMarketExam {

	public static void main(String[] args) {
		FruitMarket market = new FruitMarket();
	
		Scanner sc = new Scanner(System.in);
	
		System.out.println("원하는 서비스의 번호를 입력해주세요.");
		System.out.println("---------------------------------------------------------------------");
		System.out.println("1. 가격 문의 | 2. 현재 재고 | 3. 결제 결과 | 4. 배송 가능 여부 | 5. 종료");
		System.out.println("---------------------------------------------------------------------");
		int serviceNum = sc.nextInt();
		boolean service = true;
		
		while(service) {
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
				
				System.out.println(market.askPrice(name, num));
			}
			else if (serviceNum == 2) { 	// 전체 목록 출력
				market.stockList();
			}
			else if (serviceNum == 3) { 	// 거스름돈
				System.out.println(market.change("이름", 1, 1));
			}
			else if (serviceNum == 4) { 	// 성공 여부
				System.out.println();
			}
			else {
				System.out.println("잘못된 번호를 입력하셨습니다.");
			}
		}
	
	sc.close();
	
	}
}
