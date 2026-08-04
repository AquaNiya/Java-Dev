public class varargs {
  public static void main (String[] args) {
    
    //varargs => Variable arguments 
    //allows a method to accept a varying # of arguments of the same type
    //makes methods more flexible, no need for overloaded methods
    //java will pack the arguments into an array and pass it to the method
    // ... (ellipsis) is used to declare a varargs parameter

    System.out.println(add(1, 2, 3, 4, 5));
    System.out.println(average());
  }
  static int add(int... numbers){
    int sum = 0;
    
    //Enhanced for loop to iterate through the numbers array
    for(int number: numbers){
      sum += number;
    }
    return sum;
  }

  static double average(double... avgs){
    double sum = 0;
    
    //if the length of the avgs array is 0, return 0 to avoid division by zero
    if(avgs.length == 0){
      return 0;
    }
    for(double avg: avgs){
      sum += avg;
    }
    return sum / avgs.length;
  }
}
