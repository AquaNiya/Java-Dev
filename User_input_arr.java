import java.util.Scanner;

public class User_input_arr {
  public static void main (String[] args){

    //User input array program

    Scanner scanner = new Scanner(System.in);
   
    String[] foods;
    System.out.print("How many foods do you want to enter?: ");
    
    int size = scanner.nextInt();
    scanner.nextLine(); //Consume the newline character left by nextInt()
    foods = new String[size];
    
    for(int i = 0; i < foods.length; i++){
      System.out.print("Enter a food: ");
      foods[i] = scanner.nextLine();
    }
     
    for(String food: foods){
      System.out.println(food); //Enhanced for loop
    }

    scanner.close();
  }
}