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
		super.order();
		System.out.println(":: 메뉴 목록 ::");
		System.out.println("1. 아메리카노 : 4700원 / 2. 밀크티 : 6100원 / 3. 카페라떼 : 5200");
	}
	
}
