package kr.co.bturn.member.controller;

import javax.servlet.http.HttpSession;

import kr.co.bturn.member.model.MemberDTO;
import kr.co.bturn.member.service.MemberService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MemberController {
	
	@Autowired
	private MemberService memberService;
	
	@RequestMapping("/main.do")
	public String main() throws Exception {
		return "/main";
	}
	
	
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public String joinForm() throws Exception {
		return "member/join";
	}
	
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
	public ModelAndView join() throws Exception {
		
		ModelAndView mav = new ModelAndView();
		
		mav.setViewName("main");
		
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() throws Exception {
		return "member/login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView login(Model databox, String email, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		
		MemberDTO dto = memberService.login(databox, email);
		if(dto != null && dto.equals("")) {
			session.setAttribute("email", dto.getEmail());
			session.setAttribute("name", dto.getName());
		}
		
		mav.setViewName("member/loginProcess");
		
		return mav;
	}
}
