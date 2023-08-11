package pack2;

public  class  ClassB extends ClassA {
	void display()
	{
		System.out.println("hI");
		super.m4();
		
	}
	static int show(int a)
	{
		System.out.println(a+a);
		return a+a++;
	}
	ClassB()
	{
		this(show(50));
		for(int i=1;;i++)
		{
			super.m4();
			break;
		}
		System.out.println("HI");
		System.out.println(show(50));
	}
	ClassB(int a)
	{
		System.out.println("==>" + (a+++show(50)));
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new ClassB().display();
		new ClassB().main();
		

	}
	public static void main()
	{ 
		System.out.println("main method overloaded");
	}

}
