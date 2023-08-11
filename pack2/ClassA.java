package pack2;

public class ClassA {
	void m1()
	{
		System.out.println(10);
		System.out.println(this.m2()+56);
	}
	int m2()
	{
		System.out.println(75);
		System.out.println(96);
		return this.m3();	}


int m3()
{
	System.out.println(74);
	System.out.println(92);
	return 74-92;
}
void m4()
{
	System.out.println(56);
}
ClassA()
{
	this(52);
	this.m1();
	System.out.println(85);
}
ClassA(int a)
{
	System.out.println(a+7);
}

}



