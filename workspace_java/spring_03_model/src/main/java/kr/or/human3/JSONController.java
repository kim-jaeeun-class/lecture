package kr.or.human3;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class JSONController {

	@RequestMapping("/ajax.do")
	public String ajax() {
		return "ajax";
	}
	
	@RequestMapping("/ajax1")
	public String ajax1(
//				JSON은 해석하지 못함
//				@RequestParam(value="id", required=false)
//				String id
			
			@RequestBody	// get 불가. post, put, delete 가능
			MemberDTO dto
			) {
		System.out.println(dto);
		return "ajax";
	}
	
	@RequestMapping("/ajax2")
	@ResponseBody
	public String ajax2() {
		return "ajax";
	}
}
