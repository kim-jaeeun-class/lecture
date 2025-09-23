package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;

@Controller
public class EMPController {
	
	@Autowired
	EmpService empService;
	
	// 지금 listEmp는 emp.xml에 코드가 없으므로 안 나오는 게 정상
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		List<EmpDTO> list = empService.getEmpList();
		model.addAttribute("list", list);
		
		// =========================================
		
		
		return "emp";
	}
	
	@RequestMapping("/empOne")
	public String empOne(Model model) {
		
		EmpDTO empDTO = empService.getEmp();

		model.addAttribute("empDTO", empDTO);
		
		return "emp";
	}
	
	
	@RequestMapping("/empOneMap")
	public String empOneMap(Model model) {
		
		Map map = empService.getEmpMap();
		
		model.addAttribute("map", map);
		
		return "emp";
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
	
	@RequestMapping("/getEmpnoEname")
	public String getEmpnoEname(Model model, EmpDTO dto) {
		List list = empService.getEmpnoEname(dto);
		System.out.println(dto);
		model.addAttribute("list4", list);
		return "emp";
	}
	
	@RequestMapping("/addData")
	public String addData(Model model, EmpDTO dto) {
		int result = empService.addData(dto);
		System.out.println("결과: " + result);
		
//		if(result == 0) {
//			
//		}
//		else {
//			
//		}
		
		// add한 후 기존 주소로 가는 법
		// list는 별도이므로 redirect로 가기
		return "redirect:/listEmp";
	}
	
	// 상세 조회 : empno로
	@RequestMapping("/empDetail")
	public String empDetail(Model model, int empno) {
		List detail = empService.getDetail(empno);
		
		model.addAttribute("detail", detail);
		return "deatil";
	}
	
	// 회원 가입으로 이동
	@RequestMapping("/join")
	public String v() {
		return "";
	}
	
	// 상세 - 수정
	@RequestMapping("/editData")
	public String editData(Model model, EmpDTO dto) {
		int result = empService.editData(dto);
		System.out.println(result);
		
		return "redirect:/listEmp";
	}
	
	// 상세 - 삭제
	@RequestMapping("/removeData")
	public String removeData(Model model, EmpDTO dto) {
		int result = empService.removeData(dto);
		System.out.println(result);
		
		return "redirect:/listEmp";
	}
	
	@RequestMapping("/search")
	public String search(Model model, EmpDTO dto) {
		
		List<EmpDTO> list = empService.selectEmp(dto);
		
		model.addAttribute("list", list);
		return "emp";
	}
}
