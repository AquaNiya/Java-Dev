public class Animal extends Organism {
	boolean isAlive = true;
	String eat = "This animal is eating";
	int lives = 9;

	public void sleep() {
		System.out.println("This animal is sleeping");
	}

	public void speak() {
		System.out.println("This animal makes a sound");
	}

	public void photosynthesize() {
		System.out.println("The animal cannot photosynthesize");
	}
}

