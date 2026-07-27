public class printf_st {
  public static void main(String[] args){

    //printf statement - is a method used to format output
    // %[flags][width][.precision][specifier-character]

    String name = "Spongebob"; // %s
    char firstLetter = 'S';  // %c
    int age = 30;  // %d
    double height = 60.5;  // %f
    boolean isEmployed = true;  // %b

    System.out.printf("Hello %s\n", name);
    System.out.printf("Your name starts with a %c\n", firstLetter);
    System.out.printf("You are %d years old\n", age);
    System.out.printf("You are %f inches tall\n", height);
    System.out.printf("Employed %b\n" ,isEmployed);

    System.out.printf("%s is %d years old", name , age);
    System.out.println("/n");

    //Precision
    double price1 = 9.99;
    double price2 = 100.15;
    double price3 = -56.01;
    //the output is approximately upto 6 decimal digits

    //Flags
    // + = output a plus
    // , = comma grouping seperator 
    // ( = negative numbers are enclosed in ()
    // space = display a minus if negative, space if positive 
    System.out.printf("%+1f\n", price1); //+ flag used
    System.out.printf("% 3f\n", price2); //space flag used
    System.out.printf("%(2f\n", price3); //( flag used
    System.out.printf("\n");

    //Width
    // 0 = zero padding 
    // number = right justified padding 
    // negative number = left justified padding

    int id1 = 1;
    int id2 = 23;
    int id3 = 456;
    int id4 = 7890;

    System.out.printf("%04d\n", id1); //04 here means- no of pads 4 needs to be padded as 0 
    System.out.printf("%4d\n", id2); //only number thus right justified
    System.out.printf("%-4d\n", id3); //- here means left justified
    System.out.printf("%-4d\n", id4);

  }
}
