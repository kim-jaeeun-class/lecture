package sec01.exam01;

public class Child extends Parent {
//	extends를 사용하면서 아래 주석 부분이 삽입된 것과 같은 효과
//	String name = "Parent's name";
//	
//	String getName(){
//		System.out.println("Parent's getName");
//		return this.name;
//	}
	
	void printName() {
		System.out.println("Child's printName");
		System.out.println("name : " + name);
		System.out.println("this.name : " + this.name);
		
		String pName = getName();
		System.out.println("pName : " + pName);
	}
	
	// 전달인자가 필드를 가리는 현상 : shadow
	void setName(String name) {
		this.name = name;
	}
	
	// 부모 클래스의 필드(name)을 overshadow
	// 출력 시, Parent's가 아니라 Child's로 출력됨
	String name = "Child's name";
	
//	Child() {
//		super();
//	}
//	this()는 super()와 같이 사용 불가
	Child() {
		super(1); // 부모 생성자 호출(생략 가능)
				  // 첫 번째 줄에 표기
				  // 전달인자 맞춰주기
		System.out.println("Child 생성자");
	}
	Child(int a) {
		super(1);
	}
	
	String getName(){
		System.out.println("Child's getName");
		return this.name;
	}
}
