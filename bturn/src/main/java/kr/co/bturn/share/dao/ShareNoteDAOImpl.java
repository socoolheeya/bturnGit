package kr.co.bturn.share.dao;

import kr.co.bturn.share.model.ShareNoteDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.springframework.dao.DataAccessException;

public class ShareNoteDAOImpl implements ShareNoteDAO {
	
	private Logger logger;
	private SqlSessionTemplate sqlMap;
	
	public ShareNoteDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int makeShareNote(ShareNoteDTO dto) throws DataAccessException {
		int result = 0;
		try {
			
			result = sqlMap.insert("insertNote", dto);
			sqlMap.commit();
		} catch(Exception e) {
			result = -1;
			logger.error(e.getMessage(), e);
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		return result;
	}

	@Override
	public ShareNoteDTO selectNote(long noteNo) throws DataAccessException {
		ShareNoteDTO dto = null;
		try {
			dto = sqlMap.selectOne("selectNote", noteNo);
			sqlMap.commit();
		} catch(Exception e) {
			logger.error(e.getMessage(), e);
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		
		return dto;
	}

	@Override
	public int updateNote(long noteNo) throws DataAccessException {
		int result = 0;
		try {
			result = sqlMap.update("updateNote", noteNo);
			sqlMap.commit();
		} catch(Exception e) {
			logger.error(e.getMessage(), e);
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		return result;
	}

	@Override
	public int deleteNote(long noteNo) throws DataAccessException {
		int result = 0;
		try {
			result = sqlMap.delete("deleteNote", noteNo);
			sqlMap.commit();
		} catch(Exception e) {
			logger.error(e.getMessage(), e);
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		return result;
	}

}