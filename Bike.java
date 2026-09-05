public class Bike {
  String model;
  int year;
  Engine engine;

  Bike(String model, int year, String engineType) {
    this.model = model;
    this.year = year;
    this.engine = new Engine(engineType); // Composition: Engine is part of the Bike
  }
  void startBike() {
    this.engine.start(); // Starting the engine of the bike
    System.out.println("Bike " + this.model + " is running.");
  }
}
