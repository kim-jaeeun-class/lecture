package sec01.exam08;

public class StringExam {

	public static void main(String[] args) {

		String s1 = "영일이삼사오육칠팔구삼사";
		char c = 'a';
		c = s1.charAt(0);
		System.out.println(c);
		
		int i1 = s1.indexOf("삼사");
		System.out.println(i1);
		int i2 = s1.lastIndexOf("삼사");
		System.out.println(i2);
		int i3 = s1.indexOf("a");
		System.out.println(i3);
		
		// email 양식 점검
		// @와 .이 하나 이상 있는지 확인
		String emailString = "gudok.you@gmail.com";
		int email1 = emailString.indexOf(".");
		int email2 = emailString.indexOf("@");
		
		if((email1 != -1) && (email2 != -1)) {
			System.out.println("알맞은 이메일 형식입니다.");
		}
		else {
			System.out.println("이메일 형식에 맞춰 작성해주세요.");
		}
		
		int index = -1;
		
		// indexOf 구현
		for(int i = 0; i < emailString.length(); i++) {
			char value = emailString.charAt(i);
			if(value == '@') {
				index = i;
				break;
			}
		}
		
		System.out.println("index : " + index);
		
		// replace
		String s2 = s1.replace("삼사", "34");
		System.out.println("s1: " + s1 + "\ns2: " + s2);
		
		// substring
		String s3 = s1.substring(5, 8);
		System.out.println("s3 : " + s3);
		
		String ssn = "123456-1890123";
		String subTest = ssn.substring(7, 8);
		
		System.out.println("주민번호 substring 문제");
		if(subTest.equals("1") || subTest.equals("3")) {
			System.out.println("남자");
		}
		else if(subTest.equals("2") || subTest.equals("4")) {
			System.out.println("여자");
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
		// indexOf를 쓴다면?
		int start = ssn.indexOf("-") + 1;
		int end = start + 1;
		String subTest2 = ssn.substring(start, end);
		if(subTest2.equals("1") || subTest2.equals("3")) {
			System.out.println("남자");
		}
		else if(subTest2.equals("2") || subTest2.equals("4")) {
			System.out.println("여자");
		}
		else {
			System.out.println("잘못된 입력값입니다.");
		}
		
		
		// 문제1 : blog.naver.co.kr에서 naver만 추출하기
		// 문제2 : "Hello world" -> "ello world H" -> "llo world He"
		// 문제3 : 마스킹. humanec@naver.com -> hu*****@naver.com
		// 문제4 : 주소로 검색어 찾기. query의 값이 검색어라는 점을 염두에 두기.
		//		  https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=1234&ackey=1oiioasi
		
		// 문제1 : .으로만도 될 수 있도록. 
		String q1 = "blog.naver.co.kr";
		
//		int findCoKr = q1.indexOf("co.kr") - 1;
		int dotFirst = q1.indexOf(".") + 1;
		// 첫 번째 점 다음의 점 위치 찾기
		int dotSecond = (q1.substring(dotFirst)).indexOf(".");
		
		String answer1 = q1.substring(dotFirst, (dotFirst + dotSecond));
		System.out.println(answer1);
		
		// 문제2
		String q2 = "Hello world ";
		// 앞은 substring으로 빼버리고... 뒤는 그걸 붙여버리는 식으로 가고 싶은데.
		for(int i = 0; i < q2.length(); i++) {
			if(i == 0) {
				System.out.println(q2);
			}
			else {
				String front = q2.substring(0, i);
				String back = q2.substring(i);
				System.out.println(back + front);
			}
		}
				
		// 문제3 : 수정 여지 있음!
		String q3 = "hunaver@naver.com";
		int idCheck = q3.indexOf("@");
		String check = q3.substring(2, idCheck);
		int checkLen = check.length();
		
		System.out.println(checkLen);
		
//		// 아래의 finalTest는 한 글자로만 바뀌는 문제점이 있음
//		String finalTest = q3.replace(check, "*");
		
		// 3번째부터 @ 직전까지만큼 * 만들기
		String masking = "";
		for(int i = 1; i <= checkLen; i++) {
			masking += "*";
		}
		
//		// 만들어진 만큼 대체하기 @ 이전 부분에 naver 있으면 @ 이후도 마스킹되는 문제가 있음
//		String realFinal = q3.replace(check, masking);
//		System.out.println(realFinal);
		
		// @ 뒷 부분
		String rRealTest1 = q3.substring(idCheck);
		// 아이디만 따서 마스킹 처리하기(앞 부분)
		String rRealTest2 = q3.substring(0, 2);
		// 최종본 : 앞 + 뒤
		System.out.println(rRealTest2 + masking + rRealTest1);
		
		
		// 문제4 : query가 맨 마지막에 있는 경우까지. split으로도 가능.
		String q4 = "https://search.naver.com/search.naver?where=nexearch&sm=top_hty&fbm=0&ie=utf8&query=1234&ackey=1oiioasi";
		
		// 일단 길이 구하기
		int length = "&query".length();
		
		// length 이용해서 query 뒤 검색어 위치 찾기
		int adIdx = q4.indexOf("&query") + length + 1;
		
		// 쿼리 뒤부터 끝까지 한 번 컷
		String test = q4.substring(adIdx);
		
		// test.indexOf("&"); 위치 체크
		int andIndex = test.indexOf("&");

		// query가 마지막일 때
		if (andIndex == -1) {
			System.out.println(test);
		}
		// 중간에 있을 때
		else {
			String testCut = test.substring(0, andIndex);
			System.out.println(testCut);			
		}
		
		
		String s5 = "   앞글씨          뒤글씨       ";
		System.out.println("[" + s5.trim() + "]");
		
		// 가비지 콜렉터 호출
		System.gc();
		
		String menu = "김밥,라면,돈까스,제육덮밥";
		String[] tester = menu.split(",");
		for(String m : tester) {
			System.out.println(m);
		}
		
		String url = "blog.naver.com";
		String[] urls = url.split(".");
		System.out.println(urls.length);
		
		String a = "a";
		a += "b";
		a = a + "c";
		System.out.println(a);
		
		StringBuffer sb = new StringBuffer("a");
		sb.append("b");
		sb.append("c");
		String d = sb.toString();
		System.out.println(d);
		
		StringBuilder sB = new StringBuilder("a");
		sB.append("b");
		String d2 = sB.toString();
		System.out.println(d2);
		
	
	}

}