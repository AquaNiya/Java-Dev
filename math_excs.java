import java.util.Scanner;
public class math_excs {
  public static void main(String[] args){
    
    //Exercise1
    //Hypotenuse c = Math.sqrt(a^2 + b^2)

    Scanner scanner = new Scanner(System.in);
    
    double a , b, c;

    System.out.print("Enter the length of side A: ");
    a = scanner.nextDouble();

    System.out.print("Enter the length of side B: ");
    b = scanner.nextDouble();
    
    c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
    System.out.println("The hypotenuse (side c) is : " + c + "cm" );
    System.out.println("\n");

    //Exercise2
    //circumference = 2 * Math.PI * radius;
    //area = Math.PI * Math.pow(radius, 2)
    //volume = (4.0 / 3.0) * Math.PI * Math.pow(radius, 3)
   
    double radius;
    double circumference;
    double area;
    double volume;

    System.out.print("Enter the radius: ");
    radius = scanner.nextDouble();
    
    circumference = 2 * Math.PI * radius; 
    area = Math.PI * Math.pow(radius,2);
    volume = (4/3.0) * Math.PI * Math.pow(radius , 3);

    System.out.printf("The circumference is: %.1fcm\n" , circumference );
    System.out.printf("The area is: %.1fcm^2\n" , area ); 
    System.out.printf("The volume is: %.1fcm^3\n" , volume );
    
    //printf is used to format a string & %.1f specifies here the no. of decimal needed 
    //+ circumference part is wrong as it's turning the number into text and appending it to the format string.
    // So Java no longer sees a proper format string with a matching value for %.1f. Thus use of , is done.555
    scanner.close();
  }
}
