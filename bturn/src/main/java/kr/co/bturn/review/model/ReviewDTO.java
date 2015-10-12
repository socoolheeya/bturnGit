package kr.co.bturn.review.model;

import java.util.Date;

/**
 * 
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public class ReviewDTO {
	
	private long reviewNo; //리뷰 일련번호
	private String writer; //작성자
	private String subject; //제목
	private String review; //내용
	private String image; //사진
	private int readCount; //조회수
	private Date createDate; //작성일
	private int replyCount; //댓글수
	private int recommendCount; //추천수
	
	public long getReviewNo() {
		return reviewNo;
	}
	public void setReviewNo(long reviewNo) {
		this.reviewNo = reviewNo;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	public int getReadCount() {
		return readCount;
	}
	public void setReadCount(int readCount) {
		this.readCount = readCount;
	}
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public int getReplyCount() {
		return replyCount;
	}
	public void setReplyCount(int replyCount) {
		this.replyCount = replyCount;
	}
	public int getRecommendCount() {
		return recommendCount;
	}
	public void setRecommendCount(int recommendCount) {
		this.recommendCount = recommendCount;
	}
	
	

}
