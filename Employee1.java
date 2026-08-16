public class Employee1 extends Person {
  int salary;
  Employee1(String first, String last, int salary){
    super(first, last);
    this.salary = salary;
  }
  void showSalary(){
    System.out.println(this.first + "'s salary is $ " + this.salary);
  }
}
