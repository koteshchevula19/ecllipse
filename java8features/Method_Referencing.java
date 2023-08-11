package java8features;

public class Method_Referencing {
	void display()
	{
		System.out.println("Implenting method referncing");//non-static Method referencing
		//InterfaceA aobj=new ClassB()::meth1;
		//InterfaceA aobj=ClassB ::meth2;// static method referencing
		InterfaceA aobj=ClassB::new;
		aobj.m1();
	}
	public static void main(String[] args) {
		new Method_Referencing().display();
		
		}
	

}
