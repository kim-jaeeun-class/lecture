package quiz01.cafe;

public class Arbeit {
	Cafe cafe;
	
	// 생성자
	Arbeit(Cafe cafe) {
		this.cafe = cafe;
	}
	
	void albaOrder(Cafe cafe) {
		cafe.order();
	}
	void albaPur(Cafe cafe, int menuNum) {
		cafe.purchase(menuNum);
	}
	int albaMake(Cafe cafe) {
		return cafe.make();
	}
}
