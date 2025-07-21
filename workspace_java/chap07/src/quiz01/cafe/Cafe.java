package quiz01.cafe;

import java.util.HashMap;

public class Cafe {
	// 필드
	// 메뉴
	// 구조체식으로 하는 쪽이 일반적
	HashMap<Integer, Integer> menu = new HashMap<>();
	HashMap getMenu() {
		return this.menu;
	}
	void setMenu(HashMap menu) {
		this.menu = menu;
	}
	
	// 가게명
	String storeName;
	// 비품
	String[] items;
	// 건물
	String building;
	// 직원 
	int emp;
	// 받아야 하는 돈. 정상적인 주문이 아니면 -1.
	int money = -1;
	//
	String menu1;
	int count;
	
	// 생성자
	// 생성자 부분은 수업에서 같이 진행
//	Cafe(String building, String storeName, int emp){
//		this.building = building;
//		this.storeName = storeName;
//	}
//	Cafe(String building, String storeName) {
//		this.(building, storeName, 0, new HashMap());
//	}
	
	// 메소드 : 나중에 void들 전부 return 타입에 맞게 수정
	// 메뉴 추가 메소드도 만들기
	
	// 쌤 진행 기준 주문 받기
	// 메뉴와 개수 입력 시, 메뉴 가격을 구하고
	// 메뉴가 없으면 -1 return, 메뉴가 있으면 개수를 곱해서 return
	// money 이용
	void order() {
		System.out.println("안녕하세요, " + storeName + "입니다.");
		System.out.println("어떤 메뉴를 주문하시겠습니까?");
	}
	
	// 결제
	// 쌤 진행 기준 주문 받기
	// 전달 인자 : money(int)
	// return : 거스름돈
	// 만약 money가 -1인지 아닌지(if)에 따라서,
	// 주문 내역 X / 받은 금액이 결제액 이상 / 받은 금액이 결제액 미만
	void purchase(int menuNum) {
		int menuPrice = (int)menu.get(menuNum);
		if(menuNum == 1) {
			System.out.println("아메리카노 주문 받았습니다. 가격은 " + menuPrice + "원입니다.");
		}
		else if(menuNum == 2) {
			System.out.println("밀크티 주문 받았습니다. 가격은 " + menuPrice + "원입니다.");
		}
		else if(menuNum == 2) {
			System.out.println("카페라떼 주문 받았습니다. 가격은 " + menuPrice + "원입니다.");
		}
		else {
			System.out.println("존재하지 않는 메뉴입니다.");
		}
	}
	int make() {
		int success = (int) (Math.random() * 100);
		return success;
	}
	void clean() {
		
	}
	
	// 서빙
	// 전달 인자 : 주문 받은 메뉴, 개수
	// 리턴 타입 : void
	void serve() {
		
	}
	
}
