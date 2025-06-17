package sec01.exam01;

public class ArrayExam {

	public static void main(String[] args) {
		int[] a;
		
//		a = null; // 배열 = 참조변수여서 null 상태 가능.
		
//		int score_0 = 90;
//		int score_1 = 80;
//		int score_2 = 75; // 일일이 변수 선언 시 관리가 어려움.
		
		int[] score = new int[3];
		score[0] = 90;
		score[1] = 80;
		score[2] = 75; // 배열 사용 시 이렇게 선언 가능.
		
//		System.out.println(score); 이렇게 쓰면 이상하게 출력
		
		System.out.println("score[" + 1 + "] : " + score[1]); // 이렇게 출력하기.
		
		for(int i = 0; i <= 2; i++) {
			System.out.println("score[" + i + "] : " + score[i]); // 배열의 전부를 보고 싶으면 이렇게
		}
		
		a = new int[30];
		
		System.out.println("a[1] : " + a[1]);
		
//		System.out.println("a[50] : " + a[50]); 에러 코드. 원래 크기보다 더 크게 함.
		
		String[] str = new String[3];
		System.out.println("str[0] : " + str[0]);
		
		int[] i1 = new int[] {1, 2, 3, 4, 5};
		System.out.println(i1[0]);
		
		int[] scores = {83, 90, 87};
		int num = scores.length; // 배열 길이를 구하는 방법
		
		int sum = 0;
		for (int i = 0; i < num; i++) {
			sum += scores[i];
		}
		
		double avg = (double) (sum / num);
		System.out.println("avg : " + avg);
		
		int b0 = 5;
		int b1 = 6;
		int b2 = 7;
		
		int[] bs0 = new int[3];
		bs0[0] = b0;
		bs0[1] = b1;
		bs0[2] = b2;
		
		int[] bs1 = new int[3];
		bs1[0] = b0 + 100;
		bs1[1] = b1 + 100;
		bs1[2] = b2 + 100;
		
		int[][] bs = new int[2][3];
		bs[0] = bs0; // 이것과 아래 코드를 통해서
		bs[1] = bs1; // 1행에는 bs0 배열의 값, 2행에는 bs1 배열의 값 출력.
		
		System.out.println(bs.length); // 행 값 출력
		
		System.out.println("2차원 배열 시험 출력 : " + bs[0][1]);
		
		// 반복문을 사용해 1~10까지 저장 후, 다른 반복문에서 출력.
		
		System.out.print("Q1. ");
		
		int numLength = 10; // 길이는 여기에서 바꾸기. 50이나 100까지 저장도 가능.
		int[] numArray = new int[numLength]; // numLength 길이 만큼의 배열 선언.
		
		for (int i = 0; i < numLength; i++) { // 배열에 데이터 넣기.
			numArray[i] = i+1; // i-1을 하지 않으면 시작점(0)값 입력이 안 됨.
		}
		
		for (int i = 0; i < numLength; i++) {
			System.out.print(numArray[i] + " ");
		}
		System.out.println();
		
		
		int[] d1 = {1, 2, 3, 4, 5};
		int[] d2 = d1; // 
		int[] d3 = {1, 2, 3, 4, 5};
		
		System.out.println("d2 == d1 : " + (d2 == d1)); // true
		System.out.println("d3 == d1 : " + (d3 == d1)); // false : 값이 같지만 다른 주소에 들어감
		
		d2[1] = 10;
		System.out.println("d1[1] : " + d1[1]); // 주소가 같으므로 d1까지 바뀜
		
		
		int[] f = {85, 98, 47, 29, 13};	
		for(int i =0; i < f.length; i++) {
			System.out.println(f[i]);
		}
		int[] f2 = new int[f.length];
		
		for (int i = 0; i < f.length; i++) {
			f2[i] = f[i];
		}
		
		for (int i = 0; i < f.length; i++) {
			System.out.println("f2[" + i + "] : " + f2[i]);
		}
		
		for(int i = 0; i < f.length; i++) {
			int data = f[i];
			System.out.println("data1 : " + data);
		}
		for(int data : f) { // 위 코드를 향상된 for문으로 출력
			System.out.println("data2 : " + data);
		}
	}

}
