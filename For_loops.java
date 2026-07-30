import java.util.Scanner;
public class For_loops {
  public static void main(String[] args)throws InterruptedException{
    
    //for loop = execute some code a CERTAIN amount of times
    //whereas while loop could execute infinite amnts of time until the condn gets true
  
    //for(iteration; condition; step)
    //index or counter to start ; a condn to stop ; and update of counter
    for(int i = 1; i <= 10; i++ ){
      System.out.println(i);
      System.out.println("Pizza");
    }
    System.out.println("\n");

    for(int j = 10; j > 0; j-- ){
      System.out.println(j);
    }
    System.out.println("\n");

    for(int k = 0; k < 10; k +=2){
      System.out.println(k);
    }
    System.out.println("\n");

    for(int i = 10; i > 0; i -=2){
      System.out.println(i);
    }
    System.out.println("\n");


    Scanner scanner = new Scanner(System.in);
    System.out.println("Enter how many times you want to loop: ");
    int max = scanner.nextInt();
    for(int i=1; i<max; i++){
      System.out.println(i);
    }
    System.out.println("\n");

    //Countdown stimulation
    int start = 10;
    for(int i = start; i > 0; i--){
      System.out.println(i);
      Thread.sleep(1000); 
    //throws InterruptedException when a thread running the method is interrupted while it is sleeping , waiting , or paused in its execution
    }
    System.out.println("HAPPY NEW YEAR!!");
    scanner.close();
    
  }
}
