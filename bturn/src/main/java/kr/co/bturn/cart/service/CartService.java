package kr.co.bturn.cart.service;

import java.util.List;

import kr.co.bturn.cart.model.CartDTO;

/**
 * ��ٱ��� ����
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface CartService {
	
	/**
	 * ��ٱ��� ��ǰ �߰�
	 * @param dto
	 * @throws Exception
	 */
	public void addCart(CartDTO dto) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ ��ۺ� ���
	 * @param cartList
	 * @return
	 * @throws Exception
	 */
	public List<CartDTO> initCartDeliveryFee(List<CartDTO> cartList) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ ��ü ����
	 * @param cart
	 * @return
	 * @throws Exception
	 */
	public List<CartDTO> selectCartList(CartDTO cart) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ ��ü ���
	 * @param cartList
	 * @return
	 * @throws Exception
	 */
	public int calCartTotalPrice(List<CartDTO> cartList) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ ��ü ����
	 * @param cartList
	 * @throws Exception
	 */
	public void deleteCartList(List<CartDTO> cartList) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ ���� ����
	 * @param cartNo
	 * @return
	 * @throws Exception
	 */
	public CartDTO selectCart(int cartNo) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ �ɼ� ����
	 * @param cartNo
	 * @return
	 * @throws Exception
	 */
	public int updateCart(int cartNo) throws Exception;
	
	/**
	 * ��ٱ��� ��ǰ ���� ����
	 * @param cartNo
	 * @return
	 * @throws Exception
	 */
	public int deleteCart(int cartNo) throws Exception;
}