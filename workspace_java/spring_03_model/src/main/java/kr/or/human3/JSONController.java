package kr.or.human3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
		
		// @ResoponseBody 때문에 글씨 그대로 나감
		return "ajax";
	}
	
	@RequestMapping("/ajax3")
	@ResponseBody
	public MemberDTO ajax3() {
		
		MemberDTO dto = new MemberDTO();
		dto.setId("id");
		dto.setPw("pw");
		dto.setName("name");
		dto.setAge(20);
		dto.setTel("010-1111-1111");
		dto.setAddr("addr");
		
		// dto가 JSON 형태로 반환
		return dto;
	}
	
	@RequestMapping("/ajax4")
	@ResponseBody
	public List ajax4() {
		
		MemberDTO dto = new MemberDTO();
		dto.setId("id");
		dto.setPw("pw");
		dto.setName("name");
		dto.setAge(20);
		dto.setTel("010-1111-1111");
		dto.setAddr("addr");
		
		// List가 아니라 HashMap도 가능
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		return list;
	}
	
	@RequestMapping("/ajax5")
	@ResponseBody
	public Map ajax5() {
		
		MemberDTO dto = new MemberDTO();
		dto.setId("id");
		dto.setPw("pw");
		dto.setName("name");
		dto.setAge(20);
		dto.setTel("010-1111-1111");
		dto.setAddr("addr");
		
		List list = new ArrayList();
		list.add(dto);
		list.add(dto);
		list.add(dto);
		
		Map map = new HashMap();
		map.put("list", list);
		map.put("totalCount", 150);
		map.put("pageNo", 3);
		map.put("keyword", "SCOTT");
		
		return map;
	}
}
