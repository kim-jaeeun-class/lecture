package sec01.exam01;

public class Parent {
	String name = "Parent's name";
	
	String getName(){
		System.out.println("Parent's getName");
		return this.name;
	}
	
//	Parent() {
//		System.out.println("Parent 생성자");
//	}
	Parent(int a) {
		System.out.println("Parent 생성자");
	}
}
