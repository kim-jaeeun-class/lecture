package chap08.sec01.exam01;

// new 불가(추상 클래스를 특화시킨 것이라 특징도 비슷)
public interface RemoteControl {
	public int MAX_VOLUME = 10;
	public int MIN_VOLUME = 0;
	/*
	 * 위 코드의 원래 형태는 아래와 같음
	 * 위는 static final이 생략된 것
	 * 모든 필드가 public static final이어서 생략 가능
	 * public static final int MAX_VOLUME = 10;
	 * public static final int MIN_VOLUME = 0;
	 */
	
	public abstract void turnOn();
	// 기본적으로 메소드는 abstract 메소드라
	// abstract 생략 가능
	public void turnOff();
	public void setVolume(int vol);
	
	// abstract 메소드가 아닌 일반 메소드 생성 가능
	default void mic(String txt) {
		
	}
}
