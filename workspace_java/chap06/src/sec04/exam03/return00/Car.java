package sec04.exam03.return00;

public class Car {
	
	int gas;
	
	void setGas(int g) {	// gas값 변경
		gas = g;
	}

	
	// 남은 gas의 유무를 출력하는 메소드
	// gas = 0이면 false, gas != 0이면 true
	
	boolean isLeftGas() {
		if (gas == 0) {	
			System.out.println("gas가 없습니다.");
			return false;	// return 하는 순간 메소드 종료
		}
//		else {	// else가 있으면 무조건 하나는 실행 보장
//			System.out.println("gas가 있습니다.");
//			return true;
//		}
		System.out.println("gas가 있습니다."); // else로 써도 되나, 굳이 꼭 쓸 필요 없음.
		return true;
	}
	
	boolean isLeftGas2() {	// 이렇게도 가능(return을 한 번만 하는 방식)
		boolean result = false;
		
		if (gas == 0) {
			System.out.println("gas가 없습니다.");
			result = false;
		}
		else {
			System.out.println("gas가 있습니다.");
			result = true;
		}
		return result; 
	}
	
	boolean isLeftGas3() {
//		boolean result2 = gas != 0;
//		return result2;
		return gas != 0; // 위 두 줄을 이렇게 줄일 수 있음.
	}
	
	void run() {
		while(true) {
			if (gas > 0) {
				System.out.println("달립니다! 잔량 : " + gas);
				gas--;
			}
			else {
				System.out.println("멈춰! 잔량 : " + gas);
				return;
			}
		}
	}
}
