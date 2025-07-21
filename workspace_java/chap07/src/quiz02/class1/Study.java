package quiz02.class1;

public class Study {
	// Driver, Arbeit와 비슷한 개념
	void getAnswer(Student student, String q) {
		System.out.println(q + "에 대해");
		System.out.println(student.name +"에게 질문");
		System.out.println(student.name + "의 대답 : " + student.answer(q));
	}
}
