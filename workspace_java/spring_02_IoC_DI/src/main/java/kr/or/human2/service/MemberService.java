package kr.or.human2.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import kr.or.human2.dao.MemberDAO;

@Service
public class MemberService {
	
//	public List getList() {
//		1. 강한 의존 상태
//		MemberDAOImpl memberDAO = new MemberDAOImpl();
//		return memberDAO.select();
//	}
	
	
//	public List getList(MemberDAO memberDAO) {
//		2. 전달 받아 의존성을 낮춤
//		return memberDAO.select();
//	}
	
	// 방법1
//	private MemberDAO memberDAO = null;
	public void setMemberDAO(MemberDAO memberDAO) {
		this.memberDAO = memberDAO;
	}
	
	public List getList() {
		return this.memberDAO.select();
	}
	
	// Spring에 등록된 Bean 중, MemberDAO로 자동 형 변환 되는 것을 찾아, 변수(memberDAO)에 넣음
	// new까지 해줌(의존성 주입)
	@Qualifier("dao1")
	@Autowired
	MemberDAO memberDAO;
	
//	public List getList() {
//		// MemberDAO를 바꿀 필요 없이,
//		// MemberDAOImpl만 수정하면 변경됨(전달인자 바꾸면 아예 변경 필요 X)
//		MemberDAO memberDAO = new MemberDAOImpl();
//		
//		return memberDAO.select();
//	}
}
