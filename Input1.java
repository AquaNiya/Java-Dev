import java.util.Scanner;
public class Input1 {
  public static void main(String[] args){
    //Calculate area of rectangle
  
    double height = 0;
    double width = 0;
    double area = 0;
    
    Scanner scanner = new Scanner(System.in);
    
    System.out.print("Enter the height: ");
    height = scanner.nextDouble();
    
    System.out.print("Enter the width: ");
    width = scanner.nextDouble();
    
    area = height * width;
    System.out.println("The area is: " + area + "cm^2");
    
  }
}
