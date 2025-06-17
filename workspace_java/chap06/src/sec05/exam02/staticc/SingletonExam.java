package sec05.exam02.staticc;

public class SingletonExam {

	public static void main(String[] args) {
//		new Singleton; // private로 막았으므로 불가함
		
		Singleton s1 = Singleton.getInstance();	// 이런 식으로의 new는 가능
		Singleton s2 = Singleton.getInstance();	// s1과 s2는 같은 객체
		
	}

}
