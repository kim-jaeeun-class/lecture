package quiz02.class1;

public class Person1Service {
	
	Person1DAO person1DAO = new Person1DAO();
	// 머릿속
	String getInfo(String q) {
		String result = person1DAO.selectAnswer(q);
		if(result == null) {
			result = "...";
		}
		else {
			result = "음..." + result + "이거요";
		}
		return result;
	}
	
	
	
	// ai
	
	
	// 노션
}
