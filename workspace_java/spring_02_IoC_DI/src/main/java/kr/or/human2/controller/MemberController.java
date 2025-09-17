package kr.or.human2.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import kr.or.human2.service.MemberService;

@Controller
public class MemberController {
	MemberController() {
		// 서버 실행 시 실행됨
		// 싱글톤이기 때문에 홈페이지 새로고침해도 실행되지 않음
		System.out.println("MemCtrl 생성자 실행");
		
	}
	
	@Autowired
	MemberService service;
	
	@RequestMapping("/member")
	String listMember() {
		// /member 페이지에 들어갈 때 실행됨
		System.out.println("MemberController listMember() 실행");
		
//		service = new MemberService();
		System.out.println("list : "+ service.getList());
		

		return "home";
	}
}
