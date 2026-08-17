public class Fish extends Animal1 {
  @Override
  //If the method with same name is in child class it gets precedence
  void move(){
    System.out.println("This animal is swimming");
  }
}
