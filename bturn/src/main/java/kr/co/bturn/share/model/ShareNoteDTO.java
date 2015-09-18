package kr.co.bturn.share.model;

import java.util.Date;
import java.util.List;

public class ShareNoteDTO {
	
	private long noteNo;
	private String noteName;
	private String note;
	private String noteCover;
	private List<ContentDTO> contentList;
	private Date createDate;
	
	
	public ShareNoteDTO() {
		
	}

	public ShareNoteDTO(long noteNo, String noteName, String note,
			String noteCover, List<ContentDTO> contentList, Date createDate) {
		super();
		this.noteNo = noteNo;
		this.noteName = noteName;
		this.note = note;
		this.noteCover = noteCover;
		this.contentList = contentList;
		this.createDate = createDate;
	}

	public List<ContentDTO> getContentList() {
		return contentList;
	}

	public void setContentList(List<ContentDTO> contentList) {
		this.contentList = contentList;
	}	
	public Date getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	public long getNoteNo() {
		return noteNo;
	}

	public void setNoteNo(long noteNo) {
		this.noteNo = noteNo;
	}

	public String getNoteName() {
		return noteName;
	}

	public void setNoteName(String noteName) {
		this.noteName = noteName;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public String getNoteCover() {
		return noteCover;
	}

	public void setNoteCover(String noteCover) {
		this.noteCover = noteCover;
	}
	
}