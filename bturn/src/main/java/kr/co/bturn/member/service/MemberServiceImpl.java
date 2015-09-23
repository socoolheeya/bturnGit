package kr.co.bturn.member.service;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.Map;

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
	public boolean isLogin(String id) throws SQLException {
		if(isMemberId(id)) {
			if(isPassword(id)) {
				
			}
		}
		return false;
	}

	@Override
	public MemberDTO login(String id) throws SQLException {
		MemberDTO dto = null;
		try {
			if(isMemberId(id)) {
				if(isPassword(id)) {
					dto = memberDAO.getMemberInfo(id);
				}
			}
		} catch(Exception e) {
			log.error("로그인 실패", e);
		}
		return dto;
	}

	@Override
	public String getPassword(String id) throws SQLException {
		
		String password = null;
		try {
			password = memberDAO.getMemberInfo(id).getPassword();
		} catch(Exception e) {
			log.error(e.getMessage(), e);
		}
		
		return password;
	}
	
	@Override
	public boolean isMemberId(String id) throws SQLException {
		boolean flag = false;
		String msg = null;
		Map<String, Object> databox = new HashMap<String, Object>();
		try {
			if(id == null || id.equals("")) {
				flag = false;
				msg = "일치하는 아이디가 없습니다.";
				databox.put("ERROR_MESSAGE", msg);
			} else if(!id.equals(memberDAO.getMemberInfo(id))) {
				flag = false;
				msg = "아이디 입력이 잘못되었습니다. 다시 입력해주세요";
				databox.put("ERROR_MESSAGE", msg);
			} else {
				flag = true;
			}
		} catch(Exception e) {
			log.error(msg, e);
		}
		
		return flag;
	}


	@Override
	public boolean isPassword(String id) throws SQLException {
		
		boolean flag = false;
		
		String dbPassword = memberDAO.getMemberInfo(id).getPassword();
		String password = DigestUtils.md5Digest(getPassword(id).getBytes()).toString();
		
		if(dbPassword.equals(password)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public int updateMemberInfo(String id) throws SQLException {
		int result = 0;
		try {
			result = memberDAO.updateMemberInfo(id);
		} catch(Exception e) {
			result = -1;
			log.error("회원 정보 수정 실패", e);
		}
		
		return result;
	}



}
