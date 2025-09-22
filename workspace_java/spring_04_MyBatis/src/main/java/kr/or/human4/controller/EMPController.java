package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EMPController {
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		List<EmpDTO> list = empService.getEmpList();
		model.addAttribute("list", list);
		
		// =========================================
		
		
		return "emp";
	}
	
	// empone이랑 emponemap 지금 오류 발생함... 원인 찾기.
	// 아마 처음에 daoimpl 만질 때 이름 몇 번 바꿔서 그런 것 같음.
	@RequestMapping("/empOne")
	public String empOne(Model model) {
		EmpDTO empDTO = empService.getEmp();
		model.addAttribute("empDTO", empDTO);
		
		// =========================================
		
		
		return "emp";
	}
	
	
	@RequestMapping("/empOneMap")
	public String empOneMap(Model model) {
		Map empDtoMap = empService.getEmpMap();
		model.addAttribute("empDtoMap", empDtoMap);
		
		// =========================================
		
		
		return "empDtoMap";
	}
	
	@RequestMapping("/getEmpno")
	public String getEmpno(Model model, int empno) {
		System.out.println("empno : " + empno);
		List list = empService.getEmpno(empno);
		
		model.addAttribute("list2", list);
		return "emp";
	}
	
	@RequestMapping("/getEname")
	public String getEname(Model model, String ename) {
		System.out.println("ename : " + ename);
		List list = empService.getEname(ename);
		
		model.addAttribute("list3", list);
		return "emp";
	}
	
}
