package kr.or.human4.controller;

import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import kr.or.human4.dto.EmpDTO;
import kr.or.human4.service.EmpService;
@Controller
public class EMPController {
	
	private static final Logger logger = LoggerFactory.getLogger(EmpController.class);
	
	static final int isDebug = 3;
	
	@RequestMapping("/log4j")
	public String log4j() {
		
		logger.info("이거 info임");
		logger.warn("이거 warning임");
		logger.error("이거 error임");
		
		if(isDebug >= 2 ) {
//			System.out.println(list.size());
		}
		if(isDebug >= 4) {
//			System.out.println(list);
		}
		
		return "emp";
	}
	
	@Autowired
	EmpService empService;
	
	@RequestMapping("/listEmp")
	public String listEmp(Model model) {
		List<EmpDTO> list = empService.getEmpList();
		model.addAttribute("list", list);

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
		EmpDTO dto = empService.getOneEmpno(empno);
		
		// 이쪽 jsp에서 detail 이름 확인해보기
		model.addAttribute("detail", dto);
		return "deatil";
	}
	
	// 회원 가입으로 이동
	@RequestMapping("/join")
	public String join() {
		return "join";
	}
	
	// 상세 - 수정
	@RequestMapping("/editData")
	public String editData(Model model, EmpDTO dto) {
		EmpDTO empDTO = empService.getOneEmpno(dto.getEmpno());
		model.addAttribute("empDTO", empDTO);
		
		return "editData";
	}
	
	// 상세 - 수정 후 목록으로
	@RequestMapping("/editData")
	public String editEmp(Model model, EmpDTO dto) {
		int result = empService.editData(dto);
		System.out.println("결과: " + result);
		
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

//	나중에 코드 확인해서 수정하기
	@RequestMapping("/choice")
	public String choice(Model model,
			@RequestParam("empnoes")
			String[] empnoes1,
			
			@RequestParam("empnoes")
			List empnoes2,
			
			@ModelAttribute
			EmpDTO empDTO
  		) {
		System.out.println("String[] : ");
		for(String empno : empnoes1) {
			System.out.println(empno);
		}
		
		System.out.println("List : "+ empnoes2);
		System.out.println("EmpDTO : "+ empDTO);
		
		List<EmpDTO> list = empService.foreach(empDTO);
		model.addAttribute("list", list);
		return "emp";
  		}
	
	@RequestMapping("/foreach")
	public String foreach(Model model, EmpDTO dto) {
		
		List<EmpDTO> list = empService.foreach(dto);
		
		model.addAttribute("list", list);
		return "emp";
	}


}
