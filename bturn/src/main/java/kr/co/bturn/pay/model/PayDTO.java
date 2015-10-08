package kr.co.bturn.pay.model;

import java.util.Date;

/**
 * 결제 DTO
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public class PayDTO {
	
	private long payNo; //결제번호
	private long orderNo; //주문번호
	private long memberNo; //주문회원번호
	private int money; //결제금액
	private String accountNumber; //결제계좌번호
	private Date createDate; //결제일
	private int payStatus; //결제상태 [결제확인 전: 1 결제확인 후: 2]
	
	public long getPayNo() {
		return payNo;
	}
	public void setPayNo(long payNo) {
		this.payNo = payNo;
	}
	public long getOrderNo() {
		return orderNo;
	}
	public void setOrderNo(long orderNo) {
		this.orderNo = orderNo;
	}
	public long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public String getAccountNumber() {
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber) {
		this.accountNumber = accountNumber;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getPayStatus() {
		return payStatus;
	}
	public void setPayStatus(int payStatus) {
		this.payStatus = payStatus;
	}
}
