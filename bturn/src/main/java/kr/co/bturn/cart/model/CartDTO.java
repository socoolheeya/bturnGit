package kr.co.bturn.cart.model;

import java.util.Date;

public class CartDTO {
	
	private long cartNo; //��ٱ��� ��ȣ
	private long productNo; //��ǰ ��ȣ
	private long memberNo; //ȸ�� ��ȣ
	private int productAmount; //��ǰ ����
	private int cartPrice; //��ٱ��� ����
	private String buyer; //������
	private Date createDate; //������
	private Date updatDate; //������ 
	private String updateMember; //������ ���
	private String productName; //��ǰ��
	private int deliveryFee; //��ۺ�
	private int totalDeliveryFee; //�� ��ۺ�
	private int price; //��ǰ ����
	private int stock; //��ǰ ���
	private final int baseDeliveryFee = 2500; //�⺻ ��۷�
	private final int freeDeliveryFee = 30000; //���� ��� ����
	
	public long getCartNo() {
		return cartNo;
	}
	public void setCartNo(long cartNo) {
		this.cartNo = cartNo;
	}
	public long getProductNo() {
		return productNo;
	}
	public void setProductNo(long productNo) {
		this.productNo = productNo;
	}
	public long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}
	public int getProductAmount() {
		return productAmount;
	}
	public void setProductAmount(int productAmount) {
		this.productAmount = productAmount;
	}
	public int getCartPrice() {
		return cartPrice;
	}
	public void setCartPrice(int cartPrice) {
		this.cartPrice = cartPrice;
	}
	public String getBuyer() {
		return buyer;
	}
	public void setBuyer(String buyer) {
		this.buyer = buyer;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdatDate() {
		return updatDate;
	}
	public void setUpdatDate(Date updatDate) {
		this.updatDate = updatDate;
	}
	public String getUpdateMember() {
		return updateMember;
	}
	public void setUpdateMember(String updateMember) {
		this.updateMember = updateMember;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
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
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public int getBaseDeliveryFee() {
		return baseDeliveryFee;
	}
	public int getFreeDeliveryFee() {
		return freeDeliveryFee;
	}
}
