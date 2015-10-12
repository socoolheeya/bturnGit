package kr.co.bturn.recommend.dao;

import kr.co.bturn.recommend.model.RecommendDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;


public class RecommendDAOImpl implements RecommendDAO {
	
	private SqlSessionTemplate sqlMap;

	public RecommendDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int insertRecommend(RecommendDTO recommend) throws DataAccessException {
		return sqlMap.insert("insertRecommend", recommend);
	}

	@Override
	public int updateRecommend(RecommendDTO recommend) throws DataAccessException {
		return sqlMap.update("updateRecommend", recommend);
	}

}
