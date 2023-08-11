package day1;

public class This {
	int a=10;
	int b=20;
	This()
	{   this("Java is Awesome",11); 
		System.out.println("===> :Default constructor");
		System.out.println("Today is Satuarday");
		
	}
	This(String s,int a)
	{		
		
		System.out.println("===> : parameterised constructor");
		System.out.println("String s is :"+s);
		System.out.println("Value of a is: "+a);
		
	}
	
	
	void m1()
	{
		System.out.println("Method1 called");
	    m2();      //this.m2()=new This().m2()
	}
	void m2()
	{
		System.out.println("Method2 called");
		this.m3();
		System.out.println("===>"+this.a);
	}
	void m3()
	{    this.m4();
		System.out.println("Method3 called");
	}
	void m4()
	{
		System.out.println("Method4 called");
		System.out.println(this.b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new This().m1();
		System.out.println("End of the execution");
		String s1=new String("Hello");
		String s2=new String(" World!");
		String s3=s1.concat(s2);
		System.out.println(s1);
		System.out.println(s2.trim());
		System.out.println(s3);
		int arr[]= {1,2};
		try
		{
			int a=4/0;
			 
			
		}
		catch(Exception e1)
		{
			e1.printStackTrace(); 
		}
			
		 

			
		 
		 

	}

}
