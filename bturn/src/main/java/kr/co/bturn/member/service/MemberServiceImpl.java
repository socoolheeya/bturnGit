package kr.co.bturn.member.service;

import javax.annotation.Resource;

import kr.co.bturn.member.dao.MemberDAO;
import kr.co.bturn.member.model.MemberDTO;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.springframework.security.authentication.encoding.Md5PasswordEncoder;

public class MemberServiceImpl implements MemberService {

	private Log log = LogFactory.getLog(this.getClass());

	@Resource(name = "memberDAO")
	private MemberDAO memberDAO;

	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}

	@Override
	public int join(MemberDTO dto) throws Exception {
		String queryId = "회원 가입 서비스";
		int result = 0;
		try {
			if (dto != null || !"".equals(dto)) {
				Md5PasswordEncoder encoder = new Md5PasswordEncoder();
				String password = encoder.encodePassword("password", dto.getPassword());
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
		Md5PasswordEncoder encoder = new Md5PasswordEncoder();
		MemberDTO dto = memberDAO.getMemberInfo(queryId, id);
		String dbPassword = dto.getPassword(); 
		String md5pwd = encoder.encodePassword("password", password);

		if (dbPassword.equals(md5pwd)) {
			flag = true;
			log.debug("\t #########비밀번호 체크 성공########## \t");
		} else {
			flag = false;
			log.debug("\t #########비밀번호 체크 실패########## \t");
		}
		return flag;
	}

	@Override
	public MemberDTO checkLoginInfo(String queryId, String id, String password) throws Exception {
		MemberDTO dto = null;
		if (checkPassword(queryId, id, password)) {
			dto = memberDAO.getMemberInfo(queryId, id);
		}

		return dto;
	}

	@Override
	public MemberDTO login(String id, String password) throws Exception {
		String queryId = "로그인 체크 서비스";
		MemberDTO dto = checkLoginInfo(queryId, id, password);

		return dto;
	}

	@Override
	public int updateMemberInfo(String id) throws Exception {
		int result = 0;
		String queryId = "MemberServiceImpl updateMemberInfo 사용자 정보 수정 서비스";
		try {
			result = memberDAO.updateMemberInfo(queryId, id);
		} catch (Exception e) {
			result = -1;
			log.error("회원 정보 수정 실패", e);
		}

		return result;
	}

	@Override
	public MemberDTO getMemberInfo(String id) throws Exception {
		String queryId = "MemberServiceImpl getMemberInfo() 사용자정보가져오기";
		return memberDAO.getMemberInfo(queryId, id);
	}

}
