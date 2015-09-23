package kr.co.bturn.member.dao;

import kr.co.bturn.member.model.MemberDTO;

import org.springframework.dao.DataAccessException;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public interface MemberDAO {
	
	public int join(MemberDTO dto) throws DataAccessException;
	
	public MemberDTO getMemberInfo(String id) throws DataAccessException;
	
	public int updateMemberInfo(String id) throws DataAccessException;
	
	public int deleteMember(String id) throws DataAccessException;
	
	

}
