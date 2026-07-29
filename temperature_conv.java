import java.util.Scanner;
public class temperature_conv {
  public static void main(String[] args){

    Scanner scanner = new Scanner(System.in);

    double temp;
    double newtemp;
    String unit;

    System.out.print("Enter the temperature: ");
    temp = scanner.nextDouble();

    System.out.print("Convert to Celcius or Fahremheit? (C or F): ");
    unit = scanner.next().toUpperCase(); //method chaining after next()
    
    System.out.println(temp);
    System.out.println(unit);
    scanner.close();
  }
  
}
