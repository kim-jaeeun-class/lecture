package kr.or.human3;

import org.springframework.web.bind.annotation.RequestMapping;

public class MESController {
//	@RequestMapping("/mes/bom")
//	public String bom() {
//		return "bom";
//	}
//	
//	@RequestMapping("/mes/starndard")
//	public String standard() {
//		return "standard";
//	}
	
	@RequestMapping("bom")
	public String bom() {
		return "bom";
	}
	
	@RequestMapping("/starndard")
	public String standard() {
		return "standard";
	}
}
