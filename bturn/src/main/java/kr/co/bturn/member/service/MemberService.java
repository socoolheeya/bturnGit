package kr.co.bturn.member.service;

import java.sql.SQLException;

import kr.co.bturn.member.model.MemberDTO;

public interface MemberService {
	
	public int join(MemberDTO dto) throws SQLException;
	
	public boolean isLogin(String id) throws SQLException;
	
	public MemberDTO login(String id) throws SQLException;
	
	public String getPassword(String id) throws SQLException;
	
	public boolean isMemberId(String id) throws SQLException;
	
	public boolean isPassword(String id) throws SQLException;
	
	public int updateMemberInfo(String id) throws SQLException;
	
	

}
