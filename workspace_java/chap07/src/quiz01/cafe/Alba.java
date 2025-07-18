package quiz01.cafe;

public class Alba {
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
