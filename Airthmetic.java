public class Airthmetic {
  public static void main(String[] args){

    //Airthmetic Operators

    int x = 10;
    int y = 3;
    int add , sub , mul , div , rem;

    add = x + y; //Addition
    System.out.println("add: " + add);
    sub = x - y; //Subtraction
    System.out.println("sub: " + sub);
    mul = x * y; //Multiplication
    System.out.println("mul: " + mul);
    div = x / y; //Division
    System.out.println("div: " + div);
    rem = x % y ; //Remainder
    System.out.println("rem: " + rem);

    //Augmented Asignment operators
    //to write this in short way even x = x + y;
    //a + = b; -> 13
    //a -= b; -> 7
    //a *= b; -> 30
    //a /= b; -> 3
    //a %= b; -> 1

    //Increment and decrement opr
    int s = 1;
    s++; //increment one by one -> s=2
    s++; //                      -> s=3
    System.out.println("s: " + s);

    int t = 1;
    t--; // t= 0
    t--; // t= -1
    System.out.println("t: " + t);

    //Order of operations [P-E-M-D-A-S]
    //left to right - parenthesis , exponents , multiply , divide , addition , subtraction 
    double result = 3 + 4 * (7-5) / 2.0;
    System.out.println(result);  //7
  }
}