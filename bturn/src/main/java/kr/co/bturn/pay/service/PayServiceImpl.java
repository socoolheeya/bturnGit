package kr.co.bturn.pay.service;

import java.util.List;

import javax.annotation.Resource;

import kr.co.bturn.pay.dao.PayDAO;
import kr.co.bturn.pay.model.PayDTO;
/**
 *
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public class PayServiceImpl implements PayService {
	
	@Resource(name="payDAO")
	private PayDAO payDAO;

	public void setPayDAO(PayDAO payDAO) {
		this.payDAO = payDAO;
	}

	@Override
	public void insertPay(PayDTO pay) throws Exception {
		payDAO.insertPay(pay);
		payDAO.updatePayStatus(pay);
	}

	@Override
	public List<PayDTO> getPayList() throws Exception {
		return payDAO.getPayList();
	}

	@Override
	public List<PayDTO> getPaidList() throws Exception {
		return payDAO.getPaidList();
	}

	@Override
	public void updatePay(PayDTO pay) throws Exception {
		payDAO.updatePay(pay);
	}

}
