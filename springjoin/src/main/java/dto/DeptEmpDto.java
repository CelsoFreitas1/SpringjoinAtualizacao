package dto;

public class DeptEmpDto {
	
	private String emDept;
	private String empName;
	private String empEmail;
	private String empEndereco;
	
	public DeptEmpDto(String emDept, String empName, String empEmail, String empEndereco) {
		super();
		this.emDept = emDept;
		this.empName = empName;
		this.empEmail = empEmail;
		this.empEndereco = empEndereco;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public String getEmpEmail() {
		return empEmail;
	}

	public void setEmpEmail(String empEmail) {
		this.empEmail = empEmail;
	}

	public String getEmpEndereco() {
		return empEndereco;
	}

	public void setEmpEndereco(String empEndereco) {
		this.empEndereco = empEndereco;
	}

	@Override
	public String toString() {
		return "DeptEmpDto [emDept=" + emDept + ", empName=" + empName + ", empEmail=" + empEmail + ", empEndereco="
				+ empEndereco + "]";
	}
	
	

	
}
