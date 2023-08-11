package java8features;

public class Lambda {
	void display()
	{
		InterfaceA aobj=()->System.out.println("Hello world");
		aobj.m1();
	     // InterfaceB bobj=(int i)->System.out.println("Result : "+(i+1));
	      InterfaceB bobj=(i)->System.out.println("Result : "+(i+1));
	     // InterfaceB bobj=i->System.out.println("Result : "+(i+1));
	      bobj.m2(99);
		//InterfaceC cobj=(int a,int b)->System.out.println("Addition : "+(a+b));
		InterfaceC cobj=(a,b)->System.out.println("Addition : "+(a+b));
		//InterfaceC cobj= a,b->System.out.println("Addition : "+(a+b)); C.T.E
		cobj.m3(99, 1);
		InterfaceD dobj=(a,b)->{
			System.out.println("Implementing return type lambda Expressions");
			if(a.equalsIgnoreCase(b))
				return a;
			else
				return a+" "+b;
			
			
			
		};
		String y=dobj.m4("Kotesh","Chevula");
		System.out.println(y);
	}
public static void main(String[] args) {
	new Lambda().display();
}
}
