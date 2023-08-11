package polymorphism;
//compile time polymorphism
public class ClassA {
	void m1(int a,int b)
	{
		 
		System.out.println(a+b);
	}
	void m1(int a,int b,int c)
	{
		System.out.println(a+b+c);
	}
	void m1(String s,int a)
	{
		System.out.println(a+"%"+s);
	}
	void m1(int b,String x)
	{
		System.out.println(x+b+"%");
	}

	public static void main(String[] args) {
		 
		ClassA obj=new ClassA();
		obj.m1("Java is Awesome", 100);
		obj.m1(100,"Java is Awesome");
		obj.m1(10, 20);
		obj.m1(10, 20, 30);

	}

}
