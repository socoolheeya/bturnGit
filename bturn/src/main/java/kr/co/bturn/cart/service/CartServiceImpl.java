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
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void deleteCartList(List<CartDTO> cartList) throws Exception {
		
	}

	@Override
	public CartDTO selectCart(int cartNo) throws Exception {
		return cartDAO.selectCart(cartNo);
	}

	@Override
	public int updateCart(int cartNo) throws Exception {
		return cartDAO.updateCart(cartNo);
	}

	@Override
	public int deleteCart(int cartNo) throws Exception {
		return cartDAO.deleteCart(cartNo);
	}


	
	

}
