public class ArrOf_Objects {
  public static void main(String[] args) {
    // Vehicle vehicle1 = new Vehicle("Mustang", "Red");
    // Vehicle vehicle2 = new Vehicle("Corvette", "Blue");
    // Vehicle vehicle3 = new Vehicle("Charger", "Yellow");
    // Vehicle[] vehicles = {vehicle1, vehicle2, vehicle3};

    //Contructing a new object without giving the object a unique identifier like Car1,2,3..
    //These are known as anonymous objects
    Vehicle[] vehicles = {new Vehicle("Mustang", "Red"), 
                          new Vehicle("Corvette", "Blue"), 
                          new Vehicle("Corvette", "Blue")};

    for(Vehicle vehicle : vehicles){
      vehicle.color = "black";
    }
    for(Vehicle vehicle : vehicles){
      vehicle.drive();
    }
  }
}
