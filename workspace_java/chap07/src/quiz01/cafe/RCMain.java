package quiz01.cafe;

public class RCMain {

	public static void main(String[] args) {
		Store1 st1 = new Store1();
		Store2 st2 = new Store2();
		Alba alba = new Alba();
		
		// 이런 식으로 우선 alba에 넣어버리면 될 듯
		// 남은 건 메소드들 더 만들기...
		alba.albaOrder(st1);
		
		alba.albaPur(st1, 3);
		
		if(alba.albaMake(st1) > 50) {
			System.out.println("음료 제작이 완료됐습니다.");
		}
		else {
			System.out.println("다시 제작");
		}
		
	}

}
