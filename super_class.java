public class super_class{
  public static void main (String[] args){

    //super = Refers to the parent class (subclass <- superclass)
    //        used in constructors & method overloading
    //        calls the parent constructor to initialize attrributes

    Person person = new Person("Tom", "Riddle");
    Wizards wizards = new Wizards("Harry", "Potter", 3.25);
    Employee1 employee1 = new Employee1("Rubeus", "Hagrid", 50000);
    
    person.showName();
    System.out.println(wizards.gpa);
    wizards.showGPA();
    employee1.showSalary();
  }
}