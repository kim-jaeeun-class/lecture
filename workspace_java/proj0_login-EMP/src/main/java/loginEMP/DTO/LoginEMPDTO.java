package loginEMP.DTO;

public class LoginEMPDTO {
	private int empno;
	private String ename;
	
	public int getEmpno() {
		return empno;
	}
	public void setEmpno(int empno) {
		this.empno = empno;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "LoginEMPDTO [empno=" + empno + ", ename=" + ename + "]";
	}
	
}
