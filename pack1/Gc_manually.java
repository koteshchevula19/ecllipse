package pack1;
import java.util.*;

public class Gc_manually {
	void m1()
	{
		System.out.println("m1() called");
		int[] a=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the elements");
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		System.out.println("printing the elements");
		for(int i=0;i<a.length;i++)
			
		System.out.println(a[i]);
	}
	//@override   //annotation
	/*protected void finalize() throws Throwable
	{
		System.out.println("Garbage collector called manully");
	}

	
	
		// TODO Auto-generated method stub
		
		
		System.out.println(a.getClass());
		System.out.println("------");
		a.m1();
		System.out.println(a.toString()+"_______"+100);
		System.out.println(a.getClass());
		a=null;
		System.out.println(a);
		System.gc();
		*/
	public static void main(String[] args) {
		System.out.println("---");
		Gc_manually a=new Gc_manually();
		a.m1();
		 

	}
}


