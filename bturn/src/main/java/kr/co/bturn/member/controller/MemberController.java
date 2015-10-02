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
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class MemberController extends MultiActionController {

	private Logger log = Logger.getLogger(this.getClass());
	@Autowired
	private MemberService memberService;

	@RequestMapping("/main.do")
	public String main() {
		return "layout/main";
	}

	@RequestMapping(value = "/joinIndex.do")
	public String joinIndex() {
		return "member/join/joinIndex";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.GET)
	public String joinForm(){
		return "member/join/join";
	}

	@RequestMapping(value = "/join.do", method = RequestMethod.POST)
	public ModelAndView join(String queryId, @RequestParam("dto")MemberDTO dto) {
		ModelAndView mav = new ModelAndView();

		try {
			memberService.join(queryId, dto);
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

	@RequestMapping(value = "login", method = RequestMethod.POST)
	public ModelAndView login(String queryId, Model databox,
			@RequestParam("id") String id,
			@RequestParam("password") String password, HttpSession session)
			throws Exception {
		ModelAndView mav = new ModelAndView();
		String msg = null;
		try {
			MemberDTO dto = memberService.login(queryId, id, password, databox);
			if (dto != null && dto.equals("")) {
				session.setAttribute("id", dto.getId());
				session.setAttribute("name", dto.getName());
				msg = "로그인 성공!";
				mav.addObject("msg", msg);
				mav.setViewName("member/login/loginProcess");
			} else {
				msg = "로그인 실패";
				databox.addAttribute("ERROR_MESSAGE", msg);
				mav.addObject("msg", msg);
				mav = new ModelAndView(new RedirectView("member/login/login"));
			}
		} catch (Exception e) {
			log.error("로그인 에러", e);
		}
		return mav;
	}

	@RequestMapping("/logout.do")
	public void logout(HttpSession session) {
		session.invalidate();
	}

	@RequestMapping(value = "/updateMemberInfo", method = RequestMethod.GET)
	public String updateMemberInfoForm() {
		return "member/update/updateMemberInfo";

	}

	@RequestMapping(value = "/updateMemberInfo", method = RequestMethod.POST)
	public ModelAndView updateMemberInfo(String queryId,
			@RequestParam("id") String id) {
		ModelAndView mav = new ModelAndView();

		try {
			memberService.updateMemberInfo(queryId, id);
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mav;
	}
}