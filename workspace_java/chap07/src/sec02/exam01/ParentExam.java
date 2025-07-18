package sec02.exam01;

public class ParentExam {

	public static void main(String[] args) {
		Parent1_1_1 p1_1_1 = new Parent1_1_1();
		Parent1_1 p1_1 = (Parent1_1)p1_1_1;
		p1_1 = p1_1_1;
		
		Parent1 p1 = p1_1;
		p1 = p1_1_1;
		
		// 위 코드 5줄을 아래로 줄여 쓸 수 있음
		Parent1 pp1 = new Parent1_1_1();
		
		/////////////////////////////////////
		
		Parent1_2 p1_2 = new Parent1_2();
		Parent1 ppp1 = p1_2;
		// 아래도 가능
//		pp1 = p1_2;
		
		// 부모가 자식이 될 때는
		// 클래스 형 변환 생략 불가(생략 시 오류)
		Parent1_2 pp1_2 = (Parent1_2)ppp1;
		// 런타임 오류 : 실행해봐야 알 수 있음
		Parent1_2 ppp1_2 = (Parent1_2)pp1;
	}

}
