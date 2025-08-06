package sec02.exam01;

public class KeyboardExam {

	public static void main(String[] args) {
		KeyboardImpl k1 = new KeyboardImpl();
		Keyboard k2 = (Keyboard) new KeyboardImpl();
		Keyboard k3 = new KeyboardImpl();
		System.out.println(k3.press(13));
		
//		Keyboard k4 = new Keyboard(); 불가
		
		// 이렇게는 가능
		// 여기의 new는 {} 안 내용을 하는 것
		Keyboard k5 = new Keyboard() {

			@Override
			public String press(int keyCode) {
				if(keyCode == 13) {
					return "Enter";
				}
				return "pressed";
			}
		};
		
	}

}
