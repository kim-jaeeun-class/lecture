package sec00.prac02.quiz;

public class FruitMarket {

//  참고
//	String[] name = {"사과", "배", "귤"}; // 과일명
//	int[] price = {8000, 9000, 12000}; // 과일 가격 
//	int[] stock = {30, 20, 25}; // 재고
	
	Fruit[] name = new Fruit[3];
	Fruit[] price = new Fruit[3];
	Fruit[] stock = new Fruit[3];
	
	String sName;
	
//	String[] fruitInfo = {fruit.name[1], fruit.price[1], fruit.stock[1]}; // 더 건드리면 화나니까 잠깐 아무 값이나 입력해두고 킵...
	
	// 생성자
	FruitMarket () {
		sName = "임시가게명";
	}
	
	// 메소드.. 
	// 그냥 지금 구조만 맞춰두려고 하는 중. 나중에 필드 문제 해결되면 제대로 건드리기.
	int askPrice(String n, int s) {
		if (fruitInfo[0].equals(n)) {
			return (Integer.parseInt(fruitInfo[1]) * s);
		}
		return 0;
	}
	
	void stockList() {
		for (int i = 0; ; i++) {
			System.out.println(fruitInfo[] + "는 " + fruitInfo[] + "원이고, " + fruitInfo[] + "개 남았습니다.");
		}
	}
	
	int change(String n, int s, int p) {
		
		return 0;
	}
	
	boolean delivery(String a, String n, int num) {
		return true; // 오류 제거용 임시 리턴문
	}
}
