package sec03.exam02.abst;

public abstract class Animal {
	String kind;
	
	void breathe() {
		System.out.println("슴 쉬다");
	}
	// 추상 메소드. {} 블럭
	abstract void sound();
	void love() {
		System.out.println();
	}
}
