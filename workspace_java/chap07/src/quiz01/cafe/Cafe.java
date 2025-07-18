package quiz01.cafe;

import java.util.HashMap;

public class Cafe {
	// 필드
	// 메뉴
	HashMap<Integer, Integer> menu = new HashMap<>();
	
	// 가게명
	String storeName;
	// 비품
	String[] items;
	// 건물
	String buildings;
	// 직원 
	String[] emp;
	
	// 생성자

	
	// 메소드 : 나중에 void들 전부 return 타입에 맞게 수정
	void order() {
		System.out.println("안녕하세요, " + storeName + "입니다.");
		System.out.println("어떤 메뉴를 주문하시겠습니까?");
	}
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
	void serve() {
		
	}
	
}
