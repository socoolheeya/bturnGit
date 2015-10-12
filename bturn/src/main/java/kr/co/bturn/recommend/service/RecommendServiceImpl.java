package kr.co.bturn.recommend.service;

import javax.annotation.Resource;

import kr.co.bturn.recommend.dao.RecommendDAO;
import kr.co.bturn.recommend.model.RecommendDTO;

public class RecommendServiceImpl implements RecommendService {
	
	@Resource(name="recommendDAO")
	private RecommendDAO recommendDAO;
	
	@Override
	public int addRecommend(RecommendDTO dto) throws Exception {
		return recommendDAO.insertRecommend(dto);
	}

	@Override
	public int updateRecommend(RecommendDTO recommend) throws Exception {
		return recommendDAO.updateRecommend(recommend);
	}
}
