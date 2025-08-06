package chap08.sec01.exam01;

public class RemoteControlExam {

	public static void main(String[] args) {
		Tv tv = new Tv();
		tv.setVolume(32);
		// 값 설정을 안 해서 범위를 넘는 값을 setVolume()에 두면 기본값 0으로 보여줌
		System.out.println(tv.volume);
		
		// new RemoteControl(); 불가!!
		
		// 상속과 같은 형 변환 규칙
		RemoteControl rc1 = (RemoteControl)tv;
		RemoteControl rc2 = tv;
		
		// 아래의 void powerOn에 static을 적지 않으면 실행 불가
		powerOn(tv);
	}
	
	static void powerOn(RemoteControl rc) {
		rc.turnOn();
	}

}
