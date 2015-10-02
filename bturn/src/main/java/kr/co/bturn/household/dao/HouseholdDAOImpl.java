package kr.co.bturn.household.dao;

import kr.co.bturn.household.model.HouseholdAccountDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.slf4j.Logger;
import org.springframework.dao.DataAccessException;

public class HouseholdDAOImpl implements HouseholdDAO {
	
	private Logger logger;
	private SqlSessionTemplate sqlMap;
	
	public HouseholdDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int makeHouseholdAccount(HouseholdAccountDTO dto) throws DataAccessException {
		
		int result = 0;
		try {
			result = sqlMap.insert("insertHousehold", dto);
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
	public HouseholdAccountDTO selectHouseholdAccount(long index) throws DataAccessException {
		HouseholdAccountDTO dto  = null;
		try {
			dto = sqlMap.selectOne("selectHousehold", index);
			sqlMap.commit();
		} catch(Exception e) {
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		
		return dto;
	}

	@Override
	public int updateHouseholdAccount(long index) throws DataAccessException {
		int result = 0;
		try {
			result = sqlMap.update("updateHousehold", index);
			sqlMap.commit();
		} catch(Exception e) {
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		return result;
	}

	@Override
	public int deleteHouseholdAccount(long index) throws DataAccessException {
		int result = 0;
		try {
			result = sqlMap.delete("deleteHousehold", index);
			sqlMap.commit();
		} catch(Exception e) {
			sqlMap.rollback();
		} finally {
			sqlMap.close();
		}
		return result;
	}

}
