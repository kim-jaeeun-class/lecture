package sec01.exam08;

public class TimeExam {
	public static void main(String[] args) {
		long before = System.currentTimeMillis();
		
		for(int i = 0; i < 10000000; i++) {
		}
		
		long after = System.currentTimeMillis();
		System.out.println("before: " + before);
		System.out.println("after: " + after);
		System.out.println("after - before: " + (after - before));
		System.out.println(Long.MAX_VALUE);
	}
}
