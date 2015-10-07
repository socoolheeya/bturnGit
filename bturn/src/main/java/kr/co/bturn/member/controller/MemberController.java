package kr.co.bturn.member.controller;

import javax.servlet.http.HttpSession;

import kr.co.bturn.member.model.MemberDTO;
import kr.co.bturn.member.service.MemberService;
import kr.co.bturn.util.SpringException;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.multiaction.MultiActionController;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MemberController extends MultiActionController {

	private Log log = LogFactory.getLog(this.getClass());
	@Autowired
	private MemberService memberService;

	@RequestMapping(value = "/joinForm.do")
	public String joinIndex() throws SpringException {
		return "member/join/joinIndex";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.GET, params = {
			"memberType=PRIVATE_BUYER"})
	public ModelAndView joinForm(@RequestParam("memberType") String memberType) throws SpringException {
		ModelAndView mav = new ModelAndView("member/join/join");
		MemberDTO dto = new MemberDTO();
		dto.setMemberType(memberType);
		mav.addObject("dto", dto);
		return mav;
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public ModelAndView join(MemberDTO dto) {
		ModelAndView mav = new ModelAndView();
		String msg = "";
		try {
			int result = memberService.join(dto);
			if (result > 0) {
				msg = "�α��� ����";
				mav.addObject("msg", msg);
			} else {
				msg = "�α��� ����";
				mav.addObject("msg", msg);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		mav.setViewName("member/join/joinSuccess");
		return mav;
	}

	@RequestMapping(value = "/login", method = RequestMethod.GET)
	public String loginForm() throws Exception {
		return "member/login/login";
	}
	
	@Secured({"GUEST_USER","ADMIN_USER","ROLE_USER"})
	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(String queryId,
			@RequestParam("id") String id,
			@RequestParam("password") String password, HttpSession session)
			throws Exception {
		ModelAndView mav = new ModelAndView();
		String msg = null;
		try {
			MemberDTO dto = memberService.login(id, password);
			if (dto != null) {
				session.setAttribute("id", dto.getId());
				session.setAttribute("name", dto.getName());
				msg = "�α��� ����!";
				mav.addObject("msg", msg);
				mav.setViewName("member/login/loginProcess");
			} else {
				msg = "�α��� ����";
				mav.addObject("msg", msg);
				mav = new ModelAndView(new RedirectView("login.do"));
			}
		} catch (Exception e) {
			log.error("�α��� ����", e);
		}
		return mav;
	}

	@RequestMapping("/logout.do")
	public ModelAndView logout(HttpSession session) {
		ModelAndView mav = new ModelAndView();
		session.invalidate();
		mav = new ModelAndView(new RedirectView("login.do"));
		
		return mav;
	}
	
	@RequestMapping(value="/confirmMemberInfo.do", method=RequestMethod.GET)
	public String confirmMemberForm() {
		return "member/update/confirmMemberInfo";
	}
	
	@RequestMapping(value="/confirmMemberInfo.do", method=RequestMethod.POST)
	public ModelAndView confirmMember(@RequestParam("id")String id, @RequestParam("password")String password) {
		ModelAndView mav = new ModelAndView();
		MemberDTO dto = null;
		String msg = "";
		try {
			dto = memberService.login(id, password);
			msg = dto == null ? "�α��� �Է� ����" : "�α��� �Է� ����"; 
			mav.addObject("id", dto.getId());
			mav.addObject("msg", msg);
			if(dto == null || dto.equals("")) {
				mav = new ModelAndView(new RedirectView("/confirmMemberInfo.do"));
			} else {
				mav.setViewName("member/update/updateMemberInfo");
			}
		} catch (Exception e) {
			log.error("\t ���������Ȯ����������: \t"+e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/updateMemberInfo.do", method = RequestMethod.GET)
	public ModelAndView updateMemberInfoForm(@RequestParam("id")String id) {
		ModelAndView mav = new ModelAndView("member/update/updateMemberInfo");
		MemberDTO dto;
		try {
			dto = memberService.getMemberInfo(id);
			mav.addObject("dto", dto);
		} catch (Exception e) {
			log.error("updateMemberInfoError"+e.getMessage(), e);
		}
		return mav;
	}

	@RequestMapping(value = "/updateMemberInfo.do", method = RequestMethod.POST)
	public ModelAndView updateMemberInfo(@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView();
		try {
			memberService.updateMemberInfo(id);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
	}
	
	@RequestMapping(value="/goMypage.do")
	public ModelAndView goMypage() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("member/mypage");
		return mav;
	}
}