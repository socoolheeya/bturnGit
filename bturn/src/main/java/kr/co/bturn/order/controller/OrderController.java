package kr.co.bturn.order.controller;

import java.util.List;

import javax.annotation.Resource;

import kr.co.bturn.cart.service.CartService;
import kr.co.bturn.member.service.MemberService;
import kr.co.bturn.order.model.OrderDTO;
import kr.co.bturn.order.service.OrderService;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OrderController {
	
	Log log = LogFactory.getLog(this.getClass());
	@Autowired
	private OrderService orderService;
	@Resource(name="memberService")
	private MemberService memberService;
	@Resource(name="cartService")
	private CartService cartService;
	
	@RequestMapping("/getOrderList.do")
	public ModelAndView getOrderList() {
		ModelAndView mav = new ModelAndView();
		try {
			List<OrderDTO> orderList = orderService.selectOrderList();
			mav.addObject("orderList", orderList);
			mav.setViewName("order/orderList");
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return mav;
	}
	
	@RequestMapping("/orderProduct.do")
	public ModelAndView orderProduct() {
		ModelAndView mav = new ModelAndView();
		
		return mav;
	}
	
	
	@RequestMapping(value="/deleteOrder.do", method=RequestMethod.GET)
	public String deleteOrderForm() {
		return "order/deleteOrder";
	}
	
	@RequestMapping(value="/deleteOrder.do", method=RequestMethod.POST)
	public ModelAndView deleteOrder(long orderNo) {
		ModelAndView mav = new ModelAndView();
		try {
			orderService.deleteOrder(orderNo);
			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return mav;
	}
}
