package sec00.prac01.quiz;


public class StudentExam {

	public static void main(String[] args) {
		
		Student st = new Student();
		Student st1 = new Student();
		
		
//		st.info("이름1", 20);
//		st.info("이름2", 30);
		
		// 필드 문제 괜히 꼬아 읽었다... 이렇게만 해도 된다.
		
		st.name = "이름1";
		st.age = (int) 20;
		
		System.out.println(st.name);
		System.out.println(st.age);
		
		st1.name = "이름2";
		st1.age = (int) 30;
		
		System.out.println(st1.name);
		System.out.println(st1.age);


		
//		// 이름, 나이 입력?
//		st.getInfo("이름3", 20);
//		st1.getInfo("이름4", 30);
//		
//		// 이름, 나이 출력
		System.out.println(st.showInfo()[0]);
		System.out.println(st.showInfo()[1]);
		System.out.println(st1.showInfo()[0]);
		System.out.println(st1.showInfo()[1]);

		
	}

}
