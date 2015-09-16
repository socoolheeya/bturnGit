package kr.co.bturn.member.dao;

import kr.co.bturn.member.model.MemberDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;

public class MemberDAOImpl implements MemberDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public void setSqlMap(SqlSessionTemplate sqlMap) {
		this.sqlMap = sqlMap;
	}
	
	@Override
	public int join(Model databox, MemberDTO dto) throws DataAccessException {
		int result = -1;
		try {
			result = sqlMap.insert("insertMember", dto);
		} catch (Exception e) {
			e.printStackTrace();
			databox.addAttribute("ERROR_MESSAGE", e.getMessage());
		}

		return result;
	}

	@Override
	public MemberDTO getMemberInfo(Model databox, String email) throws DataAccessException {

		MemberDTO dto = null;
		try {
			if(StringUtils.isEmpty(email)) {
				return dto;
			}
			dto = sqlMap.selectOne("selectMember", email);

		} catch (Exception e) {
			e.printStackTrace();
			databox.addAttribute("ERROR_MESSAGE", e.getMessage());

		}
		return dto;
	}

	@Override
	public int updateMemberInfo(Model databox, String email) throws DataAccessException {

		int result = -1;
		try {
			if(StringUtils.isEmpty(email)) {
				return result;
			}
			result = sqlMap.update("updateMember", email);
		} catch (Exception e) {
			e.printStackTrace();
			databox.addAttribute("ERROR_MESSAGE", e.getMessage());
		}
		return result;
	}

	@Override
	public int deleteMember(Model databox, String email) throws DataAccessException {

		int result = -1;
		try {
			if(StringUtils.isEmpty(email)) {
				return result;
			}
			result = sqlMap.update("deleteMember", email);
		} catch (Exception e) {
			e.printStackTrace();
			databox.addAttribute("ERROR_MESSAGE", e.getMessage());
		}
		return result;
	}

}
