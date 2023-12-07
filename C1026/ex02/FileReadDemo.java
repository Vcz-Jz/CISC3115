import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class FileReadDemo {
  public static void main(String[] args) {
    File file = new File("../ex01/ex01.txt");
    try (Scanner in =  new Scanner(file, "UTF-16")) {
      
      String line = in.nextLine();
      System.out.println("Line read: <" + line + ">");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
  }
/*
  public static void main(String[] args) {
    Scanner in = null;
    try {
      File file = new File("../ex01/ex01.txt");
      in = new Scanner(file, "UTF-16");  
      
      String line = in.nextLine();
      System.out.println("Line read: <" + line + ">");
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    } finally {
      if (in != null) in.close();
    }
    
  }
*/
}
