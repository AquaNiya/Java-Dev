public class getter_setter {
  public static void main(String[] args) {

    //Getter & Setter methods are used to access and modify the private fields of a class.
    //They help protect object data & add rules for accesing and modifying the data.
    //Getters are methods that make a field READABLE
    //Setters are methods that make a field WRITEABLE

    GetSet_Car car = new GetSet_Car("Charger", "Yellow", 10000);
    System.out.println(car.getModel() + " " + car.getColor() + " " + car.getPrice());

    car.setModel("Camaro");
    System.out.println("Updated Model: " + car.getModel());

    car.setColor("Red");
    System.out.println("Updated Color: " + car.getColor());

    car.setPrice(-15000);
    System.out.println("Updated Price: " + car.getPrice());
  }
}
