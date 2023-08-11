package collections;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.LinkedList;
//import java.util.List;
import java.util.Vector;

public class Sorting_List_implementation_Classes {
	void m1()
	{
		// arrays
		int arr[]={5,4,3,2,1};
		System.out.println("before sorting :"+Arrays.toString(arr));
		Arrays.sort(arr);//  Arrays.sort() only works for arr not for collections
 		System.out.println("After sorting : "+Arrays.toString(arr));
		
	}
	void m2()
	{
		System.out.println("Implementing the List Interfaces implementing class sorting order");
		 ArrayList<Integer> al=new ArrayList<Integer>();
		 al.add(11);
		 al.add(12);
		 al.add(13);
		 al.add(10);
		 al.add(1); 
		 al.add(19);
		 al.add(17);
		 al.add(18);
		 al.add(1);
		 al.add(10);
		 System.out.println("Before sorting the ArrayList: "+al);
		 Collections.sort(al);
		 System.out.println("After sorting the ArrayList: "+al);
		 LinkedList<Integer> ll=new LinkedList<Integer>();
		 ll.add(11);
		 ll.add(12);
		 ll.add(13);
		 ll.add(10);
		 ll.add(1); 
		 ll.add(19);
		 ll.add(17);
		 ll.add(18);
		 ll.add(1);
		 ll.add(10);
		 System.out.println("Before sorting the  LinkedList: "+ll);
		 Collections.sort(ll);
		 System.out.println("After sorting the LinkedList: "+ll);
		 Vector<Integer> V=new Vector<Integer>();
		 V.add(11);
		 V.add(12);
		 V.add(13);
		 V.add(10);
		 V.add(1); 
		 V.add(19);
		 V.add(17);
		 V.add(18);
	     V.add(1);
		 V.add(10);
		 System.out.println("Before sorting the  vector: "+V);
		 Collections.sort(V);
		 System.out.println("After sorting the VECTOR: "+V);
		 /*Collections.sort() method only works for only List interface
		  *  implementation classes only if we want to use Collections.sort() for
		  *  set we need  to pass the set object into any one of the List
		  *  implementation classes 
		  * */
		 
		 
	}
	void m3()
	{
		System.out.println("Implementing sorting on set implementation classes");
		HashSet<Integer> hs=new HashSet<Integer>();
		hs.add(12);
		hs.add(22);
		hs.add(2);
		hs.add(22);
		hs.add(32);
		hs.add(1);
		hs.add(2);
		hs.add(42);
		hs.add(1);
		hs.add(10);
		hs.add(17);
		hs.add(12);
		System.out.println("Before Sorting HASHSET : "+hs);
		//Collections.sort(hs); The method sort(List<T>) in the type 
		//Collections is not applicable for the arguments (HashSet<Integer>)
		ArrayList<Integer> al1=new ArrayList<Integer>(hs);
		System.out.println("Before sorting hashset arraylist: "+al1);
		Collections.sort(al1);
		System.out.println("After sorting hashset arraylist: "+al1);
		LinkedHashSet<String>  lhs=new LinkedHashSet<String>();
		lhs.add("Kotesh");
		lhs.add("KOtesh");
		lhs.add("Rajesh");
		lhs.add("mahesh");
		lhs.add("Rakesh");
		lhs.add("Sujatha");
		lhs.add("Prakruthi");
		lhs.add("Komali");
		lhs.add("Kotesh");
		System.out.println("Before Sorting the LinkedHashSet: "+lhs);
		ArrayList<String> al2=new ArrayList<String>(lhs);
		System.out.println("Before sorting the LinkedHashSet ArrayList: "+al2);
		Collections.sort(al2);
		System.out.println("After sorting the LinkedHashSet ArrayList: "+al2);
		
	
	
	
	
	
	
	
	
	
	
	}
	
	
	

	public static void main(String[] args) {
		
		Sorting_List_implementation_Classes obj=new Sorting_List_implementation_Classes();
		obj.m1();
		obj.m2();
		obj.m3();
		System.out.println(Integer.valueOf('o'));
		

	}

}
