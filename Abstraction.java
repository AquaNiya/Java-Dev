public class Abstraction {
  public static void main(String[] args){

    //abstract =  used to define abstract classes and methods
    //Abstraction is the process of hiding implementation details
    //& showing only the essential features;
    //Abstract classes can't be instantiated directly
    //can contain 'abstract methods' (which must be implemented)
    //can contain 'concrete' methods (which are inherited)


    //Create different classes Shape, circle, triangle & rectangle
    Circle circle = new Circle(3.0);
    Triangle triangle = new Triangle(4.0, 5.0);
    Rectangle rectangle = new Rectangle(6.0, 7.0);

    System.out.println("Area of Circle: " + circle.area());
    System.out.println("Area of Triangle: " + triangle.area()); 
    System.out.println("Area of Rectangle: " + rectangle.area());

    circle.display();
    triangle.display(); 
    rectangle.display();
  }
}
