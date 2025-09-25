package kr.or.human4.dao;

import java.util.List;
import java.util.Map;

import kr.or.human4.dto.EmpDTO;

public interface EmpDAO {

	List<EmpDTO> selectEmpList();
	public EmpDTO selectOneEmp();
	public Map selectOneEmpMap();
	public List selectEmpno(int empno);
	public List selectEname(String ename);
	public List selectEmpnoEname(EmpDTO dto);
	public int insertData(EmpDTO dto);
	public List selectDetail(int empno);
	public int updateData(EmpDTO dto);
	public int deleteData(EmpDTO dto);
	public EmpDTO selectOneEmpno(int empno);
	
	public List<EmpDTO> selectEmp(EmpDTO dto);
	public List<EmpDTO> foreach(EmpDTO dto);
}