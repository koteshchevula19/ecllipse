package inheritance;

public class Vehicle {

	String brand;
	String model;
	int year;

	public Vehicle(String brand, String model, int year) {
		this.brand=brand;
		this.model=model;
		this.year=year;

	}

	public void drive() {
		System.out.println("Drive method");
	}

}
