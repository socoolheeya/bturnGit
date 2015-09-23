package kr.co.bturn.order.dao;

import java.util.List;

import kr.co.bturn.order.model.OrderDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

public class OrderDAOImpl implements OrderDAO {
	
	private SqlSessionTemplate sqlMap;

	public OrderDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int addOrder(OrderDTO dto) throws DataAccessException {
		return sqlMap.insert("insertOrder", dto);
	}

	@Override
	public List<OrderDTO> selectOrderList() throws DataAccessException {
		return sqlMap.selectList("selectOrderList");
	}

	@Override
	public OrderDTO selectOrder(long orderNo) throws DataAccessException {
		return sqlMap.selectOne("selectOrder", orderNo);
	}

	@Override
	public int updateOrder(long orderNo) throws DataAccessException {
		return sqlMap.update("updateOrder", orderNo);
	}

	@Override
	public int deleteOrder(long orderNo) throws DataAccessException {
		return sqlMap.delete("deleteOrder", orderNo);
	}

}
