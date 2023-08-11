package task2;

public class Adminstration {
	public static void main(String[] args) {
		Department dep1 = new Department(101, "JAVA", "Hyderabad");
		Department dep2 = new Department(102, "Python", "Bangalore");
		Department dep3 = new Department(103, "Oracle", "Chennai");

		Employee emp1 = new Employee(9271, "Rajesh", 35000.0, dep1);
		Employee emp2 = new Employee(9272, "Vikas", 45000.0, dep1);
		Employee emp3 = new Employee(9273, "Vishwa", 91210.0, dep1);
		Employee emp4 = new Employee(9274, "Srinivas", 78300.0, dep1);
		Employee emp5 = new Employee(8121, "Ramanujan", 56800.0, dep2);
		Employee emp6 = new Employee(8122, "Suresh", 78900.0, dep2);
		Employee emp7 = new Employee(8123, "Naveen", 61200.0, dep2);
		Employee emp8 = new Employee(7121, "Bhanu", 37800.0, dep3);
		Employee emp9 = new Employee(7122, "Bhanu", 62100.0, dep3);
		Employee emp10 = new Employee(7123, "Bhanu", 87800.0, dep3);

		Employee e[] = { emp1, emp2, emp3, emp4, emp5, emp6, emp7, emp8, emp9, emp10 };
		double maxSal = Double.MIN_VALUE;
		String name = "";
		String department = "";
		String location = "";
		int id=0;

		for (Employee emp : e) {
			if (emp.empSal > maxSal) {
				maxSal = emp.empSal;
				name = emp.empName;
				department = emp.dep.depName;
				location = emp.dep.depLocation;
				id=emp.empID;

			}

		}
		System.out.println(name+" ID"+" ("+id+")" + " is taking highest salary from the " + department + " department " + "i.e " + maxSal
				+ " working in the location " + location);

	}

}
