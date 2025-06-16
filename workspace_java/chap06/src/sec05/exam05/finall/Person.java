package sec05.exam05.finall;

public class Person {
	final String nation = "Korea";
	final String ssn;	// 생성자 없을 시, 오류 발생. 초기화하지 않았기 때문.
	String name;		// 이쪽도 초기화 진행하지 않음.
	
	Person () {
		this.ssn = "주민번호";
		this.name = "이름";
//		this.nation = "기타국가명";	// 위에서 이미 초기화 진행해서 다른 값 할당 불가
		
		this.name = "이름2";
//		this.ssn = "주민번호2"; // 처음 필드 선언에서 final로 설정했기 때문에, 위에서 초기화된 순간 다른 값 할당 불가.
	}
	
//	void test() {	// 메소드에 넣어도 불가
//		this.ssn = "주민번호";
//	}
}
