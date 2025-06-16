package sec06.exam02.pack03;

//import sec06.exam02.pack02.Human;

import sec06.exam02.pack01.*;

public class HumanExam {
	public static void main(String[] args) {
//		 new Human();	// pack02에 있는 Human으로 import
//		 new sec06.exam02.pack01.Human();	// pack01의 것을 가져오고 싶으면 패키지 정보 붙이는 식으로
//		 
////		 Human h1 = new sec06.exam02.pack01.Human(); // 다른 객체이므로 불가!
//		 sec06.exam02.pack01.Human h1 = new sec06.exam02.pack01.Human(); // 사용하려면 이렇게
		
		new Human();	// 오류 X
//		new Sub1();		// 오류 발생. 하위 패키지의 클래스이므로.
		
		// java.lang.*는 자동 import
		String a = "1";
		System.out.println();
		Math.random();
	}
}
