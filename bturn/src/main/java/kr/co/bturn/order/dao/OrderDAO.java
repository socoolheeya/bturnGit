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
	 * 주문 추가
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 */
	public int addOrder(OrderDTO dto) throws DataAccessException;
	
	/**
	 * 주문 리스트 선택
	 * @return
	 * @throws DataAccessException
	 */
	public List<OrderDTO> selectOrderList() throws DataAccessException;
	
	/**
	 * 개별 주문 선택
	 * @param orderNo
	 * @return
	 * @throws DataAccessException
	 */
	public OrderDTO selectOrder(long orderNo) throws DataAccessException;
	
	/**
	 * 주문 수정
	 * @param orderNo
	 * @return
	 * @throws DataAccessException
	 */
	public int updateOrder(long orderNo) throws DataAccessException;
	
	/**
	 * 주문 삭제
	 * @param orderNo
	 * @return
	 * @throws DataAccessException
	 */
	public int deleteOrder(long orderNo) throws DataAccessException; 

}
