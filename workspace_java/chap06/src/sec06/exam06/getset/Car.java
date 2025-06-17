package sec06.exam06.getset;

public class Car {
	
	// 필드 : 현재 private로 지정. 직접 읽고 쓰기를 방지.
	
	private int speed;
	private boolean stop;
	
	public int test() {
		return this.speed;
	}
	
	private String color;
	private double gas;
	
	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	// 자동완성 : 오른쪽 마우스 - source - generate getter/setter
	public double getGas() {
		return gas;
	}

	public void setGas(double gas) {
		this.gas = gas;
	}

	// getter
	public int getSpeed() {
		return this.speed;
	}
	
	// boolean의 is(getter과 동일한 역할)
	
	public boolean isStop() {
		return this.stop;
	}
	
	// setter
	void setSpeed(int speed) {
		if (speed >= 0) {	// 입력값의 범위를 제한하는 방식.
			this.speed = speed;
		}
	}
}
