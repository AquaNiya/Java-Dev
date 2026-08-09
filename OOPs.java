public class OOPs {
  public static void main(String[] args){

    //Object = An entity tht holds data (attributes)
    //         and can perform actions (methods)
    //         It is a refrence data type
    //We store the data for an object in a locn called heap
    //class is considered as a blueprint for an object

    // Create class objects - class Car

    /*Object we already have
    Scanner scanner = new Scanner(System.in);
    Random random = new Random();*/

    //To create car object
    Car car = new Car();

    //car.isRunning = true; -> change the attribute of isRunning

    System.out.println(car.model); //objects are refrence data type thus can't be accessed directly
    System.out.println(car.make);
    System.out.println(car.year);
    System.out.println(car.price);
    

    System.out.println(car.isRunning);
    car.start();
    System.out.println(car.isRunning);
    car.stop();
    System.out.println(car.isRunning);
    car.drive();
    car.brake();
  }
}
