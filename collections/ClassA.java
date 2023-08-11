package collections;

public class  ClassA{
	private int emp_Id;
	private String emp_Name;
	private int emp_Sal;
	
	public ClassA(int emp_Id, String emp_Name, int emp_Sal) {
		super();
		this.emp_Id = emp_Id;
		this.emp_Name = emp_Name;
		this.emp_Sal = emp_Sal;
	}

	@Override
	public String toString() {
		return  emp_Id+"  "+emp_Name +"  "+ emp_Sal;
	}
	

}
