package pack1;

public class CC extends CB{
	void m4()
	{
		System.out.println("CC m4 called");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CC cobj=new CC();
		cobj.m1();
		System.out.println("___");
		cobj.m2();
		System.out.println("___");
		cobj.m4();
		

	}

}
