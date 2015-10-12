package kr.co.bturn.recommend.model;

/**
 * 추천 DTO
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public class RecommendDTO {
	
	private long recommendNo; //추천 일련번호
	private long memberNo; //추천인 일련번호
	private String id; //추천인
	private long contentNo; //추천한 글
	private int count; //추천 수
	
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
