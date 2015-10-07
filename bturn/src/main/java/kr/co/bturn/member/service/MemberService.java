package kr.co.bturn.member.service;

import kr.co.bturn.member.model.MemberDTO;

/**
 * 멤버 관리 서비스
 * @author LeeWonHee
 * @since 2015.09.20
 */
public interface MemberService {
	
	/**
	 * 회원 가입
	 * @param dto
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.20
	 */
	public int join(MemberDTO dto) throws Exception;
	
	/**
	 * 비밀번호 체크
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
	 * 로그인 정보 체크
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
	 * 사용자 정보 수정
	 * @param id
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.09.23
	 */
	public int updateMemberInfo(String id) throws Exception;
	
	/**
	 * 사용자 정보 가져오기
	 * @param id
	 * @return
	 * @throws Exception
	 * @author LeeWonHee
	 * @since 2015.10.07
	 */
	public MemberDTO getMemberInfo(String id) throws Exception;

}
