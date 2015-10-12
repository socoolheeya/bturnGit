package kr.co.bturn.recommend.service;

import kr.co.bturn.recommend.model.RecommendDTO;

/**
 * 추천 서비스
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public interface RecommendService {
	
	/**
	 * 추천하기
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int addRecommend(RecommendDTO recommend) throws Exception;
	
	/**
	 * 
	 * @param recommend
	 * @return
	 * @throws Exception
	 */
	public int updateRecommend(RecommendDTO recommend) throws Exception;
	
}
