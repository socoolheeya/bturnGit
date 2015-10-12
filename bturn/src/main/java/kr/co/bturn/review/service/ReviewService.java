package kr.co.bturn.review.service;

import java.util.List;

import kr.co.bturn.recommend.model.RecommendDTO;
import kr.co.bturn.review.model.ReviewDTO;

/**
 * ���� ����
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public interface ReviewService {
	
	/**
	 * ���� ����
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int insertReview(ReviewDTO review, RecommendDTO recommend) throws Exception;
	
	/**
	 * ���� ���κ���
	 * @param reviewNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public ReviewDTO selectReview(long reviewNo) throws Exception;
	
	/**
	 * ���� ����Ʈ ��������
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public List<ReviewDTO> selectReviewList() throws Exception;
	
	/**
	 * ���� �����ϱ�
	 * @param reviewNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int updateReview(ReviewDTO review) throws Exception;
	
	/**
	 * ���� �����ϱ�
	 * @param reviewNo
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.12
	 */
	public int deleteReview(long reviewNo) throws Exception;

}
