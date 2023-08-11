package day1;

public class Assess3 {
	static void operations(int a, int b, char c) {
		switch (c) {
		case '+':
			System.out.println("Addition of two numbers:" + (a + b));
			break;

		case '-':
			System.out.println("Substraction of two numbers :" + (a - b));
			break;

		case '*':
			System.out.println("Multiplication of two numbers :" + (a * b));
			break;

		case '/':
			System.out.println("Dividend of two numbers :" + (a / b));
			break;

		case '%':
			System.out.println("Modulus of two numbers :" + (a % b));

		}
	}

	static void even(int n) {
		int j = 0, k = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 == 0)
				System.out.println("Even numbers using for loop " + i);
		}
		while (j <= n) {
			if (j % 2 == 0)
				System.out.println("Even numbers using while loop " + j);
			j++;
		}
		do {
			if (k % 2 == 0)
				System.out.println("Even number using Do while " + k);
			k++;

		} while (k < n);
	}

	static void odd(int n) {
		int j = 0, k = 0;
		for (int i = 0; i <= n; i++) {
			if (i % 2 != 0)
				System.out.println("Odd numbers using for loop " + i);
		}
		while (j <= n) {
			if (j % 2 != 0)
				System.out.println("Odd numbers using while loop " + j);
			j++;
		}
		do {
			if (k % 2 != 0)
				System.out.println("Odd number using Do while " + k);
			k++;

		} while (k <= n);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		operations(10, 8, '+');
		even(20);
		odd(20);
		 

	}

}
