package quiz02.class1;

import java.util.HashMap;

public class Person1DAO {
	
	HashMap<String, String> map = new HashMap<String, String>();
	
	Person1DAO() {
		map.put("사탕", "청포도");
		map.put("점심", "달식당");
		map.put("회식", "어디?");
		map.put("휴식", "네");
	}
	
	String selectAnswer(String q) {
		return (String)map.get("q");
	}
}
