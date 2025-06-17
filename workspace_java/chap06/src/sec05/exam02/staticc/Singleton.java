package sec05.exam02.staticc;

public class Singleton {
////	Singleton singleton = null;
//	private static Singleton singleton = null;	// 싱글톤 디자인 패턴 사용 방식 1
//	
//	private Singleton() {	// private 접근 제한자로 클래스 내에서는 사용 가능, 클래스 밖에서는 사용 불능으로 바꿈.
//		
//	}
//	
////	Singleton getInstance () {
//	static Singleton getInstance () {
//		if(singleton == null) {
//			singleton = new Singleton();
//		}
//		return singleton;
//	}
	
	private static Singleton singleton = new Singleton(); // 싱글톤 디자인 패턴 사용 방식 2
	
	private Singleton () {}
	
	static Singleton getInstance() {
		return singleton;
	}
}
