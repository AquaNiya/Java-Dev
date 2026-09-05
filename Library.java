public class Library {
  String name;
  int year;
  Book[] books;

  Library(String name, int year, Book[] books) {
    this.name = name;
    this.year = year;
    this.books = books;
  }
  void displayInfo() {
    System.out.println("Library Name: " + this.name);
    System.out.println("Established Year: " + this.year);
    System.out.println("Books in the Library:");
    for (Book book : books) {
      System.out.println("- " + book.displayInfo());
    }
  }
}
