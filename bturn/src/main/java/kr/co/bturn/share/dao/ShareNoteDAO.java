package kr.co.bturn.share.dao;

import kr.co.bturn.share.model.ShareNoteDTO;

import org.springframework.dao.DataAccessException;

public interface ShareNoteDAO {
	
	public int makeShareNote(ShareNoteDTO dto) throws DataAccessException;
	
	public ShareNoteDTO selectNote(long noteNo) throws DataAccessException;
	
	public int updateNote(long noteNo) throws DataAccessException;
	
	public int deleteNote(long noteNo) throws DataAccessException;

}
