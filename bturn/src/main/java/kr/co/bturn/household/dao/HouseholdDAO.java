package kr.co.bturn.household.dao;

import kr.co.bturn.household.model.HouseholdAccountDTO;

import org.springframework.dao.DataAccessException;

public interface HouseholdDAO {
	
	public int makeHouseholdAccount(HouseholdAccountDTO dto) throws DataAccessException;
	
	public HouseholdAccountDTO selectHouseholdAccount(long index) throws DataAccessException;
	
	public int updateHouseholdAccount(long index) throws DataAccessException;
	
	public int deleteHouseholdAccount(long index) throws DataAccessException;

}
