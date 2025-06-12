package sec00.prac02.quiz;

import java.util.Scanner;

public class DictExam {

	public static void main(String[] args) {
		Dict dict = new Dict();
		
		/* Scanner 사용 */
		
		System.out.println("Scanner 사용 영한/한영 사전");
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("검색하고 싶은 영단어를 입력해주세요.");
		String w1 = sc.nextLine();
		
		if(dict.en2ko(w1).equals("")) {
			System.out.println("사전에 등재되지 않은 단어를 입력하셨습니다.");
		}
		else {
			System.out.println(dict.en2ko(w1));
		}
		
		System.out.println("검색하고 싶은 한국어 단어를 입력해주세요.");
		String w2 = sc.nextLine();
		
		if(dict.ko2en(w2).equals("")) {
			System.out.println("사전에 등재되지 않은 단어를 입력하셨습니다.");
		}
		else {
			System.out.println(dict.ko2en(w2));
		}
		System.out.println();
		
		sc.close();
		
	}

}
