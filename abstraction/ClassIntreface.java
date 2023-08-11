package abstraction;

public class ClassIntreface implements InterfaceA{
	public void m1()
	{
		System.out.println("Welcome");
	}
	public int m3()
	{
		System.out.println("Hello");
		return 131;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassIntreface obj=new ClassIntreface();
		obj.m1();
		System.out.println(obj.m3());
	}

}
