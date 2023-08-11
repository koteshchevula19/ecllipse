package pack2;
import pack1.CB;

public class ClassZ{
	 

	ClassZ() {
		super();
		// TODO Auto-generated constructor stub
	}
	/*public static void main(String[] args) {
		  int i=0;
		  int sum=0;
		  for( i=1;i<=10;i++)
		  {
			  sum=sum+i*2;
			  ++i;
		  }
		  System.out.println(sum);
		  System.out.println((4/3));
		  float y=6;
		  float x=6/4;
		  System.out.println(x);
		 
	}*/
	public void m1()
	{
		System.out.println("Hello ClassZ");
		m2();
	}
	public void m2()
	{
		System.out.println(" cz m2 called");
	}
	public static void main(String[] args) {
		ClassZ z=new ClassZ();
		z.m1();
		
	}

}
