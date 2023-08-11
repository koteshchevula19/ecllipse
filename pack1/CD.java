package pack1;

public class CD {

	CD()
	{
		System.out.println(" DC ");
		
	}
	CD(int x)
	{
		System.out.println(" p1: "+x);
	}
	CD(String s)
	{
		System.out.println(" p2 :"+s);
	}
	void m1(String s)
	{
		System.out.println(" java is "+s);
	}
	public static void main(String[] args) {
		  
		System.out.println("main method executed");
		//this.m1();//Cannot use this in a static context
		
		
		
	}
}
