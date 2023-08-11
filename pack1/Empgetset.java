package pack1;

public class Empgetset {

	private String empName;
	private int empId;
	private String empDept;
	private int empSal;
	private int empExp;

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public int getEmpId() {
		return empId;
	}

	public void setEmpId(int empId) {
		this.empId = empId;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public int getEmpSal() {

		if (empExp >= 5) {
			empSal += empSal * 0.1;

		} else {
			empSal += empSal * 0.05;
		}
		return empSal;
	}

	public void setEmpSal(int empSal) {
		this.empSal = empSal;
	}

	public int getEmpExp() {
		return empExp;
	}

	public void setEmpExp(int empExp) {
		this.empExp = empExp;

	}

}
