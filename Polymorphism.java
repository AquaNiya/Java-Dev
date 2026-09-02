public class Polymorphism {
  public static void main(String[] args) {

    //Polymorphism allows us to perform a single action in different ways. 
    // Polymorphism = "Poly" (many) + "morphs" (forms/shapes)
    //Objects can identify as other objects
    //Objects can be treated as instances of their parent class
    
    //Let's create abstract class Motor, Mcar, Mbike, and Mboat classes.
    Motor mcar = new Mcar();
    Motor mbike = new Mbike();
    Motor mboat = new Mboat();

    //Now we can call the go() method on each object
    mcar.go(); // Output: Car is moving  
    mbike.go(); // Output: Bike is moving
    mboat.go(); // Output: Boat is moving
    
    Motor[] motors = {mcar, mbike, mboat};
    
    for (Motor motor : motors) {
      motor.go();
    }
  }
}