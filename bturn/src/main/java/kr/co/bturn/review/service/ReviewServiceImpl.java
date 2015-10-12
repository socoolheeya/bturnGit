package kr.co.bturn.review.service;

import java.util.List;

import javax.annotation.Resource;

import org.apache.log4j.Logger;

import kr.co.bturn.recommend.dao.RecommendDAO;
import kr.co.bturn.recommend.model.RecommendDTO;
import kr.co.bturn.review.dao.ReviewDAO;
import kr.co.bturn.review.model.ReviewDTO;

/**
 * 리뷰 서비스
 * @author LeeWonHee
 * @since 2015.10.12
 *
 */
public class ReviewServiceImpl implements ReviewService {
	
	Logger log = Logger.getLogger(this.getClass());
	
	@Resource(name="reviewDAO")
	private ReviewDAO reviewDAO;
	@Resource(name="recommendDAO")
	private RecommendDAO recommendDAO;
	
	@Override
	public int insertReview(ReviewDTO review, RecommendDTO recommend) throws Exception {
		int result = 0;
		try {
			reviewDAO.insertReview(review);
			recommendDAO.insertRecommend(recommend);
			result = 1;
		} catch(Exception e) {
			log.error("리뷰 생성 실패 insertReview() Error");
			result = -1;
		}
		return result;
	}

	@Override
	public ReviewDTO selectReview(long reviewNo) throws Exception {
		return reviewDAO.selectReview(reviewNo);
	}

	@Override
	public List<ReviewDTO> selectReviewList() throws Exception {
		return reviewDAO.selectReviewList();
	}

	@Override
	public int updateReview(ReviewDTO review) throws Exception {
		return reviewDAO.updateReview(review);
	}
	
	
	public int updateRecommendCount(ReviewDTO review) throws Exception {
		int result = 0;
		try {
			reviewDAO.updateRecommendCount(review);
			
		} catch(Exception e) {
			log.error("error", e);
		}
		return result;
	}

	@Override
	public int deleteReview(long reviewNo) throws Exception {
		return reviewDAO.deleteReview(reviewNo);
	}


}
