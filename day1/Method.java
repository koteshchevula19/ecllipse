package day1;

public class Method {
	
	static double circumferenceCircle(double pi,double r)
	{
		return 2*pi*r;
	}
	static double areaCircle(double pi,double r)
	{
		return pi*r*r;
	}
	static int areaRectangle(int length,int breadth)
	{
		return length*breadth;
	}
	static boolean check(char c)
	{
		switch(c)
		{
		  case 'a':
	      case 'e':
	      case 'i':
	      case 'o':
	      case 'u': return true;
		  default : return false;
		
		
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double pi=3.14,r=3.2;
		System.out.println("Circumference of a circle :"+circumferenceCircle(pi, r));
		System.out.println("Area of a Circle :"+areaCircle(pi, r));
		System.out.println("Area of a Rectangle:"+areaRectangle(3, 4));
		System.out.println("Is the character vowel:"+check('a'));

	}

}
