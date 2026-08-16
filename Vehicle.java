public class Vehicle {
	String model;
	String color;

	public Vehicle(String model, String color) {
		this.model = model;
		this.color = color;
	}

	public void drive() {
		System.out.println("You drive the " + this.color + " " + this.model);
	}
}
// For array of objects