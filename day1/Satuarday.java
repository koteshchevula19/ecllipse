package day1;

public class Satuarday {
	
	static void m1()
	{    m2();       
		System.out.println("Static m1 method");
		
	}

	static void m2()
	{
		System.out.println("Static m2 method called");
		Satuarday obj1=new Satuarday();
		obj1.m3();
	
	}

  void m3()
	{
		System.out.println("Non-Static m3 method called");
		
		
	}
  void m4()
	{
		System.out.println("Non-Static m4 method called");
	    m1();
	}
  public static void main(String[] args) {
	  new Satuarday().m4();
	  System.out.println("Main Method");
	
}
	

}
