package kr.co.bturn.cart.dao;

import java.util.List;

import kr.co.bturn.cart.model.CartDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

public class CartDAOImpl implements CartDAO {
	
	private SqlSessionTemplate sqlMap;

	public CartDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int insertCart(CartDTO dto) throws DataAccessException {
		return sqlMap.insert("insertCart", dto);
	}

	@Override
	public List<CartDTO> selectCartList(CartDTO dto) throws DataAccessException {
		return sqlMap.selectList("selectCartList", dto);
	}

	@Override
	public CartDTO selectCart(long cartNo) throws DataAccessException {
		return sqlMap.selectOne("selectCart", cartNo);
	}

	@Override
	public int updateCart(long cartNo) throws DataAccessException {
		return sqlMap.update("updateCart", cartNo);
	}

	@Override
	public int deleteCart(long cartNo) throws DataAccessException {
		return sqlMap.delete("deleteCart", cartNo);
	}

}