public class Methods {
  public static void main(String[] args) {
    
    // method = a block of reusable code that is executed when called()
    // D.R.Y principle - DOn't repeat yourself
    //methods are not familiar of variables inside of another method

    String name = "Bro";
    int age = 25;
    happyBirthday(name, age); //argments
    //to pass a value in another method we need arguments declared with a set of parameters

    double result = square(3);
    System.out.println(result);

    System.out.println(cube(3));

    String fullName = getFullName("Spongebob", "Squarepants");
    System.out.println(fullName);

    int Age = 21;
    if(ageCheck(Age)){
      System.out.println("You may sign up");
    }
    else{System.out.println("You must be 18+ to sign up");}
  }
  //The name of the parameters could be different from the arguments
  //Data type and order to receive must be correct
  //                        parameters
  static void happyBirthday(String name, int age){
    System.out.println("Happy Birthday to you!");
    System.out.printf("Happy Birthday to you %s!\n", name);
    System.out.printf("You are %d years old!\n", age);
    System.out.println("Happy Birthday to you!\n");
  }
  static double square(double number){
    return number * number;
  }
  static double cube(double number){
    return number * number * number;
  }
  static String getFullName(String first, String last){
    return first + " " + last;
  }
  static boolean ageCheck(int Age){
    if(Age >= 18){
      return true;
    }
    else{
      return false;
    }
  }
}
