package kr.co.bturn.review.dao;

import java.util.List;

import kr.co.bturn.review.model.ReviewDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

public class ReviewDAOImpl implements ReviewDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public ReviewDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public int insertReview(ReviewDTO dto) throws DataAccessException {
		return sqlMap.insert("insertReview", dto);
	}

	@Override
	public ReviewDTO selectReview(long reviewNo) throws DataAccessException {
		return sqlMap.selectOne("selectReview", reviewNo);
	}

	@Override
	public List<ReviewDTO> selectReviewList() throws DataAccessException {
		return sqlMap.selectList("selectReviewList");
	}

	@Override
	public int updateReview(ReviewDTO review) throws DataAccessException {
		return sqlMap.update("updateReview", review);
	}
	
	@Override
	public int updateRecommendCount(ReviewDTO review) throws DataAccessException {
		return sqlMap.update("updateRecommendCount", review);
	}

	@Override
	public int deleteReview(long reviewNo) throws DataAccessException {
		return sqlMap.delete("deleteReview", reviewNo);
	}
}