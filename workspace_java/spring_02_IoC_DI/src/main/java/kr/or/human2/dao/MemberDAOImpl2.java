package kr.or.human2.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository
@Primary
public class MemberDAOImpl2 implements MemberDAO {
	// 지금 이 상태(Override 전)는 응집도가 강함 : 문자열이 있는 경우의 select도 하고 싶으면
	// 										 추가로 메소드 생성을 해야 함
	@Override
	public List select() {
		List list = new ArrayList<>();
		list.add("하나");
		list.add("둘");
		list.add("셋");
		
		return list;
	}
	
	
}
