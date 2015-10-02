package kr.co.bturn.household.controller;

import kr.co.bturn.household.service.HouseholdService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HouseholdAccountController {
	
	@Autowired
	private HouseholdService householdService;

	public void setHouseholdService(HouseholdService householdService) {
		this.householdService = householdService;
	}


	public ModelAndView makeHouseholdAccount() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("household/makeHousehold");
		
		return mav;
	}

}
