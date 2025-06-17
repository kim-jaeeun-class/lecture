package sec01.exam01;

public class BreakConExam {

	public static void main(String[] args) {
		int count = 0;
		while (true) {
			int num = (int) (Math.random() * 6) + 1;
			System.out.println(num);
			if (num == 6) {
				break;
			}
			count++;
		}
		System.out.println("프로그램 종료");
		System.out.println(count);

		for(int i = 1; i < 10;  i++) {
			System.out.println(i);
			if (i >= 5) {
				break;
			}
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("i : " + i);
			for (int j = 0; j < 20 ; j++) {
				System.out.println("j : " + j);
				if (j > 2) {
					System.out.println("break");
					break;
				}
			}
		}
		
		for (int i = 1; i <= 5; i++) { // 5명이 순서대로 주사위 게임
			for (int j = 1; j <= 3; j++) { // 1명당 주사위를 세 번씩 던짐
				int num2 = (int) (Math.random() * 6) + 1;
				System.out.println("주사위 : " + num2);
				
				if (num2 == 6) { // '주사위값 = 6'일 시 게임 종료 후 다음 사람에게 넘어감.
					break;
				}
			}
		}
		
		// 위 코드 + 1명이라도 6이면 전체 게임 종료
		
		boolean isStop = false;
		
		for (int i = 1; i <= 5; i++) { // 5명이 순서대로 주사위 게임
			for (int j = 1; j <= 3; j++) { // 1명당 주사위를 세 번씩 던짐
				int num2 = (int) (Math.random() * 6) + 1;
				System.out.println(i + "주사위 : " + num2);
				
				if (num2 == 6) { // '주사위값 = 6'일 시 게임 종료 후 다음 사람에게 넘어감.
					isStop = true;
					break; // for 내부의 if에서 break 시 for문까지 종료되는 특성 기억.
				}
			}
			if (isStop) { // 바깥에서 선언된 변수라 확인 가능.
				break;
			}
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 == 0) { // 짝수일 때만 출력
				System.out.println(i);
			}
		}
		
		for (int i = 1; i <= 10; i++) {
			if (i % 2 != 0) { // 홀수일 때 건너뛰기
				continue;
			}
			System.out.println(i);
		}
	
	}

}
