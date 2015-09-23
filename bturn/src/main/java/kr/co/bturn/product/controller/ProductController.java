package kr.co.bturn.product.controller;

import kr.co.bturn.product.model.ProductDTO;
import kr.co.bturn.product.service.ProductService;

import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ProductController {
	
	@Autowired
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}

	@RequestMapping(value="addProduct.do", method=RequestMethod.GET)
	public String addProductForm() {
		return "product/addProduct";
	}
	
	@RequestMapping(value="/addProduct.do", method=RequestMethod.POST)
	public ModelAndView addProduct(ProductDTO dto) {
		ModelAndView mav = new ModelAndView();
		try {
			int count = productService.addProduct(dto);
			if(count > 0) {
				mav.setViewName("product/addProduct");
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return mav;
	}
	
	@RequestMapping("/searchProduct.do")
	public ModelAndView searchProduct(@RequestParam("keyword") String keyword) {
		ModelAndView mav = new ModelAndView();
		try {
			productService.searchProduct(keyword);
			mav.setViewName("product/searchProduct");
		} catch (Exception e) {
			e.printStackTrace();
		}
		return mav;
		
	}
	
	@RequestMapping(value="/selectProduct.do", params="{index}")
	public ProductDTO selectProduct(@RequestParam("index") @PathVariable("index")long index) {
		ProductDTO dto = null;
		try {
			dto = productService.selectProduct(index);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return dto;
		
	}

}
