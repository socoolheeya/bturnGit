package kr.co.bturn.member.model;

import java.util.Date;

/**
 * @author LeeWonHee
 * @since 2015.09.18
 */
public class MemberDTO {
	
	private String memberNo; //ȸ�� �Ϸù�ȣ
	private String id; //���̵�
	private String password; //��й�ȣ
	private String name; //�̸�(����� ��ǥ��)
	private String email; //�̸���
	private String tel; //�Ϲ���ȭ
	private String phone; //�ڵ�����ȣ
	private String address; //�ּ�
	private String birthday; //����
	private Date joinDate; //���Գ�¥
	private Date updateDate; //������¥
	private String memberType; //ADMIN, PRIVATE_BUYER, BUSINESS_BUYER, BUSINESS_SELLER, PRIVATE_SELLER
	private String deleteFlag; //Ż�𿩺�
	

	public String getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(String memberNo) {
		this.memberNo = memberNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getBirthday() {
		return birthday;
	}
	public void setBirthday(String birthday) {
		this.birthday = birthday;
	}
	public Date getJoinDate() {
		return joinDate;
	}
	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}
	public String getMemberType() {
		return memberType;
	}
	public void setMemberType(String memberType) {
		this.memberType = memberType;
	}
	public String getDeleteFlag() {
		return deleteFlag;
	}
	public void setDeleteFlag(String deleteFlag) {
		this.deleteFlag = deleteFlag;
	}
}

