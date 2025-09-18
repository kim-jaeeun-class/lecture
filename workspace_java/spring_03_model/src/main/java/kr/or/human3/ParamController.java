package kr.or.human3;

import java.io.IOException;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamController {
	@RequestMapping("/join.do")
	public void joinForm(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.getRequestDispatcher("/WEB-INF/views/join.jsp").forward(request, response);
		}
		catch (ServletException e) {
			e.printStackTrace();
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	// Spring에 가깝게 : join과 동일
	@RequestMapping("/join2.do")
	public ModelAndView joinForm2() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("join");
		
		return mav;
	}
	
	// join2와 동일
	@RequestMapping("/join3.do")
	public ModelAndView joinForm3() {
		ModelAndView mav = new ModelAndView("join");
		return mav;
	}
	
	@RequestMapping("/join1")
	public void join1(HttpServletRequest request) {
		String id = request.getParameter("id");
		System.out.println(id);
	}
	
	// 회원가입 완료 페이지로 이동
	@RequestMapping("/join2")
	public ModelAndView join2(HttpServletRequest request) {
		
		// 아이디 값 얻기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		System.out.println(id);
		
		// 아이디 담아서 result로 보냄
		request.setAttribute("id", id);
		request.setAttribute("pw", pw);
		request.setAttribute("name", name);
		
		ModelAndView mav = new ModelAndView("result");
		return mav;
	}
	// 회원가입 완료 페이지로 이동
	@RequestMapping("/join3")
	public ModelAndView join3(HttpServletRequest request) {
		
		// 아이디 값 얻기
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		String name = request.getParameter("name");
		String sAge = request.getParameter("age");
		
		int age = Integer.parseInt(sAge);
		
		System.out.println(id);
		
		// 아이디 담아서 result로 보냄
//		request.setAttribute("id", id);
//		request.setAttribute("pw", pw);
//		request.setAttribute("name", name);
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("id", id);
		mav.addObject("pw", pw);
		mav.addObject("name", name);
		mav.addObject("age", age);
		return mav;
	}
	
	@RequestMapping("/join5")
	public ModelAndView join5(
			
			// String id = request.getParameter("id"); 와 동일
			// 기본적으로 필수값이므로 없으면 400 오류 발생
			// 즉, required=true가 기본값
			@RequestParam("id")
			String id,
			
			@RequestParam("pw") String pw,
			
			// 필수 아님. 값이 없을 경우 null.
			@RequestParam(value="name", required=false)
			String name,
			
			@RequestParam(value="age")
			int age,
			
			String tel,	// parameter key = 변수명이면 @RequestParam 생략 가능
						// @RequestParam 생략 시 기본 false
						// key가 없으면 null
			
//			, int a		// null이고 형 변환이 안 돼 400 에러'
			
			@RequestParam
			Map map		// 받은 값을 모두 모아 보여줌
			
//			@RequestParam	// 여기에서 '이런 식'으로 dto 사용불가
//			MemberDTO dto
			) {
		
		System.out.println(id);
		System.out.println(tel);
		System.out.println(map);
		
		ModelAndView mav = new ModelAndView("result");
		mav.addObject("id", id);
		mav.addObject("pw", pw);
		mav.addObject("name", name);
		mav.addObject("age", age);
		return mav;
	}
	
	// ==============================================
	// @ModelAttribute
	// ==============================================
	@RequestMapping("join6")
	public ModelAndView join6(
			// parameter에서 꺼내 DTO에 알아서 넣어줌
			@ModelAttribute
			MemberDTO dto1,
			
			// DTO를 자동으로 채우고, 모델에 넣어줌
			// = mav.addObject를 대신해줌
			@ModelAttribute("memberDTO")
			MemberDTO dto2,
			
			// @ModelAttribute 생략 가능
			// 생략 시, 타입(클래스)의 앞글자를 소문자로 변경한 key로 모델에 담어줌
			MemberDTO dto3
			) {
		System.out.println(dto1);
		System.out.println(dto2);
		System.out.println(dto3);
		
		ModelAndView mav = new ModelAndView("result");
//		mav.addObject("memberDTO", dto1);
		return mav;
	}
	
	@RequestMapping("/join7") 
	public void join7(String id, MemberDTO dto){
		
	}
}
