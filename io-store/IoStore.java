import java.io.FileWriter;
import java.io.IOException;

public class IoStore {
  public static void main(String[] args) {
    try {
      FileWriter myWriter = new FileWriter("iostore.txt");
      myWriter.write("Write a Program to create a file that can store information.");
      myWriter.close();
      System.out.println("Write successful!");
    } catch (IOException e) {
      System.out.println("An error occurred.");
      e.printStackTrace();
    }
  }
}
