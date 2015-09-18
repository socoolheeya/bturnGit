package kr.co.bturn.share.model;

import java.util.Date;

public class ContentDTO {
	
	private long contentNo;
	private String title;
	private String writer;
	private String content;
	private Date writeDate;
	
	public ContentDTO() {
		
	}
	
	public ContentDTO(long contentNo, String title, String writer, String content,
			Date writeDate) {
		super();
		this.contentNo = contentNo;
		this.title = title;
		this.writer = writer;
		this.content = content;
		this.writeDate = writeDate;
	}


	public long getContentNo() {
		return contentNo;
	}
	public void setContentNo(long contentNo) {
		this.contentNo = contentNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getWriter() {
		return writer;
	}
	public void setWriter(String writer) {
		this.writer = writer;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Date getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(Date writeDate) {
		this.writeDate = writeDate;
	}
}
