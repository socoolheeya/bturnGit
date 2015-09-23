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
	 * ��ǰ �˻�
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 */
	public List<ProductDTO> searchProduct(String keyword) throws DataAccessException;
	
	/**
	 * ��ǰ ���
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 */
	public int insertProduct(ProductDTO dto) throws DataAccessException;
	
	/**
	 * ��ǰ ����
	 * @param index
	 * @return
	 * @throws DataAccessException
	 */
	public ProductDTO selectProduct(long index) throws DataAccessException;
	
	/**
	 * ��ǰ ����Ʈ
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 */
	public List<ProductDTO> selectProductList(ProductDTO dto) throws DataAccessException;
	
	/**
	 * ��ǰ ���� ����
	 * @param index
	 * @return
	 * @throws DataAccessException
	 */
	public int updateProduct(long index) throws DataAccessException;
	
	/**
	 * ��ǰ ����
	 * @param index
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteProduct(long index) throws DataAccessException;

}
