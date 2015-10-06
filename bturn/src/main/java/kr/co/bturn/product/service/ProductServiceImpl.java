package kr.co.bturn.product.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import kr.co.bturn.product.dao.ProductDAO;
import kr.co.bturn.product.model.ProductDTO;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public class ProductServiceImpl implements ProductService {
	
	Logger log = Logger.getLogger(this.getClass());
	
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


}
