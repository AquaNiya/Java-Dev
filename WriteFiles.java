import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFiles {
  public static void main(String[] args) {
    // To write a file using Java :
    // 1) FileWriter = Good for small or medium-sized text files
    // 2) BufferdWriter = Better Performance for large amounts of text
    // 3) PrintWriter = Best for structured data , like reports or logs
    // 4) FileOutputStream = Best for binary files (e.g., img, audio files )

    String filePath = "D:\\Java_Development\\test.txt";
    String textContent = """
    I like Pizza!
    It's really yummy when loaded with cheese.
    Blehhh!!
    """ ;
    try(FileWriter writer = new FileWriter(filePath)){
      writer.write(textContent);
      System.out.println("File has been written");
    }
    catch(FileNotFoundException e){
      System.out.println("Couldn't find file location");
    }
    catch(IOException e){
      System.out.println("Could not write file");
    }
  }
}
