package kr.co.bturn.product.controller;

import java.util.List;

import kr.co.bturn.product.model.ProductDTO;
import kr.co.bturn.product.service.ProductService;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.annotation.Secured;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

/**
 * 상품 컨트롤러
 * @author LeeWonHee
 * @since 2015.10.06
 */

@Controller
public class ProductController {
	
	Log log = LogFactory.getLog(this.getClass());
	@Autowired
	private ProductService productService;

	public void setProductService(ProductService productService) {
		this.productService = productService;
	}
	
	@Secured(value="SELLER_ROLE")
	@RequestMapping(value="addProduct.do", method=RequestMethod.GET)
	public String addProductForm() {
		return "product/insertProduct";
	}
	
	@RequestMapping(value="/addProduct.do", method=RequestMethod.POST)
	public ModelAndView addProduct(ProductDTO dto) {
		ModelAndView mav = new ModelAndView();
		try {
			int count = productService.addProduct(dto);
			if(count > 0) {
				mav.setViewName("layout/main");
			}
		} catch (Exception e) {
			log.error("\t addProductError: \t"+e.getMessage(), e);
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
	
	@RequestMapping(value="/selectProduct.do")
	public ProductDTO selectProduct(@RequestParam("index") @PathVariable("index")long index) {
		ProductDTO dto = null;
		try {
			dto = productService.selectProduct(index);
		} catch (Exception e) {
			
		}
		return dto;
	}
	
	@RequestMapping("/main.do")
	public ModelAndView selectProductList() {
		ModelAndView mav = new ModelAndView();
		try {
			List<ProductDTO> productList = productService.selectProductList();
			mav.addObject("productList", productList);
		} catch (Exception e) {
			log.error("\t selectProductListError: \t "+e.getMessage(), e);
		}
		mav.setViewName("layout/main");
		
		return mav;
	}

}
