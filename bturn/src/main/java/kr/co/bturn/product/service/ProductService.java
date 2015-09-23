package kr.co.bturn.product.service;

import java.util.List;

import kr.co.bturn.product.model.ProductDTO;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface ProductService {
	
	public List<ProductDTO> searchProduct(String keyword) throws Exception;
	
	public int addProduct(ProductDTO dto) throws Exception;
	
	public ProductDTO selectProduct(long index) throws Exception;
	
	public int updateProduct(long index) throws Exception;
	
	public int deleteProduct(long index) throws Exception;

}
