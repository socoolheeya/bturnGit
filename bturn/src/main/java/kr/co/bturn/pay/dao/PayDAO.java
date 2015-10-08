package kr.co.bturn.pay.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.co.bturn.pay.model.PayDTO;

/**
 * �������� DAO
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public interface PayDAO {
	
	/**
	 * �����ϱ�
	 * @param pay
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void insertPay(PayDTO pay) throws DataAccessException;
	
	/**
	 * 
	 * @return
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPayList() throws DataAccessException;
	
	/**
	 * ����
	 * @param pay
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void updatePay(PayDTO pay) throws DataAccessException;
	
	/**
	 * �����Ϸ� �� ���� ����Ʈ
	 * @return
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPaidList() throws DataAccessException;
	
	/**
	 * �������� ����
	 * @param pay
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void updatePayStatus(PayDTO pay) throws DataAccessException;
	

}
