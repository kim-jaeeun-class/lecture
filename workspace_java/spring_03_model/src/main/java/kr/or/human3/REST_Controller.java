package kr.or.human3;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//@Controller
//@ResponseBody // 이렇게 쓰면 안에 들어있는 메소드 모두 ResponseBody로 사용 가능.
@RestController	// 위의 두 개념을 모두 합친 것
public class REST_Controller {
	
	@RequestMapping("/a")
//	@ResponseBody
	public String a() {
		return "a";
	}
	
	@RequestMapping("/b")
//	@ResponseBody
	public String b() {
		return "b";
	}
}
