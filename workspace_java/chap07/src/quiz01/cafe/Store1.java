package quiz01.cafe;

public class Store1 extends Cafe {
	String storeName = "Store1";
	
	Store1() {
		menu.put(1, 4700);
		menu.put(2, 6100);
		menu.put(3, 5200);
	}
	
	@Override
	void order() {
		System.out.println("안녕하세요, " + storeName + "입니다.");
		System.out.println("어떤 메뉴를 주문하시겠습니까?");
		System.out.println(":: 메뉴 목록 ::");
		System.out.println("1. 아메리카노 : 4700원 / 2. 밀크티 : 6100원 / 3. 카페라떼 : 5200");
	}
	
	@Override
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
	

	
}
