package kr.co.bturn.cart.service;

import java.util.List;

import org.apache.log4j.Logger;

import kr.co.bturn.cart.dao.CartDAO;
import kr.co.bturn.cart.model.CartDTO;

public class CartServiceImpl implements CartService {
	
	Logger log = Logger.getLogger(this.getClass());
	private CartDAO cartDAO;
	
	public void setCartDAO(CartDAO cartDAO) {
		this.cartDAO = cartDAO;
	}

	@Override
	public void addCart(CartDTO dto) throws Exception {
		cartDAO.insertCart(dto);
		
	}
	
	@Override
	public List<CartDTO> initCartDeliveryFee(List<CartDTO> cartList) throws Exception {
		List<CartDTO> cartDeliveryFeeList = cartList;
		for(int i = 0; i < cartDeliveryFeeList.size(); i++) {
			boolean isFreeDelivery = cartDeliveryFeeList.get(i).getCartPrice() < cartDeliveryFeeList.get(i).getFreeDeliveryFee();
			if(isFreeDelivery) {
				cartList.get(i).setDeliveryFee(cartDeliveryFeeList.get(i).getBaseDeliveryFee());
			} else {
				cartList.get(i).setDeliveryFee(0);
			}
		}
		return cartDeliveryFeeList;
	}

	@Override
	public List<CartDTO> selectCartList(CartDTO cart) throws Exception {
		return null;
	}

	@Override
	public int calCartTotalPrice(List<CartDTO> cartList) throws Exception {
		int totalPrice = 0;
		for(int i = 0; i < cartList.size(); i++) {
			totalPrice += cartList.get(i).getCartPrice();
		}
		return totalPrice;
	}

	@Override
	public void deleteCartList(List<CartDTO> cartList) throws Exception {
		
		
	}

	@Override
	public CartDTO selectCart(long cartNo) throws Exception {
		return cartDAO.selectCart(cartNo);
	}

	@Override
	public int updateCart(CartDTO dto) throws Exception {
		return cartDAO.updateCart(dto);
	}

	@Override
	public int deleteCart(long cartNo) throws Exception {
		int result = 0;
		try {
			if(cartNo < 0 ) {
				throw new Exception();
			} else {
				result = cartDAO.deleteCart(cartNo);
			}
		} catch(Exception e) {
			log.error("장바구니 상품 삭제 실패", e);
		}
		return result;
	}


	
	

}
