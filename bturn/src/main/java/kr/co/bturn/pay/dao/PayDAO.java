package kr.co.bturn.pay.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import kr.co.bturn.pay.model.PayDTO;

/**
 * 결제관리 DAO
 * @author LeeWonHee
 * @since 2015.10.08
 *
 */
public interface PayDAO {
	
	/**
	 * 결제하기
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
	 * 결제
	 * @param pay
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void updatePay(PayDTO pay) throws DataAccessException;
	
	/**
	 * 결제완료 된 결제 리스트
	 * @return
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public List<PayDTO> getPaidList() throws DataAccessException;
	
	/**
	 * 결제상태 변경
	 * @param pay
	 * @author LeeWonHee
	 * @since 2015.10.08
	 */
	public void updatePayStatus(PayDTO pay) throws DataAccessException;
	

}
