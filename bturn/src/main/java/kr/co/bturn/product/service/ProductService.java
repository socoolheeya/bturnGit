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
	 * ��ǰ �߰�
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int addProduct(ProductDTO dto) throws Exception;
	
	/**
	 * ���� ��ǰ �� ����
	 * @param productNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public ProductDTO selectProduct(long productNo) throws Exception;
	
	/**
	 * ����ȭ�� ��ü ��ǰ ����Ʈ ��������
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.05
	 */
	public List<ProductDTO> selectProductList() throws Exception;
	
	/**
	 * ��ǰ ����
	 * @param productNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int updateProduct(long productNo) throws Exception;
	
	/**
	 * ��ǰ ����
	 * @param productNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public int deleteProduct(long productNo) throws Exception;
	
	/**
	 * ��ǰ ��õ ����
	 * @param productNo
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.11
	 */
	public void updateRecommendCount(long productNo, HttpSession session, HttpServletRequest request) throws Exception;

}
