package kr.co.bturn.cart.service;

import java.util.List;

import kr.co.bturn.cart.model.CartDTO;

/**
 * 장바구니 서비스
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface CartService {
	
	/**
	 * 장바구니 상품 추가
	 * @param dto
	 * @throws Exception
	 */
	public void addCart(CartDTO dto) throws Exception;
	
	/**
	 * 장바구니 상품 배송비 계산
	 * @param cartList
	 * @return
	 * @throws Exception
	 */
	public List<CartDTO> initCartDeliveryFee(List<CartDTO> cartList) throws Exception;
	
	/**
	 * 장바구니 상품 전체 선택
	 * @param cart
	 * @return
	 * @throws Exception
	 */
	public List<CartDTO> selectCartList(CartDTO cart) throws Exception;
	
	/**
	 * 장바구니 상품 전체 계산
	 * @param cartList
	 * @return
	 * @throws Exception
	 */
	public int calCartTotalPrice(List<CartDTO> cartList) throws Exception;
	
	/**
	 * 장바구니 상품 전체 삭제
	 * @param cartList
	 * @throws Exception
	 */
	public void deleteCartList(List<CartDTO> cartList) throws Exception;
	
	/**
	 * 장바구니 상품 개별 선택
	 * @param cartNo
	 * @return
	 * @throws Exception
	 */
	public CartDTO selectCart(long cartNo) throws Exception;
	
	/**
	 * 장바구니 상품 옵션 변경
	 * @param cartNo
	 * @return
	 * @throws Exception
	 */
	public int updateCart(CartDTO dto) throws Exception;
	
	/**
	 * 장바구니 상품 개별 삭제
	 * @param cartNo
	 * @return
	 * @throws Exception
	 */
	public int deleteCart(long cartNo) throws Exception;
}