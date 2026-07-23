public class Variable {
  public static void main(String[] args) {
    // variable = a reusable container for a val
    //            a variable behaves as if it was the val it contains
    //syntax:- type variableName = value;
    // Primitive var - simple val stored directly in memory(stack)
    // data types : int, double, char, boolean
    // Reference var - memory address (stack) tht points to the(heap)
    // data types : string, array, object
    
    //2 Steps to create a variable
    //----------------------------
    //1) declaration - type variableName;
    //2) initialization - variableName = value;

    /*int age; declaration
    age = 20; initialization*/
    int age = 20; //contain whole numbers
    System.out.println("Age is: " + age);

    double gpa = 3.5; //contain decimal numbers
    System.out.println("GPA is: " + gpa);
    double price = 10;
    System.out.println("Price is: " + price);

    char grade = 'A'; //contain single character
    System.out.println("Grade is: " + grade);
    char symbol = '$';
    System.out.println(symbol);

    boolean isStudying = true; //contain true or false
    System.out.println("Is studying: " + isStudying);
    boolean isGraduated = false;
    System.out.println("Is graduated: " + isGraduated);
    
    if(isStudying) {
      System.out.println("You are still studying.");
    } else {
      System.out.println("You are wasting time.");
    }

    String name = "Aqua Niya"; //contain sequence of characters
    System.out.println("HELLO, " + name);
    
    
    System.out.println("Hello, " + name);
    System.out.println("You are " + age + " years old.");
    System.out.println("Your GPA is " + gpa);
    System.out.println("Your grade is " + grade);
    
    boolean forSale = false;
    String car = "Toyota";
    if (forSale){
      System.out.println("There is a " + car + " for sale.");
    }else{
      System.out.println("There is no " + car + " for sale.");
    }
  }
}

