package kr.co.bturn.member.dao;

import kr.co.bturn.member.model.MemberDTO;

import org.apache.ibatis.logging.Log;
import org.apache.ibatis.logging.LogFactory;
import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

/**
 * 
 * @author LeeWonHee
 * @since 2015.09.22
 */
public class MemberDAOImpl implements MemberDAO {
	
	protected Log log = LogFactory.getLog(this.getClass());
	private SqlSessionTemplate sqlMap;
	
	public MemberDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}
	
	protected void printQueryId(String queryId) {
		if(log.isDebugEnabled()) {
			log.debug("\t QueryId	\t :	"+	queryId);
		}
	}

	@Override
	public int join(String queryId, MemberDTO dto) throws DataAccessException {
		printQueryId(queryId);
		return sqlMap.insert("insertMember", dto);	
	}

	@Override
	public MemberDTO getMemberInfo(String queryId, String id) throws DataAccessException {		
		printQueryId(queryId);
		return sqlMap.selectOne("selectMember", id);
	}

	@Override
	public int updateMemberInfo(String queryId, String id) throws DataAccessException {
		printQueryId(queryId);
		return sqlMap.update("updateMember", id);
	}

	@Override
	public int deleteMember(String queryId, String id) throws DataAccessException {
		printQueryId(queryId);
		return sqlMap.update("deleteMember", id);	
	}

}
