package kr.co.bturn.product.service;

import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import kr.co.bturn.product.dao.ProductDAO;
import kr.co.bturn.product.model.ProductDTO;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public class ProductServiceImpl implements ProductService {
	
	Log log = LogFactory.getLog(this.getClass());
	@Resource(name="productDAO")
	private ProductDAO productDAO;

	public void setProductDAO(ProductDAO productDAO) {
		this.productDAO = productDAO;
	}

	@Override
	public List<ProductDTO> searchProduct(String keyword) throws Exception {
		return productDAO.searchProduct(keyword);
	}
	
	@Override
	public int addProduct(ProductDTO dto) throws Exception {
		
		return productDAO.insertProduct(dto); 
	}

	@Override
	public ProductDTO selectProduct(long index) throws Exception {
		return productDAO.selectProduct(index);
	}
	
	@Override
	public List<ProductDTO> selectProductList() throws Exception {
		return productDAO.selectProductList();
	}

	@Override
	public int updateProduct(long index) throws Exception {
		return productDAO.updateProduct(index);
	}

	@Override
	public int deleteProduct(long index) throws Exception {
		return productDAO.deleteProduct(index);
	}

	@Override
	public void updateRecommendCount(long productNo, HttpSession session, HttpServletRequest request) throws Exception {
		
		long memberNo = (Long)session.getAttribute("memberNo");
		String memberId = (String)session.getAttribute("id");
		if(memberNo == -1) {
			request.getRemoteAddr();
		} else {
			productDAO.updateRecommandCount(productNo);
		}
		
	}


}
