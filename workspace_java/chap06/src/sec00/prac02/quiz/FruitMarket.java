package sec00.prac02.quiz;

public class FruitMarket {

////  참고
////	String[] name = {"사과", "배", "귤"}; // 과일명
////	int[] price = {8000, 9000, 12000}; // 과일 가격 
////	int[] stock = {30, 20, 25}; // 재고
//	
//	Fruit[] name = new Fruit[3];
//	Fruit[] price = new Fruit[3];
//	Fruit[] stock = new Fruit[3];
//	
	String sName;
//	
////	String[] fruitInfo = {fruit.name[1], fruit.price[1], fruit.stock[1]}; // 더 건드리면 화나니까 잠깐 아무 값이나 입력해두고 킵...

	// 다시... 가보자......
	
	Fruit[] fruit = new Fruit[3]; // 처음에 선생님이 말씀해주셨던 코드. 이쪽을 반영해서 전개.
	// 일단...... 외부 클래스 참조는 sec02의 Car 파일 있으니까 그거 보면서... 써보기.

	
	// 생성자
	FruitMarket () {
		sName = "임시가게명";
		
		fruit[0] = new Fruit();
		fruit[0].name = "사과";
		fruit[0].price = 8000;
		fruit[0].stock = 30;       
		
		fruit[1] = new Fruit();
		fruit[1].name = "배";
		fruit[1].price = 9000;
		fruit[1].stock = 20;

		fruit[2] = new Fruit();
		fruit[2].name = "귤";
		fruit[2].price = 12000;
		fruit[2].stock = 25;
	}
	
	// 메소드 1. 가격 묻기
	int askPrice(String n, int s) {
		for(int i = 0; i < fruit.length; i++) {
			if (fruit[i].name.equals(n)) {
				return (fruit[i].price * s);
			}
		}
		return 0;	// 잘못 입력하지 않은 한 가격이 0이 나올 일은 없으므로 편의상 0으로 적기
	}
	
	// 메스드 2. 재고 목록
	void stockList() {
		for (int i = 0; i < fruit.length; i++) {
			System.out.println(fruit[i].name + "은(는) " + fruit[i].price + "원이고, " + fruit[i].stock + "개 남았습니다.");
		}
	}
	
	// 메소드 3. 결제
	int change(String n, int s, int p) {
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i].name.equals(n)) { // 이름이 같으면
				int c = p - (fruit[i].price * s);	// 거스름돈 계산해서
				return c;	// 거스름돈 리턴(마이너스더라도 관계 없이)
			}
		}
		return -1; // 없으면? -1 리턴(0 하기에는 딱 금액이 맞아떨어질 수도 있으니까...)
	}
	
	// 메소드 4. 배송 여부
	boolean delivery(String a, String n, int num) { 	// 70%의 확률로 true를 내놓기
		for (int i = 0; i < fruit.length; i++) {
			if (fruit[i].name.equals(n)) {	// 존재하는 상품일 경우
				return Math.random() <= 0.7;	// 70%의 랜덤 돌리기
			}
		}
		return false; // 없는 상품이면 false
		
		
	}
}
