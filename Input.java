import java.util.Scanner; //import the Scanner class
public class Input {
  public static void main (String[] args){
    //User input - allow user to provide input to the program while it is running
    //Scanner class - object used to get user input, 
    //                & it is found in the java.util package
    Scanner scanner = new Scanner(System.in); //create a Scanner object
    
    System.out.print("Enter your name: ");
    String name = scanner.nextLine(); //read user input
    //nextLine() - reads a line of text (String) including any spaces
    //String name1 = scanner.next();
    //next() - reads a single word (String) until a space is encountered
    
    System.out.print("Enter your age: ");
    int age = scanner.nextInt();
    //nextInt() - reads an integer (whole number)
    
    System.out.print("Enter your GPA: ");
    double gpa = scanner.nextDouble();
    //nextDouble() - reads a double (decimal number)
    
    System.out.print("Are you a student? (true/false): ");
    boolean isStudent = scanner.nextBoolean();
    //nextBoolean() - takes true/false as input

    System.out.println("Hello, " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("Your GPA is " + gpa);
    
    if(isStudent){
      System.out.println("You're enrolled as a student");
    } else{
      System.out.println("You are NOT enrolled");
    }


    //Common Issues
    System.out.print("Enter your age: ");
    int Age = scanner.nextInt();
    System.out.println("Enter your fav color: ");
    String color = scanner.nextLine();
    System.out.println("You are "+ age + "years old");
    System.out.println("You like colour " + color);
    scanner.close(); //close the scanner object
  }
}


