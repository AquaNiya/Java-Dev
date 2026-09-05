public class Aggregation {
  public static void main(String[] args) {
    // Aggregation is a special form of association where the child can exist independently of the parent.
    // It represents a "Has-A" relationship between two classes / objects.
    // In aggregation, the child object can exist independently of the parent object.
    // One object contains another object as part of it's structure,
    // but the contained object can exist independently of the container object.

    // Example: A Library has Books, but a Book can exist without a Library.  
    Book book1 = new Book("The Great Gatsby", 180);
    Book book2 = new Book("To Kill a Mockingbird", 281);
    Book book3 = new Book("1984", 328);

    Book[] books = {book1, book2, book3};
    Library library = new Library("City Library", 2020, books); 
    library.displayInfo();
  }
}
