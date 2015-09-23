package kr.co.bturn.product.model;

import java.util.Date;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public class ProductDTO {
	
	private long productNo; //��ǰ ��ȣ
	private String name; //��ǰ �̸�
	private int price; //��ǰ ����
	private String imageUrl; //��ǰ �̹���
	private int stock; //��ǰ ���
	private String status; //��ǰ ����
	private String description; //��ǰ ����
	private long hitCount; //��ȸ��
	private String sellerId; //�Ǹ��� ID
	private String sellerName; //�Ǹ��� �̸�
	private String sellerContact; //�Ǹ��� ����ó
	private String categoryName; //ī�װ���
	private String returnAddress; //��ǰ �ּ�
	private Date createDate; //��ǰ �����
	
	public long getProductNo() {
		return productNo;
	}
	public void setProductNo(long productNo) {
		this.productNo = productNo;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	public int getStock() {
		return stock;
	}
	public void setStock(int stock) {
		this.stock = stock;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public long getHitCount() {
		return hitCount;
	}
	public void setHitCount(long hitCount) {
		this.hitCount = hitCount;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getSellerName() {
		return sellerName;
	}
	public void setSellerName(String sellerName) {
		this.sellerName = sellerName;
	}
	public String getSellerContact() {
		return sellerContact;
	}
	public void setSellerContact(String sellerContact) {
		this.sellerContact = sellerContact;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getReturnAddress() {
		return returnAddress;
	}
	public void setReturnAddress(String returnAddress) {
		this.returnAddress = returnAddress;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
}
