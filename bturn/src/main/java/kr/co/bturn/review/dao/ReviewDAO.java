package kr.co.bturn.review.dao;

import java.util.List;

import kr.co.bturn.review.model.ReviewDTO;

import org.springframework.dao.DataAccessException;

public interface ReviewDAO {
	
	/**
	 * ���� ����
	 * @param dto
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int insertReview(ReviewDTO dto) throws DataAccessException;
	
	/**
	 * ���� �󼼺���
	 * @param reviewNo
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public ReviewDTO selectReview(long reviewNo) throws DataAccessException;
	
	/**
	 * ���� ����Ʈ ��������
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public List<ReviewDTO> selectReviewList() throws DataAccessException;
	
	/**
	 * ���� �����ϱ�
	 * @param review
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateReview(ReviewDTO review) throws DataAccessException;

	/**
	 * ���� ��õ �� ����
	 * @param review
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateRecommendCount(ReviewDTO review) throws DataAccessException;
	
	/**
	 * ���� �����ϱ�
	 * @param reviewNo
	 * @return
	 * @throws DataAccessException
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int deleteReview(long reviewNo) throws DataAccessException;

}
