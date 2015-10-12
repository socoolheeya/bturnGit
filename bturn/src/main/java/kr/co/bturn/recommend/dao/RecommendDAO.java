package kr.co.bturn.recommend.dao;

import kr.co.bturn.recommend.model.RecommendDTO;

import org.springframework.dao.DataAccessException;

/**
 * 추천 DAO
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public interface RecommendDAO {
	
	/**
	 * 추천하기
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int insertRecommend(RecommendDTO recommend) throws DataAccessException;
	
	/**
	 * 추천 취소
	 * @param recommendNo
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateRecommend(RecommendDTO recommend) throws DataAccessException;

}
