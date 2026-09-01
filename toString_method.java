public class toString_method {
  public static void main(String[] args){
    //.toString() = M<ethod inherited from the object class.
    // Used to return representation of an object
    // by default, it returns a hash code as a unique identifier.
    // It can be overridden to provide meaningful details

    Lux_car lux_car1 = new Lux_car("Ford", "Mustang", 2025, "Red");
    Lux_car lux_car2 = new Lux_car("Chevrolet", "Camaro", 2024, "Blue");
    System.out.println(lux_car1);//direct object calling - hash code is provided
    System.out.println(lux_car2.toString());//explicit calling of the toString() method
    System.out.println(lux_car2);//direct object calling - hash code is provided
  }
}
