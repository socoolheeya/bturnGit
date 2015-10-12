package kr.co.bturn.recommend.model;

/**
 * ��õ DTO
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public class RecommendDTO {
	
	private long recommendNo; //��õ �Ϸù�ȣ
	private long memberNo; //��õ�� �Ϸù�ȣ
	private String id; //��õ��
	private long contentNo; //��õ�� ��
	private int count; //��õ ��
	
	public long getRecommendNo() {
		return recommendNo;
	}
	public void setRecommendNo(long recommendNo) {
		this.recommendNo = recommendNo;
	}
	public long getMemberNo() {
		return memberNo;
	}
	public void setMemberNo(long memberNo) {
		this.memberNo = memberNo;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public long getContentNo() {
		return contentNo;
	}
	public void setContentNo(long contentNo) {
		this.contentNo = contentNo;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}

	
}
