package collections;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.RandomAccess;
import java.util.Vector;

public class ArrayListDemo   {
	public static void main(String[] args) {
		ArrayList l=new ArrayList();
		
		List l3=Collections.synchronizedList(l);
		LinkedList l2=new LinkedList();
		Vector v=new Vector();
		l.add("A");
		l.add("1");
		l.add("2");
		l.add(null);
		System.out.println(l);
		l.remove(2);
		System.out.println(l);
	    Object o=l.set(1,"BC");
	    System.out.println("===> :"+o);
	    System.out.println(l);
	   
	    
	 
	   System.out.println("Aftere sorting :"+l);
	   System.out.println(l instanceof RandomAccess); 
	   System.out.println(l instanceof Cloneable); 
	   System.out.println(l instanceof Serializable);
	   System.out.println(v instanceof RandomAccess); 
	   System.out.println(v instanceof Cloneable); 
	   System.out.println(v instanceof Serializable);
	   System.out.println(l2 instanceof RandomAccess); 
	   System.out.println(l2 instanceof Cloneable); 
	   System.out.println(l2 instanceof Serializable);
		String s1="A";
		String s2="B";
		   String s3="A";
		   System.out.println("==>: "+s1.compareTo(s2));
		   System.out.println("==>: "+s2.compareTo(s1));
		   System.out.println("==>: "+s1.compareTo(s3));
		    System.out.println("==>: "+"A".compareTo("Z"));
		    System.out.println("==>: "+"Z".compareTo("A"));
		    System.out.println("==>: "+"A".compareTo("A"));
		    System.out.println("==>: "+s1.equals(s2));
		    System.out.println("==>: "+s2.equals(s2));
		    System.out.println("==>: "+s1.equals(s3));
		    System.out.println("==>: "+"Z".equals("A"));
		    System.out.println("==>: "+"A".equals("Z"));
		    System.out.println("==>: "+"A".equals("A"));
		    
		    
		    
		    
		    
	}

	 
}
