package kr.co.bturn.order.service;

import java.util.List;

import kr.co.bturn.order.dao.OrderDAO;
import kr.co.bturn.order.model.OrderDTO;

public class OrderServiceImpl implements OrderService {
	
	private OrderDAO orderDAO;

	public void setOrderDAO(OrderDAO orderDAO) {
		this.orderDAO = orderDAO;
	}

	@Override
	public int calOrder(int price, List<OrderDTO> orderList) throws Exception {
		int totalPrice = calTotalPrice(orderList);
		int deliveryFee = calDeliveryFee(price);
		
		return totalPrice + deliveryFee;
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
	public List<OrderDTO> selectOrderListDuringThreeMonth() throws Exception {
		return orderDAO.selectOrderListDuringThreeMonth();
	}
	
	@Override
	public int updateOrder(long orderNo) throws Exception {
		return orderDAO.updateOrder(orderNo);
	}

	@Override
	public int deleteOrder(long orderNo) throws Exception {
		return orderDAO.deleteOrder(orderNo);
	}
}