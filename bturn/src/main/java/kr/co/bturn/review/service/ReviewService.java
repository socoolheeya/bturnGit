package kr.co.bturn.review.service;

import java.util.List;

import kr.co.bturn.recommend.model.RecommendDTO;
import kr.co.bturn.review.model.ReviewDTO;

/**
 * 리뷰 서비스
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public interface ReviewService {
	
	/**
	 * 리뷰 쓰기
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int insertReview(ReviewDTO review, RecommendDTO recommend) throws Exception;
	
	/**
	 * 리뷰 세부보기
	 * @param reviewNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public ReviewDTO selectReview(long reviewNo) throws Exception;
	
	/**
	 * 리뷰 리스트 가져오기
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public List<ReviewDTO> selectReviewList() throws Exception;
	
	/**
	 * 리뷰 수정하기
	 * @param reviewNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateReview(ReviewDTO review) throws Exception;
	
	/**
	 * 리뷰 삭제하기
	 * @param reviewNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int deleteReview(long reviewNo) throws Exception;

}
