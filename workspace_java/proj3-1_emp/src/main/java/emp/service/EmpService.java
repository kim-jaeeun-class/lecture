package emp.service;

import java.util.List;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

public class EmpService {
	
	EmpDAO empDAO = new EmpDAO();
	
	public List<EmpDTO> getAllEmp() {
		List<EmpDTO> list = empDAO.selectAllEmp();
		return list;
	}
	
	public EmpDTO getOneEmp(EmpDTO empDTO) {
		// EmpDTO dto = empDAO. selectOneEmp(empDTO); return dto; 라고 써도 됨
		return empDAO.selectOneEmp(empDTO);
	}
	
	public int removeEmp(EmpDTO empDTO) {
		return empDAO.deleteEmp(empDTO);
	}
}
