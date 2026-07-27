import java.util.Scanner;
public class CI_calc {
  public static void main(String[] args){

    //Compound Interest calculator

    Scanner scanner = new Scanner(System.in);

    double principal;
    double rate;
    int timesCompounded;
    int years;
    double amount;

    System.out.print("Enter the principal amount: ");
    principal = scanner.nextDouble();

    System.out.print("Enter the interest rate (in %): ");
    rate = scanner.nextDouble() / 100;

    System.out.print("Enter the no. of times compounded per year: ");
    timesCompounded = scanner.nextInt();

    System.out.print("enter the # of years: ");
    years = scanner.nextInt();

    amount = principal * Math.pow(1 + (rate / timesCompounded) , timesCompounded * years);
    // A = P [1+(r/n)] ^nt
    System.out.printf("The amount after %d years is $%.2f", years , amount);

    scanner.close();
  }
}
