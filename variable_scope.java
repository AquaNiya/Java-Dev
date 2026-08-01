public class variable_scope {

  static int x = 3; //CLASS
  //even after deleting local variables it prints class scope variable
  public static void main(String[] args){

    //variable scope = where a variable can be accessed
    //local scope - inside of a method if a variable is declared
    //class scope - generally built inside a class

    int x = 1; //LOCAL
    System.out.println(x);
    doSomething();
  }
  static void doSomething(){
    int x = 2; //LOCAL
    System.out.println(x);
  }
}
//Java uses any local variable first if both local & class var. available
//if they both share variable suppose x 
// class scope can be accessed in the whole class
