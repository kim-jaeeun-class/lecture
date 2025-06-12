package sec00.prac01.quiz;

public class Student {
	// 필드
	// 학생 클래스를 만들고 이름과 나이 필드를 만듦
	// 두 학생의 정보를 Exam 클래스에 만든 후
	// 두 학생을 각각 등록하고 두 학생의 정보를 각각 출력
	
	// 메소드
	// 메소드를 통해 이름과 나이를 전달해 저장
	// 이름과 나이를 돌려받아 출력
	
	String name;
	int age;
	
//	void info(String a, int b) {
//		name = a;
//		age = b;
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age);
//	}
	
	void getInfo (String a, int b) {
		name = a;
		age = b;
	}
	
	
	String[] showInfo () {	// return을 꼭 써야 한다면...?
//		String info = name + ", " + age; // 역시 안 됨... (처음 했던 것)
//		return info;
//		return name + ", " + age; // 안 되는데... (수업 중 나온 코드 1)
		String[] a = {name, ""+age}; // 이것도 안 되는데... (수업 중 나온 코드 2)
		return a;
		
//		System.out.println("이름 : " + name);
//		System.out.println("나이 : " + age); // 일단 Syso 되나 확인... 이건 되는데?
	}
	
	
	
	
	
}
