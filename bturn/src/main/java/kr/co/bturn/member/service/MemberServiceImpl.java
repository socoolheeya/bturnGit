package kr.co.bturn.member.service;

import java.sql.SQLException;

import javax.annotation.Resource;

import kr.co.bturn.member.dao.MemberDAO;
import kr.co.bturn.member.model.MemberDTO;
import kr.co.bturn.util.constants.Login;

import org.apache.log4j.Logger;
import org.springframework.ui.Model;
import org.springframework.util.DigestUtils;
import org.springframework.util.StringUtils;

public class MemberServiceImpl implements MemberService {

	private Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="memberDAO")
	private MemberDAO memberDAO;
	
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public int join(String queryId, MemberDTO dto) throws Exception {

		int result = 0;
		try {
			if (dto != null || !"".equals(dto)) {
				String password = DigestUtils.md5Digest(dto.getPassword().getBytes()).toString();
				dto.setPassword(password);
				dto.setMemberType("ADMIN");
				result = memberDAO.join(queryId, dto);
			}
		} catch (Exception e) {
			result = -1;
			log.error(e.getMessage(), e);
		}

		return result;

	}

	@Override
	public boolean checkPassword(String queryId, String id, String password) throws Exception {
		boolean flag = false;

		String dbPassword = memberDAO.getMemberInfo(queryId, id).getPassword();
		String md5pwd = DigestUtils.md5Digest(password.getBytes()).toString();
		log.debug("md5_pwd"+md5pwd);

		if (dbPassword.equals(md5pwd)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;
	}

	@Override
	public int checkLoginInfo(String queryId, String id, String password) throws Exception {
		int result = -1;
		if(StringUtils.isEmpty(memberDAO.getMemberInfo(queryId, id).getId())) {
			result =  Login.NOT_ID.ordinal();
			if(!checkPassword(queryId, id, password)) {
				result = Login.NOT_PASSWORD.ordinal();
			} else {
				 result = Login.LOGIN_OK.ordinal();
			}
		}
		return result;
	}
	
	@Override
	public MemberDTO login(String queryId, String id, String password, Model databox) throws Exception {
		MemberDTO dto = null;
		try {
			if(!StringUtils.isEmpty(memberDAO.getMemberInfo(queryId, id).getId())) {
				if(checkPassword(queryId, id, password)) {
					dto = memberDAO.getMemberInfo(queryId, id);
				}
			}			
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return dto;
	}
	
	@Override
	public int updateMemberInfo(String queryId, String id) throws SQLException {
		int result = 0;
		try {
			result = memberDAO.updateMemberInfo(queryId, id);
		} catch (Exception e) {
			result = -1;
			log.error("회원 정보 수정 실패", e);
		}

		return result;
	}

}
