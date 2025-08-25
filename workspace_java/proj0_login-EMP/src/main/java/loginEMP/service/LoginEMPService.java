package loginEMP.service;

import java.util.List;

import loginEMP.DAO.LoginEMPDAO;
import loginEMP.DTO.LoginEMPDTO;

public class LoginEMPService {
	LoginEMPDAO loginEMPDAO = new LoginEMPDAO();
	
	public List<LoginEMPDTO> getAll() {
		List<LoginEMPDTO> list = loginEMPDAO.selectAll();
		return list;
	}
}
