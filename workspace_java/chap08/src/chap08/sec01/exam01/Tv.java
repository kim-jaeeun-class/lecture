package chap08.sec01.exam01;

// 상속 받기 가능(implements, extends 동시 사용 가능)
// 인터페이스는 여러 개를 상속받을 수 있음
public class Tv extends Display implements RemoteControl, OTT {
	
	int volume;
	
	@Override
	public void turnOn() {
		// TODO Auto-generated method stub
		System.out.println("TV를 켭니다");
	}

	@Override
	public void turnOff() {
		// TODO Auto-generated method stub
		System.out.println("TV를 끕니다");
	}

	@Override
	public void setVolume(int volume) {
		// TODO Auto-generated method stub
		if(volume > RemoteControl.MAX_VOLUME) {
			System.out.println(RemoteControl.MAX_VOLUME + "이하만 설정 가능합니다.");
			this.volume = RemoteControl.MAX_VOLUME;
			// volume = RemoteControl.MAX_VOLUME; 이렇게도 가능
		}
		else if(volume < RemoteControl.MIN_VOLUME) {
			System.out.println(RemoteControl.MIN_VOLUME + "이상만 설정 가능합니다.");
			this.volume = RemoteControl.MIN_VOLUME;
			// volume = RemoteControl.MIN_VOLUME; 이렇게도 가능
		}
		else {
			this.volume = volume;
		}
		
		/*
		 * 혹은 이렇게도 가능 (상단 주석부 응용) : if 내 실행문이 한 줄이면 {} 생략이 가능하므로
		 * if(volume > RemoteControl.MAX_VOLUME) volume = RemoteControl.MAX_VOLUME;
		 * else if(volume < RemoteControl.MIN_VOLUME) volume = RemoteControl.MIN_VOLUME;
		 */
	}

	@Override
	public void netflix() {
		System.out.println("넷플릭스 시청");
	}

	@Override
	public void mic(String txt) {
		// TODO Auto-generated method stub
		
	}

}
