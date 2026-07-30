import java.util.Scanner;
public class logical_opr {
  public static void main(String[] args) {
    Scanner scanner = new Scanner (System.in);
    // && = AND
    // || = OR
    // ! = NOT

    //Temperature Example
    double temp = 20;
    boolean isSunny = true; 
    

    if(temp <= 30 && temp >= 0 && isSunny){
      System.out.println("The weather is too good");
      System.out.println("It's sunny outside");
    }
    else if(temp <= 30 && temp >= 0 && !isSunny){
      System.out.println("The weather is too good");
      System.out.println("It's cloudy outside");
    }
    else if (temp >= 30 || temp < 0){
      System.out.println("The weather is bad");
    }
    System.out.println("\n");


    //Username Evaluation
    
    //username must be btw 4-12 characters
    // username must not contain spaces or underscores

    String username;
    System.out.println("Enter your username");
    username = scanner.nextLine();
    
    if (username.length() < 4 || username.length() > 12 ){
      System.out.println("Usename must be btw 4-12 characters");
    }
    else if(username.contains(" ") || username.contains("_")){
      System.out.println("Username must not contain spaces or underscore");
    }
    else{
      System.out.println("Welcome " + username);
    }
    scanner.close();
  }
}
