package pack1;

public   class CA {
	int a=0;
	
	 public void m1()
	  {
		  System.out.println("hello cA");
	  }
	 CA()
	 {
		 System.out.println("Ca method");
		 m2();
		 
	 }
	 void m2()
	 { 
		 a+=10;
		 System.out.println("====>"+a);
	 }
	 int getValue()
	 {
		 return a;
	 }
	  
	
		
		

}
 