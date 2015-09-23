package kr.co.bturn.member.controller;

import javax.servlet.http.HttpSession;

import kr.co.bturn.member.model.MemberDTO;
import kr.co.bturn.member.service.MemberService;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;

@Controller
public class MemberController extends MultiActionController {
	
	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private MemberService memberService;

	@RequestMapping("/main.do")
	public String main() throws Exception {
		return "layout/main";
	}
	
	@RequestMapping(value="/joinIndex.do")
	public String joinIndex() throws Exception {
		return "member/join/joinIndex";
	}
	
	
	@RequestMapping(value="/join.do", method=RequestMethod.GET)
	public String joinForm() throws Exception {
		return "member/join/join";
	}
	
	@RequestMapping(value="/join.do", method=RequestMethod.POST)
	public ModelAndView join(MemberDTO dto) throws Exception {
		
		ModelAndView mav = new ModelAndView();
		memberService.join(dto);
		mav.setViewName("layout/main");
		return mav;
	}
	
	@RequestMapping(value="/login", method=RequestMethod.GET)
	public String loginForm() throws Exception {
		return "member/login/login";
	}
	
	@RequestMapping(value="login", method=RequestMethod.POST)
	public ModelAndView login(Model databox, String id, HttpSession session) throws Exception {
		ModelAndView mav = new ModelAndView();
		String msg = null;
		try {
			MemberDTO dto = memberService.login(id);
			if(dto != null && dto.equals("")) {
				session.setAttribute("email", dto.getEmail());
				session.setAttribute("name", dto.getName());
				mav.setViewName("member/login/loginProcess");
			} else {
				msg = "로그인 실패";
				databox.addAttribute("ERROR_MESSAGE", msg);
				loginForm();
			}
		} catch(Exception e) {
			log.error("로그인 에러", e);
		}
		return mav;
	}
	
	@RequestMapping(value="/updateMemberInfo", method=RequestMethod.GET)
	public String updateMemberInfoForm() {
		return "member/update/updateMemberInfo";
		
	}
	@RequestMapping(value="/updateMemberInfo", method=RequestMethod.POST)
	public ModelAndView updateMemberInfo(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView();
		try {
			memberService.updateMemberInfo(id);
		} catch(Exception e) {
			
		}
		
		return mav;
	}
}
