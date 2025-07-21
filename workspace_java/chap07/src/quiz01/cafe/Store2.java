package quiz01.cafe;

public class Store2 extends Cafe {
	String storeName = "Store2";
	
	Store2() {
		menu.put(1, 2000);
		menu.put(2, 3500);
		menu.put(3, 3200);
	}
	
	@Override
	void order() {
		super.order();
		System.out.println(":: 메뉴 목록 ::");
		System.out.println("1. 아메리카노 : 2000원 / 2. 밀크티 : 3500원 / 3. 카페라떼 : 3200");
	}

}
