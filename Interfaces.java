public class Interfaces {
  public static void main(String[] args) {
    //interface = a template that can be applied to a class
    //similar to an abstract class, but specifies what a class must do
    //interface cannot be instantiated, but can be implemented by classes or extended by other interfaces
    //an interface can contain abstract methods and variables (constants)
    //interfaces form a contract between the class and the outside world, and this contract is enforced at build time by the compiler
    //Supports multiple inheritance, a class can implement multiple interfaces

    //Create different interfaces Prey, Predator
    //Then create different classes Rabbit, Hawk,& Bear that implement these interfaces

    Rabbit rabbit = new Rabbit();
    rabbit.flee();

    Hawk hawk = new Hawk();
    hawk.hunt();

    Bear bear = new Bear();
    bear.flee();
    bear.hunt();
  }
}
