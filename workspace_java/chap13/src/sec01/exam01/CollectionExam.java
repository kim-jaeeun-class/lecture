package sec01.exam01;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CollectionExam {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Object> list = new ArrayList<Object>();
		System.out.println(list.isEmpty());
		
		// 추가
		list.add(123);
		list.add("좀 졸림");
		
		// 삽입
		// 중간 삽입
		list.add(1, "삽입");
		System.out.println(list);
		
		// 검색
		System.out.println(list.get(2));
		String a = (String) list.get(1);
		String b = list.get(1).toString();
		
		list.remove(1);
		System.out.println(list);
		
		list.clear();
		System.out.println(list);
		System.out.println(list.size());
		System.out.println(list.isEmpty());
		list = new ArrayList<Object>();
		
		System.out.println("-----------------------------------------");
		
		Map<String, Object> map = new HashMap<String, Object>();
		
		// 추가
		map.put("k1", "v1");
		map.put("list", list);
		map.put("k1", "v2");
		
		// 가져오기
		String k1 = (String)map.get("k1");
		List list2 = (List)map.get("list");
		System.out.println(map);
		
		System.out.println("-----------------------------------------");
		
		// list, map 초기화
		list = new ArrayList<Object>();
		map = new HashMap<String, Object>();
		map.put("제목", "golden");
		map.put("가수", "헌트릭스");
		list.add(map);
		System.out.println(list);
		
		map = new HashMap<String, Object>();	// 이걸 안 써주면 얕은 복사 이슈 발생
		map.put("제목", "나는 반딧불");
		map.put("가수", "황가람");
		list.add(map);
		System.out.println(list);
		
		// 제네릭 : <String, Integer>
		// 전달인자, 리턴 타입의 자료형을 동적으로 변경
		List<String> list3 = new ArrayList<String>();
		list3.add("string");
		String s = list3.get(0);
		
		// 제네릭에는 원시 타입 사용 불가. wrapper 클래스 사용(대문자로 시작하는 것)
		Map<String, Integer> map2 = new HashMap<>();
		map2.put("str", 123);
		int c = map2.get("str");
		
		
	}

}
