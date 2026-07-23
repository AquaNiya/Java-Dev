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
    //x = x + y;
    // a + = b;
    //a -= b;
    //a *= b;
    //a /= b;
    //a %= b;

    //Increment and decrement opr
    int s = 1;
    s++; //increment one by one
    s++;
    System.out.println("s: " + s);
  }
}