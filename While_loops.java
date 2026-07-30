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

    //User age
    int age = 0;
    System.out.println("Enter your age");
    age = scanner.nextInt();

    while(age < 0){
      System.out.println("Your age can't be negative");
      System.out.print("Enter your age");
    }
    System.out.println("You are " + age + " years old");

    // in do-while loop u'll once go through do loop condn and then go for while loop condn
    // whereas in while loop u may skip the condition if false

    int number = 0;
    do{
      System.out.println("Enter a number btw 1-10: ");
      number = scanner.nextInt();
    }while(number < 1 || number > 10 );
    System.out.println("You picked " + number);
    scanner.close();
  }
}
