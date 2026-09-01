public class Bear implements Prey, Predator {
  @Override
  public void flee() {
    System.out.println("The bear is running away!");
  }

  @Override
  public void hunt() {
    System.out.println("The bear is hunting!");
  }
}
