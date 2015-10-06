package kr.co.bturn.product.dao;

import java.util.List;

import kr.co.bturn.product.model.ProductDTO;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface ProductDAO {
	
	/**
	 * 상품 검색
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public List<ProductDTO> searchProduct(String keyword) throws DataAccessException;
	
	/**
	 * 상품 등록
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int insertProduct(ProductDTO dto) throws DataAccessException;
	
	/**
	 * 상품 선택
	 * @param index
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public ProductDTO selectProduct(long index) throws DataAccessException;
	
	/**
	 * 상품 리스트
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.05
	 */
	public List<ProductDTO> selectProductList() throws DataAccessException;
	
	/**
	 * 상품 정보 수정
	 * @param index
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int updateProduct(long index) throws DataAccessException;
	
	/**
	 * 상품 삭제
	 * @param index
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int deleteProduct(long index) throws DataAccessException;

}
