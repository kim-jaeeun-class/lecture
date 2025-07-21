package sec03.exam02.abst;

public abstract class Windows {
	void boot() {
		System.out.println("CMOS 실행");
		System.out.println("윈도우 실행");
		start(); // 뒤의 start가 이쪽에서 실행 가능
		System.out.println("마우스 커서 로딩중");
	}
	abstract void start();
	
	void desktop() {
		
	};
}
