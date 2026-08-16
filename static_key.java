public class static_key {
  public static void main(String[] args) {
    
    //static keyword = makes a variable or method belong to the class
    //                 rather than to any specific object.
    //       Commonly used for utility methods or shared resources.

    Friend friend1 = new Friend("Spongebob");
    Friend friend2 = new Friend("Patrick");
    Friend friend3 = new Friend("Squidward");
    Friend friend4 = new Friend("Sandy");
    
    System.out.println(friend1.name);
    System.out.println(friend2.name);
    System.out.println(friend3.name);
    System.out.println(friend4.name);
    
    // Optimal way
    System.out.println(Friend.numOfFriends);
    
    Friend.showFriends();

    //In \Math class there's static method - round
    Math.round(3.99); 
  }
}
