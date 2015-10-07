package kr.co.bturn.member.service;

import kr.co.bturn.member.model.MemberDTO;

/**
 * ��� ���� ����
 * @author LeeWonHee
 * @since 2015.09.20
 */
public interface MemberService {
	
	/**
	 * ȸ�� ����
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.20
	 */
	public int join(MemberDTO dto) throws Exception;
	
	/**
	 * ��й�ȣ üũ
	 * @param queryId
	 * @param id
	 * @param password
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.20
	 */
	public boolean checkPassword(String queryId, String id, String password) throws Exception;
	
	/**
	 * �α��� ���� üũ
	 * @param queryId
	 * @param id
	 * @param password
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.22
	 */
	public MemberDTO checkLoginInfo(String queryId, String id, String password) throws Exception;
	
	/**
	 * 
	 * @param id
	 * @param password
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.20
	 */
	public MemberDTO login(String id, String password) throws Exception;
	
	/**
	 * ����� ���� ����
	 * @param id
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int updateMemberInfo(String id) throws Exception;
	
	/**
	 * ����� ���� ��������
	 * @param id
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.07
	 */
	public MemberDTO getMemberInfo(String id) throws Exception;

}
