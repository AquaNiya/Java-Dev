public class twoD_array {
  /**
   * @param args
   */
  public static void main(String[] args) {
    
    //2D array => Multi Dimensional arrays
    //array of arrays(an arr where each element is an array)
    //can be visualized as a table with rows and columns - for storing a matrix of data 

    String[] fruits = {"mango", "apple", "banana"}; //1D array
    String[] vegetables = {"carrot", "broccoli", "spinach"}; //1D array
    String[] meats = {"chicken", "beef", "pork", "fish"}; //1D array

    String[][] groceryStore1 = {fruits, vegetables, meats}; //2D array
    groceryStore1[3] = cheese;

    String[][] groceryStore = {
      {"mango", "apple", "banana"}, //row 0
      {"carrot", "broccoli", "spinach"}, //row 1
      {"chicken", "beef", "pork", "fish"} //row 2
    };

    //to change an element in a 2D array, we need to specify the row and column index
    groceryStore[0][1] = "kiwi"; //change "apple" to "kiwi"
    groceryStore[2][3] = "salmon"; //change "fish" to "salmon"
    groceryStore[1][0] = "potato"; //change "carrot" to "potato"
    
    for(String[] foods : groceryStore){ //Enhanced for loop
      for(String food : foods){
        System.out.print(food + "  ");
      }
      System.out.println(); //New line after each row
    }
  }
}
