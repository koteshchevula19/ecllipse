package day1;

public class Employee {
	String empName;
	int empID;

	Employee(String name, int ID) {
		empName = name;
		empID = ID;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee obj1 = new Employee("Ramesh", 101);
		Employee obj2 = new Employee("Suresh", 102);
		System.out.println("==>" + obj1.empID + ":" + obj1.empName);
		System.out.println("==>" + obj2.empID + ":" + obj2.empName);
		String s1 = "Hello";
		String s2 = "Hello";
		System.out.println(s1.concat(s2));

	}

}
