package kr.co.bturn.review.dao;

import java.util.List;

import kr.co.bturn.review.model.ReviewDTO;

import org.springframework.dao.DataAccessException;

public interface ReviewDAO {
	
	/**
	 * 리뷰 쓰기
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int insertReview(ReviewDTO dto) throws DataAccessException;
	
	/**
	 * 리뷰 상세보기
	 * @param reviewNo
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public ReviewDTO selectReview(long reviewNo) throws DataAccessException;
	
	/**
	 * 리뷰 리스트 가져오기
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public List<ReviewDTO> selectReviewList() throws DataAccessException;
	
	/**
	 * 리뷰 수정하기
	 * @param review
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateReview(ReviewDTO review) throws DataAccessException;

	/**
	 * 리뷰 추천 수 변경
	 * @param review
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateRecommendCount(ReviewDTO review) throws DataAccessException;
	
	/**
	 * 리뷰 삭제하기
	 * @param reviewNo
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int deleteReview(long reviewNo) throws DataAccessException;

}
