package sec02.exam01;

public class Cat extends Animal {
	
	private int age = 3;
	
	@Override
	void eat() {
		System.out.println("slurp");
	}
	
	@Override
	void think() {
		System.out.println("Idk");
	}
	
	void clean() {
		System.out.println("self-clean");
	}
	void grooming() {
		System.out.println("wash");
	}
}
