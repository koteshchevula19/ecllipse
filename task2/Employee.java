package task2;

public class Employee {
	int empID;
	String empName;
	double empSal;
	Department dep;

	public Employee(int empID, String empName, double empSal, Department dep) {
		this.empID = empID;
		this.empName = empName;
		this.empSal = empSal;
		this.dep = dep;
	}
}
