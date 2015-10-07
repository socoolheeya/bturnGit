package kr.co.bturn.order.model;

import java.util.Date;

public class OrderDTO {
	
	private long orderNo; //주문번호
	private long buyerNo; //구매자 회원번호
	private int orderStatus; //주문 상태
	private Date orderDate; //주문 날짜
	private String buyer; //구매자
	private int count; //주문 수량
	private int stock; //상품 재고
	private int price; //주문 가격
	private long sellerNo; //판매자 회원번호
	private long productNo; //주문 상품 번호
	private String image; //주문 상품 이미지
	private String productName; //상품명
	private String sellerId; // 판매자 ID
	private int deliveryFee; //배송비
	private int totalDeliveryFee; //총 배송비
	private int totalPrice; //총 가격
	private int accountNumber; //계좌번호
	
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
