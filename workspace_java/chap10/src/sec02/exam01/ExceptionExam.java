package sec02.exam01;

public class ExceptionExam {

	public static void main(String[] args) {
		System.out.println("test");
		for(int i = 0; i < args.length; i++) {
			System.out.println(i + ": " + args[i]);
		}
		
		int a = -1;
		
		// 위에서 array~~~ 오류가 나서 중단됨
		// ...을 해결하기 위한 try~catch~finally(finally는 안 써도 됨)
		try {
			String name = "name";
			// 아래 Integer. 작동이 안 돼서 최종적으로 초기 a값인 -1로 나옴
			a = Integer.parseInt(name);
			
			System.out.println(args[100]);
			System.out.println("try 위치");
		}
//		catch(Exception e) {
//			이 부분을 먼저 쓸 경우, 어차피 닿지 않기 때문에 오류 발생(unreachable catch block~)
//		}
		//catch(Exception e) {
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("ArrayIndexOutOfBoundsException 오류 위치");
			e.printStackTrace(); // 오류 내용 출력해줌
			System.out.println("e만 출력");
			System.out.println(e);
		}
		catch(NumberFormatException e) {
			System.out.println("NumberFormatException 오류 위치");
			e.printStackTrace();
			System.out.println("e만 출력");
			System.out.println(e);
		}
		finally {
			System.out.println("finally 테스트용");
		}
		System.out.println("try~catch 바깥 위치");
		System.out.println("a:" + a);
		
		
	}
	
	void test() {
		try {
			// 코딩
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}
