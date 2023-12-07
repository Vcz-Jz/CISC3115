import java.io.File;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import java.io.UnsupportedEncodingException;

class FileWriteDemo {
  public static void main(String[] args) {
      File file = new File("./ex01.txt");
      try (PrintWriter out = new PrintWriter(file, "UTF-16")) {
        //char[] c;
        //// unicodde codepoint of 'A' is 0 0000 0000 0000 0100 0001
        //c = Character.toChars(0x00000041);       
        //out.print(c);
       
        int n = 10;
        int d = 0;
        out.printf("%d / %d = ", n, d);
        int quotient = n / d;
        out.printf("%d\n", quotient);
        

        // out.close(); // this is a wrong way, but often appears in textbook
      } catch (FileNotFoundException e) {
        System.err.println("Error: " + e.getMessage());
      } catch (UnsupportedEncodingException e) {
        System.err.println("Error: " + e.getMessage());
      } catch (ArithmeticException e) {
        System.err.println("Error: " + e.getMessage());
      } 
  }
/*
  public static void main(String[] args) {
      File file = new File("./ex01.txt");
      PrintWriter out = null;
      try {
         out = new PrintWriter(file, "UTF-8");
    
        
        //char[] c;
        //// unicodde codepoint of 'A' is 0 0000 0000 0000 0100 0001
        //c = Character.toChars(0x00000041);       
        //out.print(c);
       
        int n = 10;
        int d = 0;
        out.printf("%d / %d = ", n, d);
        int quotient = n / d;
        out.printf("%d\n", quotient);
        

        // out.close(); // this is a wrong way, but often appears in textbook
      } catch (FileNotFoundException e) {
        System.err.println("Error: " + e.getMessage());
      } catch (UnsupportedEncodingException e) {
        System.err.println("Error: " + e.getMessage());
      } catch (ArithmeticException e) {
        System.err.println("Error: " + e.getMessage());
      } finally {
        if (out != null) out.close();
      }
  }
*/
}
