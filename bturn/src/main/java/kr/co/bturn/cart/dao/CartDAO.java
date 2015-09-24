package kr.co.bturn.cart.dao;

import java.util.List;

import kr.co.bturn.cart.model.CartDTO;

import org.springframework.dao.DataAccessException;

public interface CartDAO {
	
	public int insertCart(CartDTO dto) throws DataAccessException;
	
	public List<CartDTO> selectCartList(CartDTO dto) throws DataAccessException;
	
	public CartDTO selectCart(long cartNo) throws DataAccessException;
	
	public int updateCart(long cartNo) throws DataAccessException;
	
	public int deleteCart(long cartNo) throws DataAccessException;

}
