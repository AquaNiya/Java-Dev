public class overloaded__methods {
  public static void main(String[] args) {
    
    //overloaded methods = methods that share the same name,
    //                     but different parameters
    //         signature = name + parameters (no two methods can share the unique method signature)

    System.out.println(add(1,2, 3, 4));
  }
  static double add(double a, double b){
    return a + b;
  }
  static double add(double a, double b, double c){
    return a + b + c; //methods share same name but diff parameters thus unique signature
  }
  static double add(double a, double b, double c, double d){
    return a + b + c + d;
  }
}

/* 
There's one main method and other static methods
with same name yet different parameters
thus defining a unique method signature
*/
