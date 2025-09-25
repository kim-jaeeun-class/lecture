package kr.or.human4.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.or.human4.dao.EmpDAO;
import kr.or.human4.dto.EmpDTO;

@Service
public class EmpServiceImpl implements EmpService {
	
	@Autowired
	EmpDAO empDAO;
	
	@Override
	public List<EmpDTO> getEmpList(){
		List<EmpDTO> result = empDAO.selectEmpList();
		
		return result;
	}
	
	@Override
	public EmpDTO getEmp(){
		EmpDTO result = empDAO.selectOneEmp();
		
		return result;
	}
	
	@Override
	public Map getEmpMap(){
		Map result = empDAO.selectOneEmpMap();
		
		return result;
	}
	
	@Override
	public List getEmpno(int empno) {
		return empDAO.selectEmpno(empno);
	}
	
	@Override
	public List getEname(String ename) {
		return empDAO.selectEname(ename);
	}
	
	@Override
	public List getEmpnoEname(EmpDTO dto) {
		return empDAO.selectEmpnoEname(dto);
	}
	
	@Override
	public int addData(EmpDTO dto) {
		return empDAO.insertData(dto);
	}
	
	@Override
	public EmpDTO getOneEmpno(int empno) {
		return empDAO.selectOneEmpno(empno);
	}
	
	@Override
	public List getDetail(int empno) {
		return empDAO.selectDetail(empno);
	}
	
	@Override
	public int editData(EmpDTO dto) {
		return empDAO.updateData(dto);
	}
	
	@Override
	public int removeData(EmpDTO dto) {
		return empDAO.deleteData(dto);
	}
	
	@Override
	public List<EmpDTO> selectEmp(EmpDTO dto) {
		if(dto.getType().equals("1")) {
			dto.setEname(dto.getKeyword());
		}
		else if(dto.getType().equals("2")) {
			dto.setJob(dto.getKeyword());
		}
		else if(dto.getType().equals("3")) {
			dto.setEname(dto.getKeyword());
			dto.setJob(dto.getKeyword());
		}
		else if(dto.getType().equals("4")) {
			int sal = Integer.parseInt(dto.getKeyword());
			dto.setSal(sal);
		}
		return empDAO.selectEmp(dto);
	}
	
	@Override
	public List<EmpDTO> foreach(EmpDTO dto) {
		return empDAO.foreach(dto);
	}
	
}
