package kr.co.bturn.member.dao;

import kr.co.bturn.member.model.MemberDTO;

import org.springframework.dao.DataAccessException;
import org.springframework.ui.Model;

public interface MemberDAO {
	
	public int join(Model databox, MemberDTO dto) throws DataAccessException;
	
	public MemberDTO getMemberInfo(Model databox, String email) throws DataAccessException;
	
	public int updateMemberInfo(Model databox, String email) throws DataAccessException;
	
	public int deleteMember(Model databox, String email) throws DataAccessException;
	
	

}
