package kr.co.bturn.order.service;

import java.util.List;

import kr.co.bturn.order.dao.OrderDAO;
import kr.co.bturn.order.model.OrderDTO;

import org.apache.log4j.Logger;

public class OrderServiceImpl implements OrderService {
	
	private Logger log = Logger.getLogger(this.getClass());
	private OrderDAO orderDAO;

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public int calOrder() throws Exception {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int calDeliveryFee(int price) throws Exception {
		if(price < 30000) {
			return 2500;
		} else {
			return 0;
		}
	}

	@Override
	public int calTotalPrice(List<OrderDTO> orderList) throws Exception {
		int totalPrice = 0;
		for(int i = 0; i < orderList.size(); i++) {
			totalPrice += orderList.get(i).getPrice();
		}
		return totalPrice;
	}

	@Override
	public List<OrderDTO> selectOrderList() throws Exception {
		
		return orderDAO.selectOrderList();
	}

	@Override
	public int deleteOrder(long orderNo) throws Exception {
		
		return orderDAO.deleteOrder(orderNo);
	}

}
