public class Lux_car {
  String make;
  String model;
  int year;
  String color;

  public Lux_car(String make, String model, int year, String color){
    this.make = make;
    this.model = model;
    this.year = year;
    this.color = color;
  }
  @Override
  public String toString(){
    return this.color + " " + this.year + " " + this.make + " " + this.model;
    

  }
}
