import java.util.Scanner;
public class For_loopPrgrm {
   public static void main(String[] args)throws InterruptedException{
    //Countdown stimulation

    Scanner scanner = new Scanner(System.in);

    System.out.println("How many seconds to count down from?: ");

    int start = scanner.nextInt();
    for(int i = start; i > 0; i--){
      System.out.println(i);
      Thread.sleep(1000); 
    //throws InterruptedException when a thread running the method is interrupted while it is sleeping , waiting , or paused in its execution
    }
    System.out.println("HAPPY NEW YEAR!!");
    scanner.close();
  }
}