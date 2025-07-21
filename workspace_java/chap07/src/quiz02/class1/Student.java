package quiz02.class1;

public class Student {
	// 메소드 : 대답 O / 대답 X / 회식 참석 / 취업 희망 / 공부 / ai 사용
	// 필드 : 이름 / 기억 공간
	/*
	 * StudyExam	new Study(new Person1)
	 * Tomcat 서버?
	 * Study
	 * Student
	 * 아래 셋은 실제 웹 페이지 : Student 클래스를 상속받으면 돌아갈 수 있게 됨
	 * - 지시
	 * Person1Controller extends Student
	 * - 실제 업무 진행
	 * class Person1Service
	 * - DB 전용
	 * class Person1DAO
	 */
	
	String name;
	
	// 생성자
	Student(String name) {
		this.name = name;
	}
	
	String answer(String q) {
		return null;
	}
}
