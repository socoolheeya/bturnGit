package kr.co.bturn.order.service;

import java.util.List;

import kr.co.bturn.order.model.OrderDTO;

/**
 * �ֹ� ���� ����
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
	 * �ֱ� 3�� ������ �ֹ� ����
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.07
	 */
	public List<OrderDTO> selectOrderListDuringThreeMonth() throws Exception;
	
	/**
	 * �ֹ� ����
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.07
	 */
	public int updateOrder(long orderNo) throws Exception;
	
	/**
	 * �ֹ� ����
	 * @param orderNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int deleteOrder(long orderNo) throws Exception;
	
	
}
