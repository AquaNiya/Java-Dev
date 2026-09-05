public class Composition {
  public static void main(String[] args) {
    // Composition is a special form of association where the child cannot exist independently of the parent.
    // It represents a "Part-Of" relationship between two classes / objects.
    // In composition, the child object cannot exist independently of the parent object.
    // One object contains another object as part of its structure,
    // and the contained object cannot exist independently of the container object.

    // Example of Composition: A bike & its parts (engine, wheels, etc.) are part of the bike and cannot exist independently of the bike.
    Bike bike = new Bike("Mountain Bike", 2020, "Electric");
    System.out.println("Bike Model: " + bike.model);
    System.out.println("Bike Year: " + bike.year);
    System.out.println("Engine Type: " + bike.engine.type);

    bike.startBike();

    // Example: Room & House
    Room[] rooms = {
      new Room("Living Room", 300),
      new Room("Bedroom", 200),
      new Room("Kitchen", 150)
    };

    House house = new House("Dream House", 2021, rooms);
    System.out.println("House Name: " + house.name);
    System.out.println("House Year: " + house.year);
    for (Room room : house.rooms) {
      System.out.println("Room: " + room.name + ", Area: " + room.area);
    }
  }

  static class Bike {
    String model;
    int year;
    Engine engine;

    Bike(String model, int year, String engineType) {
      this.model = model;
      this.year = year;
      this.engine = new Engine(engineType);
    }

    void startBike() {
      System.out.println("The bike is starting...");
    }
  }

  static class Engine {
    String type;

    Engine(String type) {
      this.type = type;
    }
  }

  static class House {
    String name;
    int year;
    Room[] rooms;

    House(String name, int year, Room[] rooms) {
      this.name = name;
      this.year = year;
      this.rooms = rooms;
    }
  }

  static class Room {
    String name;
    int area;

    Room(String name, int area) {
      this.name = name;
      this.area = area;
    }
  }
}
