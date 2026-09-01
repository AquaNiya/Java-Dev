public abstract class Shape {
  //since Shape is an abstract class, it can contain abstract methods
  //abstract methods are declared without an implementation & can't be  instantiated directly
  abstract double area(); //Abstract method (does not have a body)

  void display() { //Concrete method (has a body) & can be inherited by subclasses
    System.out.println("This is a shape");
  }
}
