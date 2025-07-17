package sec01.exam03.override;

public class Computer extends Calc {
	// Calc에서 복사
	@Override	// 부모에 해당 메소드가 선언됐는지 검사
				// 없으면 빨간 줄 표시로 확인 가능
				// private 사용 시 오류 발생
	public double areaCircle(double r) {
		System.out.println("Computer 객체의 areaCircle 실행");
		return Math.PI * r * r;
	}
	@Override
	public int plus(int x, int y) {
		int result = super.plus(x, y);
		System.out.println("Computer의 plus 실행");
		System.out.println("정답은 " + result + "입니다");
		return result;
	}
}
