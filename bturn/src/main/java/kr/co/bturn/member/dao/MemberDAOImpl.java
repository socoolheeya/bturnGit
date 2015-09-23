package kr.co.bturn.member.dao;

import kr.co.bturn.member.model.MemberDTO;

import org.apache.log4j.Logger;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;
import org.springframework.util.StringUtils;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public class MemberDAOImpl implements MemberDAO {
	
	Logger log = Logger.getLogger(this.getClass());
	private SqlSessionTemplate sqlMap;
	
	public MemberDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int join(MemberDTO dto) throws DataAccessException {
		int result = -1;
		try {
			result = sqlMap.insert("insertMember", dto);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}

		return result;
	}

	@Override
	public MemberDTO getMemberInfo(String id) throws DataAccessException {

		MemberDTO dto = null;
		try {
			if(StringUtils.isEmpty(id)) {
				return dto;
			}
			dto = sqlMap.selectOne("selectMember", id);

		} catch (Exception e) {
			log.error(e.getMessage(), e);

		}
		return dto;
	}

	@Override
	public int updateMemberInfo(String id) throws DataAccessException {

		int result = -1;
		try {
			if(StringUtils.isEmpty(id)) {
				return result;
			}
			result = sqlMap.update("updateMember", id);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return result;
	}

	@Override
	public int deleteMember(String id) throws DataAccessException {

		int result = -1;
		try {
			if(StringUtils.isEmpty(id)) {
				return result;
			}
			result = sqlMap.update("deleteMember", id);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return result;
	}

}
