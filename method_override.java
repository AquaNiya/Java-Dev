public class method_override {
  public static void main(String[] args){

    //Method overriding = When a subclass provides its own
    //                    implementation of a method tht is already defined.
    //            Always for code reusability & give specific implementation.
    
    //Construct objects
    Lion lion = new Lion();
    Pussy pussy = new Pussy();
    Fish fish = new Fish();

    lion.move();
    pussy.move();
    fish.move();

  }
}
