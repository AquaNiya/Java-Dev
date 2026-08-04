import java.util.Scanner;
public class search_array {
  public static void main(String[] args) {
    //Search an array for a specific value

    Scanner scanner = new Scanner(System.in);


    int[] numbers = {1, 2, 3, 4, 5};
    int searchValue = 7;
    boolean isFound = false;

    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == searchValue){
        System.out.println(searchValue + " was found at index " + i);
        isFound = true;
        break;
      }
    }

    if(isFound){
      System.out.println(searchValue + " was found in the array.");
    } else {
      System.out.println(searchValue + " was not found in the array.");
    }

    System.out.println("\n");
    //for strings we would compare the memory addresses of the strings using the == operator, 
    // but this is not a reliable way to compare strings in Java. 
    // Instead, we should use the equals() method to compare the values of the strings.

    String[] fruits = {"apple", "banana", "cherry", "date", "elderberry"};
    boolean found = false;
    String target;

    System.out.print("Enter a fruit to search for: ");
    target = scanner.nextLine();
    
    for(int i = 0; i < fruits.length; i++){
      if(fruits[i].equals(target)){
        System.out.println(target + " was found at index " + i);
        found = true;
        break;
      }
    }

    if(found){
      System.out.println(target + " was found in the array.");
    } else {
      System.out.println(target + " was not found in the array.");
    }
    scanner.close();
  }
}
