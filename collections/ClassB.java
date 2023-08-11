package collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ClassB {

	void m1()
	{
		ArrayList<Employee> al=new ArrayList<Employee>();
		  Employee obj1=new Employee(26,"Kishan",80000);
		  Employee obj2=new Employee(29,"Sujatha",50000);
		  Employee obj3=new Employee(28,"Kishore",65000);
		  Employee obj4=new Employee(25,"Rachel",58000);
		  Employee obj5=new Employee(21,"Mahome",54000);
		  Employee obj6=new Employee(20,"Scoffield",52000);
		  Employee obj7=new Employee(26,"Tancredi",55000);
		  Employee obj8=new Employee(27,"Burrows",45000);
		  Employee obj9=new Employee(22,"Sanjana",54000);
		  Employee obj10=new Employee(23,"Kotesh",60000);
		  al.add(obj1);
		  al.add(obj2);
		  al.add(obj3);
		  al.add(obj4);
		  al.add(obj5);
		  al.add(obj6);
		  al.add(obj7);
		  al.add(obj8);
		  al.add(obj9);
		  al.add(obj10);
		  System.out.println(al);
		 Stream<Employee> s1=al.stream();
		  Stream<Employee> s2=s1.filter(x->x.empAge>25);
		  //Stream<Employee> s3=s2.map(y->y.empSal*10);
		  List<Employee> li=s2.collect(Collectors.toList());
		  Iterator<Employee> l=li.iterator();
		  while(l.hasNext())
		  {
			  System.out.println(l.next());
		  }
		     
		  
		   
	}
	public static void main(String[] args) {
		new ClassB().m1();
	}
	
	
}
