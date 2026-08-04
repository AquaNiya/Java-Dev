public class tele_num_pad {
  public static void main(String[] args) {
    
    //Tele Number Pad Program using 2D array and enhanced for loop

    char[][]telephone = {{'1', '2', '3'},
                        {'4', '5', '6'},
                        {'7', '8', '9'},
                        {'*', '0', '#'}};

    for(char[] row : telephone){
      for(char number : row){
        System.out.print(number + " ");
      }
      System.out.println(); //New line after each row
    }
  }
}
