package polymorphism;

public class ClassC extends ClassB {
	void msg(int a, int b)// overriding method
	{
		System.out.println("===> Child class method");
		System.out.println(10+20);
	}
	void m3()
	{
		System.out.println("Method 3");
	}

	public static void main(String[] args) {
		ClassB obj=new ClassC();
		obj.msg(10,20);
		obj.m2();
	 

	}

}
