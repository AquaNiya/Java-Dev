import java.util.Scanner;
public class Runtime_Polymorphism{
  public static void main(String[] args){

    //Runtime polymorphism (Dynamic Polymorphism) 
    // Whent the method tht gets executed is decided at runtime bases on the actual type of object

    //Create an abstract class of pet & pets- Pug , Persian
    // Pet pet = new Pet(); This line will cause a compilation error since Pet is abstract and cannot be instantiated.
    
    Scanner scanner = new Scanner(System.in);
    Pet pet;
    System.out.println("Would you like to buy a dog or cat? (1= dog , 2= cat): ");
    int choice = scanner.nextInt();
    
    if (choice == 1) {
      pet = new Pug();
    } else {
      pet = new Persian();
    }
    
    pet.speak(); // Output will depend on the actual type of object
    scanner.close();
  }
}