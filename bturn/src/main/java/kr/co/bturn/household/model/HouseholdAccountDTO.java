package kr.co.bturn.household.model;

import java.util.Date;

/**
 * @since 2015.09.19
 * @author LeeWonHee
 * @version 0.1
 * 
 * 가계부 DTO 클래스 입니다.
 */
public class HouseholdAccountDTO {
	
	private long index;
	private String name;
	private String title;
	private String cover;
	private Date createDate;
	private Date updateDate;
	
	
	public long getIndex() {
		return index;
	}
	public void setIndex(long index) {
		this.index = index;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getCover() {
		return cover;
	}
	public void setCover(String cover) {
		this.cover = cover;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public Date getUpdateDate() {
		return updateDate;
	}
	public void setUpdateDate(Date updateDate) {
		this.updateDate = updateDate;
	}

}
