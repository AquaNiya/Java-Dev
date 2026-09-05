public class wrapper_class {
  public static void main(String[] args) {
    // Wrapper classes in Java are used to convert primitive data types into objects.
    // Each primitive data type has a corresponding wrapper class.
    // For example, int has Integer, double has Double, char has Character, etc.

    // Wrapper classes provide utility methods for converting between primitive types and their corresponding wrapper objects.
    // Generally, wrapper classes are used when we need to work with objects instead of primitives, such as in collections (e.g., ArrayList) or when we need to use methods provided by the wrapper classes.
    // allows use of Collections Framework & static Utility methods for parsing and converting values.

    // Example of using wrapper classes:
    //This technique is called Autoboxing - directly assigning primitive values to wrapper class objects.

    Integer a = 123;
    Double b = 3.14;
    Character c = '$';
    Boolean d = false;
    String e = "Pizza";

    // Unboxing - converting wrapper class objects back to primitive values.
    int x = a; // Unboxing Integer to int 
    double y = b; // Unboxing Double to double
    char z = c; // Unboxing Character to char
    boolean w = d; // Unboxing Boolean to boolean
    
    //Primitive to string conversion using wrapper classes
    String str1 = Integer.toString(x); // Convert int to String
    String str2 = Double.toString(y); // Convert double to String
    String str3 = Character.toString(z); // Convert char to String
    String str4 = Boolean.toString(w); // Convert boolean to String

    String str5 = str1 + " " + str2 + " " + str3 + " " + str4;
    System.out.println("Primitive to String Conversion: " + str5);

    //String to int conversion using wrapper classes
    String str6 = "456";
    int num1 = Integer.parseInt(str6); // Convert String to int
    System.out.println("String to int Conversion: " + num1);
    double num2 = Double.parseDouble("3.14"); // Convert String to double
    System.out.println("String to double Conversion: " + num2);
    char ch = "Pizza".charAt(0); // Convert String to char
    System.out.println("Character Conversion: " + ch);
    boolean bool = Boolean.parseBoolean("true"); // Convert String to boolean
    System.out.println("String to boolean Conversion: " + bool);

    char letter = 'A';
    System.out.println(Character.isLetter(letter));
    System.out.println(Character.isDigit(letter));
    System.out.println(Character.isWhitespace(letter));
    System.out.println(Character.isUpperCase(letter));

  }
}
