package sec01.exam01;

public class StudentExam {

	public static void main(String[] args) {
		new Student(); // 이를 통해 힙 영역에 올라가나, 
					   // 변수를 저장하지 않아 가비지 콜렉터로 감.
		
		Student s1 = new Student(); // 이렇게 변수를 저장해줘야 함.
		Student s2 = new Student();
		
		System.out.println(s1==s2); // Student는 기본 타입이 아니므로 참조 타입
									// false로 결과 출력
		
		Student s3 = null;	// 같은 이유로 s3에 null값 넣기 가능
		
		s3 = s1;	// s1과 s3가 같은 주소를 가리키게 됨
		System.out.println(s1 == s3);	// 고로 true 출력
		
		s1 = null;	// s1의 연결을 끊음
		s3 = null;	// s3의 연결을 끊음. 이때 가비지 콜렉터 작동.
		
		System.out.println(s1 == s3);	// 둘 다 null이라 상태가 같아 true로 출력
		
		System.out.println(s2);	// 출력은 되긴 함
		
	}

}
