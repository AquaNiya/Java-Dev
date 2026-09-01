public class Circle extends Shape {
  double radius;
  //create a constructor to initialize the radius
  Circle(double radius) { 
    this.radius = radius;
  }
  @Override
  double area() {
    return Math.PI * radius * radius;
  }
  @Override
  void display() {
    System.out.println("This is a circle with radius: " + radius);
  }
}
 