package kr.co.bturn.recommend.dao;

import kr.co.bturn.recommend.model.RecommendDTO;

import org.springframework.dao.DataAccessException;

/**
 * ��õ DAO
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public interface RecommendDAO {
	
	/**
	 * ��õ�ϱ�
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int insertRecommend(RecommendDTO recommend) throws DataAccessException;
	
	/**
	 * ��õ ���
	 * @param recommendNo
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateRecommend(RecommendDTO recommend) throws DataAccessException;

}
