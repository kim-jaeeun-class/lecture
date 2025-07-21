package quiz02.class1;

public class Person1Controller extends Student {
	Person1Controller() {
		super("Person's Name");	// 전달받기 생략된 하드 코딩
	}
	
	Person1Service person1Service = new Person1Service();
	
	@Override
	String answer(String q) {
		String result = person1Service.getInfo(q);
		return result;
	}
}
