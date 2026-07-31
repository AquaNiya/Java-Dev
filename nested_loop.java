import java.util.Scanner;
public class nested_loop {
  public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);
    //nested loop = A loop inside another loop 
    //              Used often with matrices or DS&A
 
    for(int a = 1; a <= 3; a++){
      for(int b = 1; b <= 9; b++){
      System.out.print(b+ " ");
      }
      System.out.println();
    }

    //Mini Project
    int rows;
    int columns;
    char symbol;

    System.out.print("Enter the no. of rows: ");
    rows = scanner.nextInt();

    System.out.print("Enter the no. of columns: ");
    columns = scanner.nextInt();

    System.out.print("Enter the symbol to use: ");
    symbol = scanner.next().charAt(0);

    for(int i = 0; i < rows; i++){
      for(int j = 0; j < columns; j++){
      System.out.print(symbol);
      }
      System.out.println();
    }
    

    scanner.close(); 
  }
}
