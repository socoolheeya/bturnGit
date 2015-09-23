package kr.co.bturn.order.service;

import java.util.List;

import kr.co.bturn.order.model.OrderDTO;

public interface OrderService {
	
	public int calOrder() throws Exception;
	
	public int calDeliveryFee(int price) throws Exception;
	
	public int calTotalPrice(List<OrderDTO> orderList) throws Exception;
	
	public List<OrderDTO> selectOrderList() throws Exception;
	
	public int deleteOrder(long orderNo) throws Exception;
	
	
}
