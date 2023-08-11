package abstraction;

public  class ClassY extends Absolute {
	void m2()
	{
		System.out.println("Hello Welcome to the world");
	}
	void m3()
	{
		System.out.println("You are a good guy");
	}

	public static void main(String[] args) {
		new ClassY().m2();
		new ClassY().m3();
		new ClassY().m1();
		 

	}

}
