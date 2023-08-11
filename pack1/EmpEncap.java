package pack1;

import java.util.Scanner;

public class EmpEncap {

	Scanner sc = new Scanner(System.in);

	void m1() {
		Empgetset aobj = new Empgetset();
		System.out.println("enter empName");
		aobj.setEmpName(sc.nextLine());
		System.out.println("enter empId");
		aobj.setEmpId(sc.nextInt());
		System.out.println("enter empDept");
		aobj.setEmpDept(sc.next());
		System.out.println("enter empSal");
		aobj.setEmpSal(sc.nextInt());
		System.out.println("enter empExp");
		aobj.setEmpExp(sc.nextInt());
		System.out.println("empName: " + aobj.getEmpName());
		System.out.println("empId: " + aobj.getEmpId());
		System.out.println("empDept: " + aobj.getEmpDept());
		System.out.println("empExp: " + aobj.getEmpExp());
		System.out.println("empSal updated:  " + aobj.getEmpSal());
		

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new EmpEncap().m1();

	}

}
