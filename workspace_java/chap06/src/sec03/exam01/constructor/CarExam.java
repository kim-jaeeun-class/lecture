package sec03.exam01.constructor;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		new Car(); // 변수에 담지 않아도 생성자가 실행됨
		Car c = new Car(); // Car 파일의 기본 생성자 삭제 시 오류 발생
		Car c2 = new Car("검정");
		
		Scanner s = new Scanner(System.in);
		
		s.close();
	}

}
