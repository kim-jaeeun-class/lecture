package sec05.exam05.finall;

public class Constant {
	
	static final int LOGIN_SUCCESS = 1;	// 로그인 성공
	static final int LOGIN_FAIL = 2;	// 로그인 실패
	static final int LOGIN_PW_90 = 3;	// 비밀번호 변경 권장(90일)
	static final int LOGIN_PW_TEMP = 4;	// 임시 비밀번호 상태

}

class ConstantExam {	// 이런 식으로 Exam 파일 만들지 않고 한 파일 내에서 사용 가능
	public static void main(String[] args) {
		int result = loginCheck("admin", "1234");
		if(result == Constant.LOGIN_SUCCESS) {
			System.out.println("로그인 성공 》 메인 페이지로 이동");
		}
	}
	
	static int loginCheck(String id, String pw) {
		if("admin".equals(id) && "1234".equals(pw)) {
			return Constant.LOGIN_SUCCESS;
		}
		else {
			return Constant.LOGIN_FAIL;
		}
	};
	
}