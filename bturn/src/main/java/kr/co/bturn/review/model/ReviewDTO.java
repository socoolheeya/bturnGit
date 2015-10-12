package kr.co.bturn.review.model;

import java.util.Date;

/**
 * 
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public class ReviewDTO {
	
	private long reviewNo; //���� �Ϸù�ȣ
	private String writer; //�ۼ���
	private String subject; //����
	private String review; //����
	private String image; //����
	private int readCount; //��ȸ��
	private Date createDate; //�ۼ���
	private int replyCount; //��ۼ�
	private int recommendCount; //��õ��
	
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
