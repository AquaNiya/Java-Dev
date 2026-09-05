public class House {
    private String name;
    private int yearBuilt;
    private Room[] rooms;

    public House(String name, int yearBuilt, Room[] rooms) {
        this.name = name;
        this.yearBuilt = yearBuilt;
        this.rooms = rooms;
    }

    public void displayInfo() {
        System.out.println("House Name: " + name);
        System.out.println("Year Built: " + yearBuilt);
        System.out.println("Rooms:");

        for (Room room : rooms) {
            System.out.println("- " + room.getName() + " (" + room.getArea() + " sq ft)");
        }
    }
}
