package Strings;
import day1.Constructor;
public class Ssbsf   {
	
	public static void m1()
	{
		System.out.println("HEloo!");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char[] c= {'J','A','V','A'};
		String s1="JAVA";
		String s2=new String(c);
		String s7=s1;
		System.out.println(s1==s2);
		System.out.println("===> "+"JAVA".equals(c.toString()));
		System.out.println("===> "+s1.equals(s7));
		System.out.println("===> "+s1.equals(s2));
		System.out.println(s1);
		System.out.println(s2);
		String s3=new String(c,2,2);
		System.out.println(s3);
		String s4=new String(c,0,3);
		System.out.println(s4);
		  s1="ORACLE";
		  System.out.println(s1);
		  s2="PYTHON";
		  String s5=s2;
		  System.out.println(s2);
		  System.out.println(s5.equals(s2));
		  System.out.println("===> "+s5==s2);
		 // s1.getChars()
		  Long l=new Long("123");
		  System.out.println(l);
		  System.out.println(1);
		  Ssbsf.m1();
		   
		  
		  
		

	}
}
