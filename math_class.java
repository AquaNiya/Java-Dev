public class math_class {
  public static void main(String[] args){

    //Built-in constant of math class
    //Value of PI 
    System.out.println("Value of PI" + Math.PI);

    //Value of exponential const - Euler's constant
    System.out.println("Value of e: " + Math.E);

    //Power in Math class
    double result;
    result = Math.pow(2,3); //pow(a,b) - raise a base to the given power
    System.out.println("Power value: " + result);

    //Absolute value in Math class
    double result1;
    result1 = Math.abs(-5); // -ve value into +ve
    System.out.println("Absolute value " + result1);

    //Square root method
    double square_root;
    square_root = Math.sqrt(9);
    System.out.println("Square root is: " + square_root);

    //Round method
    double a;
    a = Math.round(3.14); //rounds a no. to the nearest whole integer
    System.out.println("Round no: " + a);

    //Ceil method
    a = Math.ceil(3.14); //Rounded off to the ceiling value
    System.out.println("Ceil value: " + a);
    
    //Floor method
    double b;
    b = Math.floor(3.99);
    System.out.println("Floor vlaue: " + b); // to round down the vlaue
    
    //Maximum btw two values
    double maximum;
    maximum = Math.max(104, 140);
    System.out.println("Maximum is: " + maximum);

    //Minimum btw two values
    double minimum;
    minimum = Math.min(10,20);
    System.out.println("Minimum is: " + minimum);

    
  }
}

