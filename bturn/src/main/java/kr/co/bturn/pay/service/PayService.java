package kr.co.bturn.pay.service;

import java.util.List;

import kr.co.bturn.pay.model.PayDTO;

/**
 * 결제 서비스
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public interface PayService {
	
	/**
	 * 결제하기
	 * @param pay
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void insertPay(PayDTO pay) throws Exception;
	
	/**
	 * 결제 리스트 가져오기
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPayList() throws Exception;
	
	/**
	 * 결제 후 리스트
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPaidList() throws Exception;
	
	/**
	 * 결제 수정하기
	 * @param pay
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void updatePay(PayDTO pay) throws Exception;
	
	

}
