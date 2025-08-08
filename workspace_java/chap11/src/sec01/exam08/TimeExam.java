package sec01.exam08;

import java.text.SimpleDateFormat;
import java.util.Date;

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
		
		
		
		Date date = new Date();
		System.out.println(date);
		
		// 양식 지정
		String format = "yyyy년 MM월 dd일 HH:mm:ss.SSS";
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		String strDate = sdf.format(date);
		System.out.println(strDate);
	}
}
