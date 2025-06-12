package sec00.prac02.quiz;

public class Dict {
	/*
	 * return   메소드명(매개변수)  
	 * 단어		En2Ko(영단어)
	 * 영단어	Ko2En(단어)
	 * 
	 * String[] en = {love, hate, devil, angel};
	 * String[] ko = {"사랑", "증오", "악마", "천사"};
	 */
	
	
	// 지금 코드의 문제점... 필드 건드리지 말라는 조건이 있었으면 잘못된 코드가 된다.
	
	String[] en = {"love", "hate", "devil", "angel"};
	String[] ko = {"사랑", "증오", "악마", "천사"};
	
	String[] en1 = {"love", "hate", "devil", "angel"}; // 원본
	String[] ko1 = {"사랑", "증오", "악마", "천사"};
	
	
	/* void 코드까지는 Scanner 미사용 코드를 위한 필드 및 메소드 */
	
	String enWord;
	String koWord;
	
	void getWordEn (String a) {
		enWord = a;
	}
	
	void getWordKo (String a) {
		koWord = a;
	}
	
	
	/* Scanner 쓰는 코드 */
	
	String en2ko(String a) {
		for(int i = 0; i < en.length; i++) {
			if(en[i].equals(a)) {	// 입력값이랑 배열 내 값이 같으면
				return ko[i];
			}
		}
		return "";
	}
	
	String ko2en(String a) {
		for(int i = 0; i < ko.length; i++) {
			if(ko[i].equals(a)) {
				return en[i];
			}
		}
		return "";
	}
}
