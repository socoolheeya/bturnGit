package kr.co.bturn.household.service;

import kr.co.bturn.household.dao.HouseholdDAO;
import kr.co.bturn.household.model.HouseholdAccountDTO;

public class HouseholdServiceImpl implements HouseholdService {
	
	private HouseholdDAO householdDAO;

	public void setHouseholdDAO(HouseholdDAO householdDAO) {
		this.householdDAO = householdDAO;
	}

	@Override
	public int makeHouseholdAccount(HouseholdAccountDTO dto) throws Exception {
		int result =  0;
		try {
			result = householdDAO.makeHouseholdAccount(dto); 
		} catch(Exception e) {
			result = -1;
		}
		return result;
	}

}
