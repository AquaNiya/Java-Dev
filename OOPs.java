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
    Car car1 = new Car();

    //car.isRunning = true; -> change the attribute of isRunning

    System.out.println(car1.model); //objects are refrence data type thus can't be accessed directly
    System.out.println(car1.make);
    System.out.println(car1.year);
    System.out.println(car1.price);
    

    System.out.println(car1.isRunning);
    car1.start();
    System.out.println(car1.isRunning);
    car1.stop();
    System.out.println(car1.isRunning);
    car1.drive();
    car1.brake();

    Car car2 = new Car();
    System.out.println(car1.make + " " + car1.model);
    System.out.println(car2.make + " " + car2.model);
    //different cars having same sttributes and mothods
    //thus came contructors ; by passing an argument we can create unique objects
  }
}
