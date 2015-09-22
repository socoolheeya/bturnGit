package kr.co.bturn.member.service;

import java.sql.SQLException;

import kr.co.bturn.member.model.MemberDTO;

public interface MemberService {
	
	public int join(MemberDTO dto) throws SQLException;
	
	public boolean isLogin(String email) throws SQLException;
	
	public MemberDTO login(String email) throws SQLException;
	
	public String getPassword(String email) throws SQLException;
	
	public boolean isPassword(String email) throws SQLException;
	
	

}
