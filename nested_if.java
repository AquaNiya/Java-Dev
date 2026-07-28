public class nested_if {
  public static void main (String [] args){

    //Nested if Statements - 

    boolean isStudent = true;
    boolean isSenior = true;
    double price = 9.99;

    if (isStudent){
      if(isSenior){
        System.out.println("You get a senior discount of 20%");
        System.out.println("You get a student discount of 10%");
        price *= 0.7; // total discount of 30%
      }
      else{
        System.out.println("You get a student discount of 10% ");
        price *= 0.9; //10% discount
      } 
    }
    else{
      if(isSenior){
        System.out.println("You get a senior discount of 20%");
        price *= 0.8; //Discount of 20% 
      }
      else{
        price *= 1; //No discount if not a senior or a student
      }
    }

    System.out.printf("The price of a ticket is: $%.2f", price);
  }
}
