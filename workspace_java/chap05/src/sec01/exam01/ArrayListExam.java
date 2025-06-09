package sec01.exam01;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListExam {

	public static void main(String[] args) {
		
		// 1호
		
		String[] menu = new String[2];
		menu[0] = "1";
		menu[1] = "2";
		
		// 2호
		String[] menu2 = menu;
		
		// 2호 쪽에만 새 menu 값을 추가하고 싶을 때?
		
		menu2 = new String[3];
		menu2[0] = "1";
		menu2[1] = "2";
		menu2[2] = "3";
		
		// 문제점. 복잡함! 귀찮음!
		// 해결안. ArrayList
		
		ArrayList list = new ArrayList();
		
		list.add(1);
		list.add("문자");
		list.add(true);
		
		System.out.println(list.get(0));
		
		System.out.println(list.size());
		
		System.out.println(list);
		
		
		ArrayList<String> list2 = new ArrayList();
		
		list2.add("1");
		list2.add("2");
		
		for(String data : list2) {
			System.out.print(data);
		}
		
	}

}
