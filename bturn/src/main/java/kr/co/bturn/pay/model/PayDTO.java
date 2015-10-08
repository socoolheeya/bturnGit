package kr.co.bturn.pay.model;

import java.util.Date;

/**
 * ���� DTO
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public class PayDTO {
	
	private long payNo; //������ȣ
	private long orderNo; //�ֹ���ȣ
	private long memberNo; //�ֹ�ȸ����ȣ
	private int money; //�����ݾ�
	private String accountNumber; //�������¹�ȣ
	private Date createDate; //������
	private int payStatus; //�������� [����Ȯ�� ��: 1 ����Ȯ�� ��: 2]
	
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
