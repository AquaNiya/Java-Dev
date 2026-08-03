import java.util.Arrays; //import the Arrays class from the java.util package
public class Array {
  public static void main(String[] args){

    //Arrays = a container object that holds a fixed number of values of a single type
    //          0   1   2   3   4 colln of same data type
    //          * think of it as a var. tht can store more than 1 value *

    String a = "apple"; //single variable
    System.out.println(a);

    System.out.println("\n");

    String[] fruits = {"mango", "apple", "banana"}; //array of strings
    System.out.println(fruits); //we'll get a memory address as arrays fall under reference data types
    System.out.println(fruits[0]); //we can access the elements of an array using the index
    System.out.println(fruits[1]);
    System.out.println(fruits[2]);
    // if we access an index that doesn't exist, we'll get an exception error - ArrayIndexOutOfBoundsException
    // System.out.println(fruits[3]); // This would cause an error
  
    System.out.println("\n");

    fruits[2] = "kiwi"; //we can also change the value of an array element using the index
    System.out.println(fruits[2]); //now it will print "kiwi" instead of "banana"

    System.out.println("\n");

    //we can get the length of an array using the length property
    int numOfFruits = fruits.length; 
    System.out.println("Number of fruits: " + numOfFruits); 

    System.out.println("\n");
    
    //we can use a for loop to iterate through the elements of an array
    for(int i = 0; i < fruits.length; i++){ 
      System.out.print(fruits[i] + " "); 
    }

    //Enhanced for loop = a simpler way to iterate through the elements of an array
    //we can also use a for-each loop to iterate through the elements of an array
    
    System.out.println("\n");

    //we can also sort the elements of an array using the sort method from the Arrays class
    Arrays.sort(fruits); 

    //we can also fill an array with a specific value using the fill method from the Arrays class  
    Arrays.fill(fruits, "orange");

    for(String fruit : fruits){
      System.out.println(fruit + " ");
    }
  }
}