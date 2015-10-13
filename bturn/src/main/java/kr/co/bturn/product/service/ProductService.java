package kr.co.bturn.product.service;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

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
	 * @param productNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public ProductDTO selectProduct(long productNo) throws Exception;
	
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
	 * @param productNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int updateProduct(long productNo) throws Exception;
	
	/**
	 * 상품 삭제
	 * @param productNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int deleteProduct(long productNo) throws Exception;
	
	/**
	 * 상품 추천 서비스
	 * @param productNo
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.11
	 */
	public void updateRecommendCount(long productNo, HttpSession session, HttpServletRequest request) throws Exception;

}
