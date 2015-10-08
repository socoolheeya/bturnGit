package kr.co.bturn.pay.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

/**
 * 결제 컨트롤러
 * @author LeeWonHee
 * @since 2015.10.08
 */

@Controller
public class PayController {
	
	public ModelAndView getPayList() {
		ModelAndView mav = new ModelAndView();
		return mav;
	}

}
