package sec06.exam02.pack03;

import sec06.exam02.pack01.Access01;
import sec06.exam02.pack02.Access02;

public class AccessExam {
	
	public static void main(String[] args) {
		
//		Access01 a1 = new Access01(); public이 아닌 default라서 생성 불가
		
		Access02 a2 = new Access02();	// public 접근 제한자이므로 import 후 사용 가능
//		a2.test1();	// public이 없어 실행 불가
		a2.test2();	// public이 있어 실행 가능
	}
}
