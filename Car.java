public class Car {
  
  //Strings an object has (car) are known as attributes
  String make = "Ford";
  String model = "Mustang";
  int year = 2025;
  double price = 58000.99;
  boolean isRunning = false;

  //Method for class car
  public void start(){
    isRunning = true;
    System.out.println("You start the engine");
  }
  public void stop(){
    isRunning = false;
    System.out.println("You stop the engine");
  }
  void drive(){
    System.out.println("You drive the " + model);
  }
  void brake(){
    System.out.println("You brake the " + model);
  }
}
