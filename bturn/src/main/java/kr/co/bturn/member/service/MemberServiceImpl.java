package kr.co.bturn.member.service;

import java.sql.SQLException;

import kr.co.bturn.member.dao.MemberDAO;
import kr.co.bturn.member.model.MemberDTO;

import org.slf4j.Logger;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;

public class MemberServiceImpl implements MemberService {
	
	private Logger logger;
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	@Override
	public int join(Model databox, MemberDTO dto) throws SQLException {
	
		int result = 0;
		try {
			if(dto != null || !"".equals(dto)) {			
				result = memberDAO.join(databox, dto);
			}	
		} catch(Exception e) {			
			result = -1;
			logger.error(e.getMessage(), e); 
		}
		
		return result;
		
	}

	@Override
	public boolean isLogin(Model databox, String email) throws SQLException {

		if(isPassword(databox, email)) {
			
		}
		return false;
	}

	@Override
	public MemberDTO login(Model databox, String email) throws SQLException {
		
		MemberDTO dto = null;
		
		if(isPassword(databox, email)) {
			dto = memberDAO.getMemberInfo(databox, email);
			
		}
		return dto;
	}

	@Override
	public String getPassword(Model databox, String email) throws SQLException {
		
		String password = null;
		try {
			password = memberDAO.getMemberInfo(databox, email).getPassword();
		} catch(Exception e) {
			e.printStackTrace();
			databox.addAttribute("ERROR_MESSGE", e.getMessage()); 
		}
		
		return password;
	}

	@Override
	public boolean isPassword(Model databox, String email) throws SQLException {
		
		boolean flag = false;
		
		String dbPassword = memberDAO.getMemberInfo(databox, email).getPassword();
		String password = DigestUtils.md5Digest(getPassword(databox, email).getBytes()).toString();
		
		if(dbPassword.equals(password)) {
			flag = true;
		} else {
			flag = false;
		}
		
		return flag;
		
	}

}
