package kr.co.bturn.member.service;

import java.sql.SQLException;

import kr.co.bturn.member.model.MemberDTO;

import org.springframework.ui.Model;

public interface MemberService {
	
	public int join(Model databox, MemberDTO dto) throws SQLException;
	
	public boolean isLogin(Model databox, String email) throws SQLException;
	
	public MemberDTO login(Model databox, String email) throws SQLException;
	
	public String getPassword(Model databox, String email) throws SQLException;
	
	public boolean isPassword(Model databox, String email) throws SQLException;
	
	

}
