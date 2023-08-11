package collections;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class Hash_Set {
	void m1()
	{
		System.out.println("user defined Objects");
		//HashSet<ClassA> hs=new HashSet<ClassA>();
		LinkedHashSet<ClassA> hs=new LinkedHashSet<ClassA>();
		//TreeSet <ClassA> hs=new TreeSet<ClassA>();
		// ArrayList<ClassA> hs=new  ArrayList<ClassA>();
		ClassA obj1=new ClassA(101,"Kishan",50000);
		ClassA obj2=new ClassA(102,"Sujatha",40400);
		ClassA obj3=new ClassA(103,"Kotesh",80500);
		ClassA obj4=new ClassA(104,"Prakruthi",30000);
		hs.add(obj1);
		hs.add(obj2);
		hs.add(obj3);
		hs.add(obj4);;
		Iterator<ClassA> ihs=hs.iterator();
		System.out.println(hs);
		while(ihs.hasNext())
		{
			System.out.println(ihs.next());
		}
		//sortinng the set
		
		
		
	}
public static void main(String[] args) {
	new Hash_Set().m1();
	
	
}
		
	}



