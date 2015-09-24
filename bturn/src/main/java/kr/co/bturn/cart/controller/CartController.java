package kr.co.bturn.cart.controller;

import kr.co.bturn.util.SpringException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	
	@RequestMapping()
	@ExceptionHandler({SpringException.class})
	public ModelAndView goCart() {
		
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
}
