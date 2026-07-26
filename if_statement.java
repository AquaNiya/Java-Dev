public class if_statement {
  public static void main (String[] args){

    //if statement = performs a block of code it its condn is true

    int age = 25;

    if(age >= 18){
      System.out.println("You're an adult!");
    }
    else if(age >= 65){
      System.out.println("You're an old age!");
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
  }
}
