//Random numbers - to work with random numbers we need to import random class
import java.util.Random;

public class random_no {
  public static void main(String [] args){
    
    //For creating a random object-: class-name nameOf-random-object = new class-Random();
    Random random = new Random();

    //Rolling of 3 dice
    int number1;
    int number2;
    int number3;

    number1 = random.nextInt(1,7); //(1- inclusive , 7- exclusive)
    number2 = random.nextInt(1,7);
    number3 = random.nextInt(1,7);

    System.out.println("Dice 1 :" + number1);
    System.out.println("Dice 2 :" + number2);
    System.out.println("Dice 3 :" + number3);
    System.out.println("\n");

    // Generate 3 Random numbers btw 1 & 100 
    int a;
    int b;
    int c;

    a = random.nextInt(1,101);
    b = random.nextInt(1,101);
    c = random.nextInt(1,101);

    System.out.println("First no. : " + a);
    System.out.println("Second no. : " + b);
    System.out.println("Third no. : " + c);

    //Generate random doubles
    double num;
    num = random.nextDouble(); //btw 0 & 1
    System.out.println("Random Number btw 0 & 1 " + num );

    //Heads - Tails : Coin Flip using boolean
    boolean isHeads;
    isHeads = random.nextBoolean();

    if(isHeads){
      System.out.println("HEADS");
    }
    else{
      System.out.println("TAILS");
    }
    
  }
}
