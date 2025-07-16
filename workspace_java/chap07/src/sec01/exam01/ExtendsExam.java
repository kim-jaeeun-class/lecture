package sec01.exam01;

public class ExtendsExam {

	public static void main(String[] args) {
		// Child 생성 후,
		// printName 실행
		Child test = new Child();
		test.printName();
		
		// 이런 식으로 부모 클래스의 것을 실행 가능
		System.out.println(test.getName());
		
		test.setName("newName");
		System.out.println(test.getName());
		
	}
	
}
