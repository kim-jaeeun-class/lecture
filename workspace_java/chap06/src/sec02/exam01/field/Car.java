package sec02.exam01.field;
	
public class Car {
	
	String company = "현대자동차";
	String model = "그랜저";
	String color = "검정";
	int maxSpeed = 350;
	int speed; // 필드 선언만 함
	//	speed = 50; 선언과 동시에 초기화는 가능하지만, 따로 값을 할당해 실행하기는 여기에서 불가
	// 초기화 하지 않을 경우, 생성 시 0, false, null로 초기화
	
}
