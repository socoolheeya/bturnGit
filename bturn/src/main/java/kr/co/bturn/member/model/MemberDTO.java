package kr.co.bturn.member.model;

import java.util.Date;

/**
 * @author LeeWonHee
 * @since 2015.09.18
 */
public class MemberDTO {
	
	private String memberNo; //회원 일련번호
	private String id; //아이디
	private String password; //비밀번호
	private String name; //이름(사업자 대표명)
	private String email; //이메일
	private String tel; //일반전화
	private String phone; //핸드폰번호
	private String address; //주소
	private String birthday; //생일
	private Date joinDate; //가입날짜
	private Date updateDate; //수정날짜
	private String memberType; //ADMIN, PRIVATE_BUYER, BUSINESS_BUYER, BUSINESS_SELLER, PRIVATE_SELLER
	private String deleteFlag; //탈퇴여부
	

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

