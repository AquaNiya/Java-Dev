public class Inheritnce{
  public static void main(String[] args){

    //Inheritance = One class inherits the attributes and methods from another class.
    // Child <- Parent
    // Child <- Parent <- Grandparent(Multi level Inheriatnce
    //Ex; Animal Class
    Dog dog = new Dog();
    Cat cat = new Cat();
    Plant plant = new Plant();

    System.out.println(dog.isAlive);
    System.out.println(cat.isAlive);

    cat.eat();

    System.out.println(dog.lives);
    System.out.println(cat.lives);

    dog.speak();
    cat.speak();

    System.out.println(plant.isAlive);
    plant.photosynthesize();
  }
}