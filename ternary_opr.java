public class ternary_opr {
  public static void main(String[] args){

    //ternary operator ? = Return 1 of 2 values if a condition is true
    // variable = (condition) ? ifTrue : ifFalse;


    //Example 1

    int score = 70;
    /*using if else statement
    if)(score >= 60){
      System.out.println("Pass");
    }else{
      System.out.println("Fail");
    }*/

    String passOrFail = (score >= 60) ? "PASS" : "FAIL";
    System.out.println(passOrFail);

    //Example 2

    int number = 3;
    String evenOrOdd = (number % 2 == 0) ? "EVEN" : "ODD";
    System.out.println(evenOrOdd);
 
    //Example 3
    int hours = 13;
    String timeOfDay = (hours < 12) ? "A.M." : "P.M.";
    System.out.println(timeOfDay);

    //Example 4
    int income = 60000;
    double taxRate = (income >= 40000) ? 0.25 : 0.15;
    System.out.println(taxRate);
  }
}
