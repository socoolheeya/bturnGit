package kr.co.bturn.pay.dao;

import java.util.List;

import kr.co.bturn.pay.model.PayDTO;

import org.mybatis.spring.SqlSessionTemplate;
import org.springframework.dao.DataAccessException;

public class PayDAOImpl implements PayDAO {
	
	private SqlSessionTemplate sqlMap;
	
	public PayDAOImpl(SqlSessionTemplate sqlMap) {
		super();
		this.sqlMap = sqlMap;
	}

	@Override
	public void insertPay(PayDTO pay) throws DataAccessException {
		sqlMap.insert("insertPay", pay);
	}

	@Override
	public List<PayDTO> getPayList() throws DataAccessException {
		return sqlMap.selectList("selectPayList");
	}

	@Override
	public void updatePay(PayDTO pay) throws DataAccessException {
		sqlMap.update("updatePay", pay);
	}

	@Override
	public List<PayDTO> getPaidList() throws DataAccessException {
		return sqlMap.selectList("selectPaidList");
	}

	@Override
	public void updatePayStatus(PayDTO pay) throws DataAccessException {
		sqlMap.update("updatePayStatus", pay);
	}
}
