package pack2;
import pack1.Animal;

public class Dog{
	static int a=10;
	static {
		System.out.println(a);
		System.out.println(getB());
	}
	//@override
	public void print()
	{
		System.out.println("Dog");
		return ;
	}
	public static void main(String[] args) {
		new Dog().print();
		
		
	}

	static int getB()
	{
		return b;
	}
	static int b=20;
}
