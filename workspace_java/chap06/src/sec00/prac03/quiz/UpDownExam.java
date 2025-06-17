package sec00.prac03.quiz;

import java.util.Scanner;

public class UpDownExam {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		UpDown g = new UpDown();

		boolean result = true;


		while(result) {
			System.out.println("원하는 값을 입력해주세요.");
			int answer = sc.nextInt();
			int a = g.play(answer);
			
			if (a == 0) {
				System.out.println("정답");
				result = false;
			}
			else if (a == -1) {
				System.out.println("UP!");
			}
			else if (a == 1) {
				System.out.println("DOWN!");
			}
			else {
				System.out.println("WRONG NUMBER!");
			}
		}
		
		sc.close();
	}

}
