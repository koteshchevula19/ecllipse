package inheritance;

public class Car extends Vehicle {
	String color;

	public Car(String color) {
		super("Lexus", "ES", 2021);
		this.color = color;
	}

	public void honk() {
		System.out.println("honk method");
	}

	public static void main(String[] args) {
		Car obj = new Car("Blue");
		obj.drive();
		obj.honk();

	}
}
