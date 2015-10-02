package kr.co.bturn.cart.controller;

import java.util.List;

import kr.co.bturn.cart.model.CartDTO;
import kr.co.bturn.cart.service.CartService;
import kr.co.bturn.util.SpringException;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class CartController {
	
	@Autowired
	private CartService cartService;
	
	Logger log = Logger.getLogger(this.getClass());
	
	@RequestMapping("/goCart.do")
	@ExceptionHandler({SpringException.class})
	public ModelAndView getCartList(@RequestParam("cartList") List<CartDTO> cartLst) {
		
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	@RequestMapping("/deleteCart.do")
	public ModelAndView deleteCart(@RequestParam("cartNo") long cartNo) {
		ModelAndView mav = new ModelAndView();
		try {
			cartService.deleteCart(cartNo);
		} catch(Exception e) {
			log.error("장바구니 삭제 오류", e);
		}
		return mav;
	}
}
