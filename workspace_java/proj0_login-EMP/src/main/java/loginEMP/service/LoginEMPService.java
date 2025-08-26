package loginEMP.service;

import java.util.List;

import loginEMP.DAO.LoginEMPDAO;
import loginEMP.DTO.LoginEMPDTO;

public class LoginEMPService {
	LoginEMPDAO loginEMPDAO = new LoginEMPDAO();
	
	public List<LoginEMPDTO> getAll() {
		List<LoginEMPDTO> list = loginEMPDAO.getAll();
		return list;
	}
	
	public LoginEMPDTO login(String id, int pw) {
		return loginEMPDAO.findIdPw(id, pw);
	}
}
