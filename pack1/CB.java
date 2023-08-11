package pack1;

public class CB extends CA

{ //int a=20;
	/*CB()
	{
		//super("java");
		System.out.println("default constructor of child class");
	}*/
	/*@override
	void m1()
	{  
		System.out.println("Abstract method overridden");
	}
	void msg(String s)
	{
		System.out.println(s);
	}
	 
	public static void main(String[] args) {
		CA bobj=new CB();
		bobj.m1();
		bobj.msg("Java is Awesome");
		 
	}*/
	 CB()
	 {
		 System.out.println("CB");
		 m2();
	 }
	 
	 void m2()
	 { 
		 a+=20;
		 System.out.println("===>"+a);
	 }
	 public static void main(String[] args) {
		 CA aobj=new CB();
		 System.out.println(aobj.getValue());
		 
		
	}

}
