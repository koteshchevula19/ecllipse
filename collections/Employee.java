package collections;
public class Employee {
	int empAge;
	String empName;
	int empSal;
	public Employee(int empAge, String empName, int empSal) {
		super();
		this.empAge = empAge;
		this.empName = empName;
		this.empSal = empSal;
		 
		 
	}
	@Override
	public String toString() {
		return  empAge + " " + empName + " "+ empSal;
	}
	public int compareTo(Employee e)
	{
		return this.empSal-e.empSal;
	}
	 
	 

}
