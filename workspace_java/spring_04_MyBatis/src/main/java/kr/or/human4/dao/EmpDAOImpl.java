package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import kr.or.human4.dto.EmpDTO;

@Repository
public class EmpDAOImpl implements EmpDAO {
	
	// SQL문 실행용
	@Autowired
	SqlSession sqlSession;
	
	@Override
	public List<EmpDTO> selectEmpList() {
		List<EmpDTO> resultList = null;
		// 여기의 selectList, selectOne 뒤의 ("") 영역은 namespace명.id명 구조
		resultList = sqlSession.selectList("mapper.emp.selectEmp");
		System.out.println("resultList : " + resultList);
		
		return resultList;
	}
	
	@Override
	public EmpDTO selectOneEmp() {
		EmpDTO dto = null;
		
		dto = sqlSession.selectOne("mapper.emp.selectOneEmp");
		System.out.println("dto : " + dto);
		
		return dto;
	}
	
	@Override
	public Map selectOneEmpMap() {
		Map map = null;
		
		map = sqlSession.selectOne("mapper.emp.selectOneEmpMap");
		System.out.println("map : " + map);
		
		return map;
	}
	
	@Override
	public List selectEmpno(int empno) {
		return sqlSession.selectList("mapper.emp.selectEmpno", empno);
	}
	
	@Override
	public List selectEname(String ename) {
		System.out.println(ename);
		return sqlSession.selectList("mapper.emp.selectEname", ename);
	}
	
	// TODO 그냥 입력값만 넣어지는 것 같음
	@Override
	public List selectEmpnoEname(EmpDTO dto) {
		System.out.println(dto);
		return sqlSession.selectList("mapper.emp.selectEmpnoEname", dto);
	}
	
	
	@Override
	public int insertData(EmpDTO dto) {
		System.out.println(dto);
		int result = sqlSession.insert("mapper.emp.insertEmp2", dto);
		return result;
	}
	
	@Override
	public List selectDetail(int empno) {
		return sqlSession.selectOne("mapper.emp.selectDetail", empno);
	}
	
	@Override
	public int updateData(EmpDTO dto) {
		return sqlSession.update("mapper.emp.updateDetail", dto);
	}
	
	@Override
	public int deleteData(EmpDTO dto) {
		return sqlSession.delete("mapper.emp.deleteDetail", dto);
	}
	// java로 구헌
	private void testSequence() {
		EmpDTO dto = new EmpDTO();
		// insert 전 sequence 따오기
		int seq_empno = sqlSession.selectOne("mapper.emp.getSeqEmp2");
		// DTO에 저장하기
		dto.setEmpno(seq_empno);
		// 활용(2곳) 이상 동일 empno 전달 가능
		sqlSession.insert("mapper.emp.insertEmp2345", dto);
		sqlSession.insert("mapper.emp.insertEmp9876", dto);
	}
	
	// 실무 편
	private void testSeq2(EmpDTO dto) {
		// 내부에서 seq를 따서 setEmpno로 dto에 저장
		// 얕은 복사라 재사용 가능
		sqlSession.insert("mapper.emp.insertEmp2", dto);
		
		//empno 유지
		sqlSession.insert("mapper.emp.insertEmp9876", dto);
	}
	
	// 조건 검색
	@Override
	public List<EmpDTO> selectEmp(EmpDTO dto) {
		List<EmpDTO> resultList = null;
		
		resultList = sqlSession.selectList("mapper.emp.dynamic.selectEmp");
		
		return resultList;
	}
	
	// choice 못 친 건지 안 친 건지 애매함
	
	@Override
	public List<EmpDTO> foreach(EmpDTO dto) {
		List<EmpDTO> resultList = null;
		
		resultList = sqlSession.selectList("mapper.emp.dynamic.foreach", dto);
		
		return resultList;
	}
	
}
