import java.util.Scanner;
public class While_loops {
  public static void main (String[] args){

    //while loop = repeat some code forever
    //while some condition remains true
    
    Scanner scanner = new Scanner(System.in);
    
    String name = "";

    while(name.isEmpty()){
      System.out.print("Enter your name: ");
      name = scanner.nextLine();
    }
    
    System.out.println("Hello " + name);

    //Infinite loop
    /* 
    while(1 == 1){
      System.out.println("Help! I'm stuck in a loop!!"); 
      //thus while repeats a set of code until the condn isn't fulfilled
    }
    */

    //Imaginary game
    String response = "";
    while(!response.equals("Q")){
      System.out.println("Your are in a game loop");
      System.out.println("Press Q to quit");
      response = scanner.next().toUpperCase();
    }

    System.out.println("You've quit the game");
    scanner.close();
  }
}
