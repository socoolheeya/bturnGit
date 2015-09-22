package kr.co.bturn.member.service;

import java.sql.SQLException;

import kr.co.bturn.member.dao.MemberDAO;
import kr.co.bturn.member.model.MemberDTO;

import org.apache.log4j.Logger;
import org.springframework.util.DigestUtils;

public class MemberServiceImpl implements MemberService {
	
	private Logger log = Logger.getLogger(this.getClass());
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public int join(MemberDTO dto) throws SQLException {
	
		int result = 0;
		try {
			if(dto != null || !"".equals(dto)) {			
				result = memberDAO.join(dto);
			}	
		} catch(Exception e) {			
			result = -1;
			log.error(e.getMessage(), e);
		}
		
		return result;
		
	}

	@Override
	public boolean isLogin(String email) throws SQLException {

		if(isPassword(email)) {
			
		}
		return false;
	}

	@Override
	public MemberDTO login(String email) throws SQLException {
		
		MemberDTO dto = null;
		
		if(isPassword(email)) {
			dto = memberDAO.getMemberInfo(email);
			
		}
		return dto;
	}

	@Override
	public String getPassword(String email) throws SQLException {
		
		String password = null;
		try {
			password = memberDAO.getMemberInfo(email).getPassword();
		} catch(Exception e) {
			log.error(e.getMessage(), e);
		}
		
		return password;
	}

	@Override
	public boolean isPassword(String email) throws SQLException {
		
		boolean flag = false;
		
		String dbPassword = memberDAO.getMemberInfo(email).getPassword();
		String password = DigestUtils.md5Digest(getPassword(email).getBytes()).toString();
		
		if(dbPassword.equals(password)) {
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
		
	}

}
