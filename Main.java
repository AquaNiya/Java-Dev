public class Main {
    public static void main(String[] args) {
        Room room1 = new Room("Living Room", 300);
        Room room2 = new Room("Bedroom", 200);
        Room room3 = new Room("Kitchen", 150);

        Room[] rooms = { room1, room2, room3 };
        House house = new House("Dream House", 2021, rooms);
        house.displayInfo();
    }
}

