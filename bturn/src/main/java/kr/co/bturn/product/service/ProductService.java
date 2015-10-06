package kr.co.bturn.product.service;

import java.util.List;

import kr.co.bturn.product.model.ProductDTO;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface ProductService {
	/**
	 * 
	 * @param keyword
	 * @return
	 * @throws Exception
	 */
	public List<ProductDTO> searchProduct(String keyword) throws Exception;
	
	/**
	 * 상품 추가
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int addProduct(ProductDTO dto) throws Exception;
	
	/**
	 * 선택 상품 상세 보기
	 * @param index
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public ProductDTO selectProduct(long index) throws Exception;
	
	/**
	 * 메인화면 전체 상품 리스트 가져오기
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.05
	 */
	public List<ProductDTO> selectProductList() throws Exception;
	
	/**
	 * 상품 변경
	 * @param index
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int updateProduct(long index) throws Exception;
	
	/**
	 * 상품 삭제
	 * @param index
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int deleteProduct(long index) throws Exception;

}
