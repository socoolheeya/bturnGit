package kr.co.bturn.order.service;

import java.util.List;

import kr.co.bturn.order.model.OrderDTO;

/**
 * 주문 관리 서비스
 * @author LeeWonHee
 * @since 2015.09.23
 */
public interface OrderService {
	
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int calOrder(int price, List<OrderDTO> orderList) throws Exception;
	
	/**
	 * 
	 * @param price
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int calDeliveryFee(int price) throws Exception;
	
	/**
	 * 
	 * @param orderList
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int calTotalPrice(List<OrderDTO> orderList) throws Exception;
	/**
	 * 
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public List<OrderDTO> selectOrderList() throws Exception;
	
	/**
	 * 최근 3달 동안의 주문 내역
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.07
	 */
	public List<OrderDTO> selectOrderListDuringThreeMonth() throws Exception;
	
	/**
	 * 주문 수정
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.07
	 */
	public int updateOrder(long orderNo) throws Exception;
	
	/**
	 * 주문 삭제
	 * @param orderNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int deleteOrder(long orderNo) throws Exception;
	
	
}
