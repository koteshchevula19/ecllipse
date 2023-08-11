package day1;

public class Assess2 {
	public static void main(String[] args) {

		double pi = 3.14, r = 2.0;
		double circumference = 2 * pi * r;
		double area = pi * r * r;
		int length = 3, breadth = 4;
		int RectangleArea = length * breadth;
		System.out.println("Circumference of a circle: " + circumference);
		System.out.println("Area of a circle: " + area);
		System.out.println("Area of Rectangle: " + RectangleArea);
		char c = 'e';
		switch (c) {
		case 'a':
		case 'e':
		case 'i':
		case 'o':
		case 'u':
			System.out.println("It is a vowel");
			break;
		default:
			System.out.println("It is a consonant");

		}
	}

}
