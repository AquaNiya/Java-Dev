import java.util.Scanner;
public class Weight_conv {
  public static void main(String[] args){

    //Weight conversion program

    Scanner scanner = new Scanner(System.in);

    //Declare variables
    double weight;
    double newWeight;
    int choice;
    
    System.out.println("Weight conversion program");
    System.out.println("1: convert lbs to kgs");
    System.out.println("2: Convert kgs to lbs");

    System.out.print("Choose an option: ");
    choice = scanner.nextInt();
    
    if (choice == 1){
      System.out.print("Enter the weight in lbs: ");
      weight = scanner.nextDouble();
      newWeight = weight * 0.453592;
      System.out.printf("The new weight in kgs is: %.2f", newWeight);
    }
    else if (choice == 2){
      System.out.print("Enter the weight in kgs: ");
      weight = scanner.nextDouble();
      newWeight = weight * 2.20462;
      System.out.printf("The new weight in lbs is: %.2f", newWeight);
    }
  }
}
