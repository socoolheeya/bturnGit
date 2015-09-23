package kr.co.bturn.order.dao;

import java.util.List;

import kr.co.bturn.order.model.OrderDTO;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface OrderDAO {
	
	/**
	 * �ֹ� �߰�
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 */
	public int addOrder(OrderDTO dto) throws DataAccessException;
	
	/**
	 * �ֹ� ����Ʈ ����
	 * @return
	 * @throws DataAccessException
	 */
	public List<OrderDTO> selectOrderList() throws DataAccessException;
	
	/**
	 * ���� �ֹ� ����
	 * @param orderNo
	 * @return
	 * @throws DataAccessException
	 */
	public OrderDTO selectOrder(long orderNo) throws DataAccessException;
	
	/**
	 * �ֹ� ����
	 * @param orderNo
	 * @return
	 * @throws DataAccessException
	 */
	public int updateOrder(long orderNo) throws DataAccessException;
	
	/**
	 * �ֹ� ����
	 * @param orderNo
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteOrder(long orderNo) throws DataAccessException; 

}
