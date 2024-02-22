import java.io.*;

public class WroteToFile {
  public static void main(String[] args) throws IOException {
      FileWriter myWriter = new FileWriter("./filename.txt");
      myWriter.write("Files in Java might be tricky, but it is fun enough!");
      myWriter.close();
      System.out.println("Successfully wrote to the file.");
  
    }
  }
