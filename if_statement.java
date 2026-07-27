import java.util.Scanner; //takes user input

public class if_statement {
  public static void main (String[] args){

    /*if statement = performs a block of code it its condn is true
    also the placement of series need to be checked while placing the if-else if-else ladder
    how it works - if statement checks cond'n if it's true we do the code,
                  if not then else if condn & if none of 'em is true else condn is performed*/
    Scanner scanner = new Scanner(System.in);
    
    String name;
    int age;
    boolean isStudent;

    System.out.print("Enter your name: ");
    name = scanner.nextLine();

    System.out.print("Enter your age: ");
    age = scanner.nextInt();

    System.out.print("Are you a student (true/false): ");
    isStudent = scanner.nextBoolean();

    //Group 1
    if (name.isEmpty()){
      //.isEmpty - is a string condition that checks is a stirng is empty or not
      //It gives you a boolean Ture or False
      System.out.println("You didn't enter your name! ");
    }
    else{
      System.out.println("Hello " + name + "!");
    }
    //Group 2
    if(age >= 65){
      System.out.println("You're an old age senior !");
    }
    else if(age >= 18){
      System.out.println("You're an adult!");
    }
    else if(age < 0){
      System.out.println("You haven't been born yet!");
    }
    else if(age == 0){
      System.out.println("You're a new come baby!");
    }
    else{
      System.out.println("You're a child!");
    }

    //Group 3
    if(isStudent){
      System.out.println("You are a student!");
    }
    else{
      System.out.println("You are not a student");
    }
  }
}
