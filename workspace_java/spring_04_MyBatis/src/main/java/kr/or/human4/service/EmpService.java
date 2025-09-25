package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpService {
	// 전체 조회 영역
	public List<EmpDTO> getEmpList();
	
	public EmpDTO getEmp();
	public Map getEmpMap();
	
	// 필터링 조회 영역
	public List getEmpno(int empno);
	public List getEname(String ename);
	public List getEmpnoEname(EmpDTO dto);
	
	// CRUD 영역
	public int addData(EmpDTO dto);
	public List getDetail(int empno);
	public int editData(EmpDTO dto);
	public int removeData(EmpDTO dto);
	
	// 조건 검색
	public List<EmpDTO> selectEmp(EmpDTO dto);
	
	public List<EmpDTO> foreach(EmpDTO dto);
	
	public EmpDTO getOneEmpno(int empno);
}
