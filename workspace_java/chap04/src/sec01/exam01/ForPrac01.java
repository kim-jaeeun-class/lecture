package sec01.exam01;

public class ForPrac01 {

    public static void main(String[] args) {

        // 2~10 중 짝수만 출력
        
    	System.out.println("2 ~ 10 중 짝수만 출력 - 01");

        int min = 2; // 시작 값
        int max = 10; // 종료 값

        for (int m = min; m <= max; m += 2) { // 시작 값부터 종료 값까지 2씩 더함.
            System.out.println(m);
        }
        
        /*
         * 위 코드에서 고민...
         * 시작값이 홀수면 홀수만 출력되는데,
         * 시작값이 홀이든 아니든 짝수만 출력되도록 할 방법도 있나.
         * 아마 if 쓰면 될 듯.
         * 아래에 한 번 써보기.
         */
        
        System.out.println("2 ~ 10 중 짝수만 출력 - 02");
        
        int min1 = 2; // 시작 값
        int max1 = 10; // 종료 값

        for (int m1 = min1; m1 <= max1; m1++) { // 위 코드와 달리 범위 내의 수를 다 확인하도록.
            if (m1 % 2 == 0) {	// 짝수일 때만 출력. else는 홀수라 출력할 필요 없으니 생략.
            	System.out.println(m1);
            }
        }

        // 10~1 출력
        
        System.out.println("10 ~ 1까지 역순으로 하나씩 출력");

        int s = 10; // 시작값
        int f = 1; // 종료값
        
        if (s >= f) {	// 역순 출력이 되려면 일단 시작값 >= 종료값이어야 하니까.
        	for (int b = s; b >= f; b--) {
            System.out.println(b);
        	}
        }
        else {
        	System.out.println("시작값은 종료값보다 작을 수 없습니다.");
        }

        // 10~1 출력, 홀짝 구분
        
//        System.out.println("10 ~ 1까지 역순으로 하나씩 출력. 홀짝 구분 표시도. - 01");
//
//        num = 10; // 시작 값
//        replay = 10; // 몇 번이나 뺄지
//
//        for (int i = 1; i <= replay; i++) { // 여기서 i를 빼기 반복 횟수로 잡음. 횟수 변경할 필요 없으면 그냥 10으로 고정. 
//            if (num % 2 == 0) { // 시작 값부터 출력돼야 하므로 if를 앞에 넣고,
//                System.out.println(num + "은 짝수입니다.");
//            } else {
//                System.out.println(num + "은 홀수입니다.");
//            }
//            num -= 1; // 대입 연산자는 뒤에 넣기.
//        }
//		  문제점 : '몇 번이나 뺄지'라고 하니까 마지막 값까지 가려면 무슨 값을 넣어야할지 헷갈린다. 생각해보기.
        
        System.out.println("10 ~ 1까지 역순으로 하나씩 출력. 홀짝 구분 표시도. - 02");
        
        int s1 = 10; // 시작값
        int f1 = 1; // 종료값
        
        if (s1 >= f1) {	// 역순 출력이 되려면 일단 시작값 >= 종료값이어야 하니까.
        	for (int a = s1; a >= f1; a--) { // a를 시작값으로 초기화. 종료값보다 작아지면 for문 종료.
            	if ((a % 2) == 0) {
            		System.out.println(a + "는 짝수입니다.");
            	}
            	else {
            		System.out.println(a + "는 홀수입니다.");
            	}
            }
        }
//       else {	// 아니면 종료되도록. println 안 쓰고 뭔가 나오게 만들... 수도 있나? 아래로 도전해보기.	
//        	System.out.println("시작값은 종료값보다 작을 수 없습니다.");
//       }
        else {	// else로 빠졌다 = 시작값이 종료값보다 작다. 위의 for문으로 하면 거의 바로 종료되지 않나? 뭐라도 나오도록.
        	for (int a = s; a <= f; a++) { // a를 시작값으로 초기화. 종료값보다 커지면 for문 종료. 근데 이건 역순이 아니라 순서대로 아닌가?
            	if ((a % 2) == 0) {
            		System.out.println(a + "는 짝수입니다.");
            	}
            	else {
            		System.out.println(a + "는 홀수입니다.");
            	}
            }
        }
        
        

        // 구구단 2단 출력
        System.out.println("구구단 2단만 출력");

        min = 2; // 단 수
        int mul = 9; // 단에 얼마까지 곱할지

        for (int i = 1; i <= mul; i++) { // 특정 단을 * (1 ~ 9). 9보다 더 높은 수까지 곱하기 가능.
            System.out.println(min + " X " + i + " = " + (min * i));
        }

        // 구구단 2~9단 출력
        
        System.out.println("2 ~ 9단 모두 출력");

        min = 2; // 시작 단 수
        max = 9; // 종료 단 수
        mul = 9; // 각 단에 얼마까지 곱할지

        for (int dan = min; dan <= max; dan++) { // 시작 단부터 끝 단까지 반복
            for (int i = 1; i <= mul; i++) { // 각 단에 * (1 ~ 9). 얼마까지 곱할지 변경 가능.
                System.out.println(dan + " X " + i + " = " + (dan * i));
            }
        }

        // 1~10을 3열로 출력
        
//        System.out.println("1 ~ 10을 3열로");
//		
//		for(int i = 1; i <= 10; i++) {
//			if (i <= 3) {
//				if ( i == 3 ) {
//					System.out.println(i);
//				}
//				else { 
//					System.out.print(i + " ");
//				}
//			}
//			else if ((4 <= i) && (i <= 6)) {
//				if ( i == 6 ) {
//					System.out.println(i);
//				}
//				else { 
//					System.out.print(i + " ");
//				}
//			}
//			else if ((7 <= i) && (i <= 9)) {
//				if ( i == 9 ) {
//					System.out.println(i);
//				}
//				else { 
//					System.out.print(i + " ");
//				}
//			}
//			else {
//				System.out.println(i);
//			}
//		}
//		문제점 : 1. 너무 길다... 2. 숫자를 바꿀 수 없다. 아래로 해결책 생각해보기.        
        
//        System.out.println("1 ~ 10을 3열로 출력 - 다른 수로 바꿔도 되도록 01");
//
//        int start = 1; // 시작 값
//        int finish = 10; // 종료 값
//        
//        for (int i = start; i <= finish; i++) { // 시작 값부터 끝 값까지 반복문으로 출력
//            System.out.print(i + " "); // 각 값 뒤에 띄어쓰기
//            if (i % 3 == 0 || i == finish) { // 3열째에서 줄바꿈, 혹은 종료값에서 줄바꿈 되도록.
//                System.out.println();
//            }
//        }
//		문제점 : 처음 코드보다는 나아진 것 같은데... 2나 5를 넣으면 첫 열이 2개가 되지 않나??? 이왕이면 열 개수도 변경 가능했으면 좋겠다. 다시 한 번 생각해보기.
        
        System.out.println("1 ~ 10을 3열로 출력 - 다른 수로 바꿔도 되도록 02");
        
                int start = 1; // 시작 값
                int finish = 10; // 종료 값
                int column = 3; // 열 개수
                
                for (int i = start; i <= finish; i++) { // 시작 값부터 끝 값까지 반복문으로 출력
                    System.out.print(i + " "); // 각 값 뒤에 띄어쓰기
                    if (((i - start) + 1) % column == 0 || i == finish) { // 처음은 i = 시작값이니 (i-start)+1로 뭔 수가 시작값이든 그 수가 첫 번째 위치라고 표시. +1 안 하면 0을 나누는 거라 나머지가 없어서 시작부터 줄바꿈 된다.
                        System.out.println();
                    }
                }

        // Q. 1~100(n)까지 홀수 개수
        
        System.out.println("1부터 100까지 홀수의 개수");
        int first = 1; // 시작값
        int last = 100; // 종료값
        int count = 0; // 개수를 세기 위한 변수
        
        for(int a = first; a <= last; a++) {
        	if (a % 2 != 0) {	// a가 만약 홀수라면,
        		count++;	// count(개수)에 1을 더하기. else 굳이 쓸 필요 없어서 생략.
        	}
        }
        System.out.println("1부터 100까지 홀수의 개수는 총 " + count + "개");
        

        // 구구단 각 단당 한 행씩 출력
       
        System.out.println("2 ~ 9단 : 옆으로 출력");

        min = 2; // 시작 단
        max = 9; // 끝 단
        mul = 9; // 각 단을 얼마까지 곱할지

        for (int dan = min; dan <= max; dan++) { // 시작 단부터 끝 단까지 반복
            for (int i = 1; i <= mul; i++) { // 각 단을 * (1 ~ 9)하는 부분
                System.out.print(dan + " X " + i + " = " + (dan * i));
                if (i != mul) {		// 각 단을 mul까지 곱하기 전까지는 쉼표 출력하도록 해서 구분하기
                    System.out.print(", ");
                }
            }
            System.out.println();
        }
    }
}
