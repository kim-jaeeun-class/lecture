package sec00.prac03.quiz;

import java.util.Scanner;

public class UpDown {
	// 필드
	
	int answer = (int) (Math.random() * 51);
	
	int getNumber(int start, int end) {	// 시작/끝 값 나중에 지정 가능
		int result = Integer.MIN_VALUE;
		if (end > start) {
			result = (int) (Math.random() * (end - start + 1));
			return result;
		}
		else {
			System.out.println("WRONG NUMBER!");
		}
		return result;
	}

	
	// 메소드1
	
	int play(int a) {
		
		if (a < 0 || a > 50) {
			return 100;	// 여긴 정상출력 되는데
		}
		else if ( a == answer ) {	// else로 빼서 안에 if를 넣든... 그냥 이렇게 else if 하든... 0만 나옴
				return 0;
		}
		else if ( a > answer ) {
				return 1;
		}
		else {
			return -1;
		}
	}
	
	
	// 메소드2. 메소드명 start / 전달인자 : int start, int end / 리턴 타입 : void
	// 대강 구조는 써놨으니까 나중에 추가 수정하기
	// count 넣어서 시도 수 띄우고 그걸로 조건 거는 법도
	
	void start (int start, int end) {
	    Scanner s = new Scanner(System.in);
	    
	    int menu = -1;
	    
	    do {
	        System.out.println("1. 게임 시작 || 0. 게임 종료");
	        menu = s.nextInt();
	        
	        if (menu != 1 && menu != 0) {
	            continue;
	        } else {
	            switch(menu) {
	            case 1:
	                int answer = getNumber(start, end);
	                boolean ok = false;

	                while (!ok) {
	                    System.out.printf("%d ~ %d 중의 값 하나를 골라주세요", start, end);
	                    int num = s.nextInt();

	                    if (answer == num) {
	                        System.out.println("정답!");
	                        ok = true;
	                    } else if (answer > num) {
	                        System.out.println("UP!");
	                    } else {
	                        System.out.println("DOWN");
	                    }
	                }
	                break; // case 1 끝에 break 필요!
	            
	            case 0:
	                break; // case 0도 명시적으로 끝내주기
	            }
	        }
	    } while (true); // 세미콜론 필수!
	}

	
}
