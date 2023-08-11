package collections;

import java.util.TreeSet;

public class TreeSetDemo  {

	public static void main(String[] args) {
		
		/*TreeSet  t1=new TreeSet (new Class_Comparator());
		t1.add(2);
		t1.add(3);
		t1.add(1);
		t1.add(9);
		t1.add(8);
		t1.add(10);
		t1.add(11);*/
		//System.out.println(t1);
		/*TreeSet t2=new TreeSet(new Class_Comparator());
		t2.add(new StringBuffer("Shiva"));
		t2.add(new StringBuffer("Ramesh"));
		t2.add(new StringBuffer("Shekar"));
		t2.add(new StringBuffer("Raju"));
		t2.add(new StringBuffer("Narsimha"));
		t2.add(new StringBuffer("Kotesh"));
		t2.add(new StringBuffer("Rahul"));
		t2.add(new StringBuffer("Sowmya"));
		System.out.println(t2);*/
		/*TreeSet t3=new TreeSet(new Class_Comparator());
		t3.add(new String("Kotesh"));
		t3.add(new String("Rakesh"));
		t3.add(new String("Shiva"));
		t3.add(new String("Ram"));
		t3.add(new String("Sowmya"));
		t3.add(new String("Ramesh"));
		System.out.println(t3);*/
		TreeSet t4=new TreeSet(new Class_Comparator());
		t4.add("A");
		t4.add(new StringBuffer("ABC"));
		t4.add(new StringBuffer("AA"));
		t4.add("XX");
		t4.add("ABCD");
		t4.add("A");
		System.out.println(t4);
		
		

	}

}
