package sec02.exam01.driver;

import java.util.ArrayList;
import java.util.HashMap;

public class DriverExam {

	public static void main(String[] args) {
		
		Tico tico = new Tico();
		Driver driver = new Driver();
		
		driver.driveTico(tico);
		
		Porsche911 p = new Porsche911();
		// p를 Car 타입으로 변경해서 drive()에 넣기
		Car c1 = (Car)p;
		driver.drive(c1);
		
		BMWM4 b = new BMWM4();
		driver.drive(b);
		
		driver.drive(new Tico());
		
		ArrayList list = new ArrayList();
		list.add(driver);
		Driver d = (Driver)list.get(0);
		
		HashMap map = new HashMap();
		map.put("key", "value");	// 값 넣기
		String a = (String)map.get("key");	// 값 꺼내기

	}

}
