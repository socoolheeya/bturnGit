package kr.co.bturn.member.service;

import kr.co.bturn.member.model.MemberDTO;

import org.springframework.ui.Model;

public interface MemberService {
	
	public int join(String queryId, MemberDTO dto) throws Exception;
	
	public boolean checkPassword(String queryId, String id, String password) throws Exception;
	
	public int checkLoginInfo(String queryId, String id, String password) throws Exception;
	
	public MemberDTO login(String queryId, String id, String password, Model databox) throws Exception;
	
	public int updateMemberInfo(String queryId, String id) throws Exception;
	
	

}
