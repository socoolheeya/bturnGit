package kr.co.bturn.order.model;

import java.util.Date;

public class OrderDTO {
	
	private long orderNo; //�ֹ���ȣ
	private long buyerNo; //������ ȸ����ȣ
	private int orderStatus; //�ֹ� ����
	private Date orderDate; //�ֹ� ��¥
	private String buyer; //������
	private int count; //�ֹ� ����
	private int stock; //��ǰ ���
	private int price; //�ֹ� ����
	private long sellerNo; //�Ǹ��� ȸ����ȣ
	private long productNo; //�ֹ� ��ǰ ��ȣ
	private String image; //�ֹ� ��ǰ �̹���
	private String productName; //��ǰ��
	private String sellerId; // �Ǹ��� ID
	private int deliveryFee; //��ۺ�
	private int totalDeliveryFee; //�� ��ۺ�
	private int totalPrice; //�� ����
	private int accountNumber; //���¹�ȣ
	
	public long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}
	public long getBuyerNo() {
		return buyerNo;
	}
	public void setBuyerNo(long buyerNo) {
		this.buyerNo = buyerNo;
	}
	public int getOrderStatus() {
		return orderStatus;
	}
	public void setOrderStatus(int orderStatus) {
		this.orderStatus = orderStatus;
	}
	public Date getOrderDate() {
		return orderDate;
	}
	public void setOrderDate(Date orderDate) {
		this.orderDate = orderDate;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public long getSellerNo() {
		return sellerNo;
	}
	public void setSellerNo(long sellerNo) {
		this.sellerNo = sellerNo;
	}
	public long getProductNo() {
		return productNo;
	}
	public void setProductNo(long productNo) {
		this.productNo = productNo;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public int getDeliveryFee() {
		return deliveryFee;
	}
	public void setDeliveryFee(int deliveryFee) {
		this.deliveryFee = deliveryFee;
	}
	public int getTotalDeliveryFee() {
		return totalDeliveryFee;
	}
	public void setTotalDeliveryFee(int totalDeliveryFee) {
		this.totalDeliveryFee = totalDeliveryFee;
	}
	public int getTotalPrice() {
		return totalPrice;
	}
	public void setTotalPrice(int totalPrice) {
		this.totalPrice = totalPrice;
	}
	public int getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}
	
}
