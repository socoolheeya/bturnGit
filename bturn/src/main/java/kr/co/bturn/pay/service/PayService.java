package kr.co.bturn.pay.service;

import java.util.List;

import kr.co.bturn.pay.model.PayDTO;

/**
 * ���� ����
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public interface PayService {
	
	/**
	 * �����ϱ�
	 * @param pay
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void insertPay(PayDTO pay) throws Exception;
	
	/**
	 * ���� ����Ʈ ��������
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPayList() throws Exception;
	
	/**
	 * ���� �� ����Ʈ
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPaidList() throws Exception;
	
	/**
	 * ���� �����ϱ�
	 * @param pay
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void updatePay(PayDTO pay) throws Exception;
	
	

}
