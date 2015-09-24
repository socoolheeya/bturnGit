package kr.co.bturn.cart.model;

import java.util.Date;

public class CartDTO {
	
	private long cartNo; //장바구니 번호
	private long productNo; //상품 번호
	private long memberNo; //회원 번호
	private int productAmount; //상품 수량
	private int cartPrice; //장바구니 가격
	private String buyer; //구매자
	private Date createDate; //생성일
	private Date updatDate; //수정일 
	private String updateMember; //수정한 사람
	private String productName; //상품명
	private int deliveryFee; //배송비
	private int totalDeliveryFee; //총 배송비
	private int price; //상품 가격
	private int stock; //상품 재고
	private final int baseDeliveryFee = 2500; //기본 배송료
	private final int freeDeliveryFee = 30000; //무료 배송 기준
	
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
