import java.util.Scanner;

public class quiz_game {
  public static void main(String[]args){

    //Java Quiz Game using 2D array and enhanced for loop

    //2D array to store questions and answers
    
    //QUESTIONS array[]
    String[] questions = {"What is the main funtion of a router?", 
                        "What part of the computer is considered the brain?",
                        "What year was Facebook launched?",
                        "Who is known as the father of Computers?",
                        "What was the first programming language?"};
                        
    //OPTIONS array[]
    String[][] options = {{"1. To connect devices to the internet", "2. To store data", "3. To process data", "4. To display information"},
                        {"1. CPU", "2. RAM", "3. Hard Drive", "4. GPU"},
                        {"1. 2004", "2. 2005", "3. 2006", "4. 2007"},
                        {"1. Charles Babbage", "2. Alan Turing", "3. John von Neumann", "4. Steve Jobs"},
                        {"1. Fortran", "2. COBOL", "3. Assembly Language", "4. C"}};

    //DECLARE variables
    int[] answers = {1, 1, 1, 1, 1}; //correct answers (index of the correct option)
    int score = 0; //initialize score to 0
    int guess; //variable to store user's guess

    Scanner scanner = new Scanner(System.in); //create a scanner object to read user input
   
    //WELCOME message
    System.out.println("*****************************");
    System.out.println("Welcome to the Java Quiz Game!");
    System.out.println("*****************************");

    //Questions (loop)
    for(int i = 0; i < questions.length; i++){
      System.out.println(questions[i]); //display question
       //  Options
        for(String option : options[i]){ //enhanced for loop to display options
        System.out.println(option); //display options
      }
      //  Get guess from user
      System.out.print("Enter your guess: ");
      guess = scanner.nextInt();

      //  Check our guess
      if(guess == answers[i]){
        System.out.println("********");
        System.out.println("Correct!");
        System.out.println("********");
        score++; //increment score
      }
      else{
        System.out.println("********");
        System.out.println("Incorrect!");
        System.out.println("********");
      }
    }

    //  Display result
    System.out.println("*****************************");
    System.out.println("Quiz Completed!");
    System.out.println("Your score is: " + score + "/" + questions.length);
    System.out.println("*****************************");

    scanner.close();
  }
}
