package sec01.exam01;

public class RefExam {

	public static void main(String[] args) {
		
		int a = 10;
		int b = 10;
		System.out.println(a + ", " + b);
		
		b = 12;
		System.out.println(a + ", " + b);
		
		String c = "김재은";
		// = 기준으로 오른쪽이 우선 실행.
		// 이 시점에서 힙 영역에 비어있는 번지에 할당함. (주소에 데이터 삽입)
		// 이후 스택 영역의 변수 c에 번지(주소값) 저장.
		System.out.println("c : " + c);
		
		String d = new String("김재은");
		// 이 경우 똑같은 데이터지만, 새로운 번지(주소)에 들어감.
		
		System.out.println( c == d ); // 위와 같은 이유로 false 출력.
		System.out.println( c.equals(d) ); // 이게 제대로 된 데이터 값 비교.
		
		String e = d;
		System.out.println( e == d ); // 고로 여기는 true. (새 번지로 들어간 게 아님)
		
		String f0 = "김재은";
		System.out.println("c == f0 : " + ( c == f0 )); // true. 원래는 각자 다른 객체라 false지만 "" 형태라 예외.
		String f = "김" + "재은";
		System.out.println("c == f : " + ( c == f )); // true. 만약 = 옆에 new String(""); 형이면 객체 별도 생성.
		
//		a = null; 기본 타입에 null 삽입 불가.
		
		String g = "휴먼";
		System.out.println("g == null : " + ( g == null ));
		System.out.println("g != null : " + ( g != null ));
		
		String h = "";
		System.out.println( "h != null : " + ( h != null ));
		
		g = null;
		System.out.println("g == null : " + ( g == null )); // null이 된 순간 가비지 콜렉터에 의해 제거
		System.out.println("g + \"abc\" : " + ( g + "abc" ));
		
		System.out.println( h.equals(g)); // false
//		System.out.println( g.equals(h)); // 오류. g는 null 상태라 g가 가지고 있는 것이 없어 비교 불가.
	}

}
