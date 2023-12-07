import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

class ReplaceText {
  public static void main(String[] args) {
    if (args.length != 4) {
      helpAndExit(0);
    }
    
    String inFilePath = args[0];
    String outFilePath = args[1];
    String oldString = args[2];
    String newString = args[3];

    File inFile = new File(inFilePath);  
    if (!inFile.exists()) {
      helpAndExit(1);
    }
    
    File outFile = new File(outFilePath);
    if (outFile.exists()) {
      helpAndExit(2);
    }
    
    try {
      replaceText(inFile, outFile, oldString, newString);
    } catch (FileNotFoundException e) {
      System.out.println("Error: " + e.getMessage());
    }
    
  }
  
  public static void helpAndExit(int helpCode) {
    switch (helpCode) {
    case 0:
      System.out.println("Usage: ReplaceText in.txt out.txt old new");
      break;
    case 1:
      System.out.println("Usage: input file must exist");
      break;
    case 2:
      System.out.println("Usage: output file should not exist");
      break;
    }
    System.exit(helpCode);
  }
  
  /*
  public static void replaceText(File inFile, File outFile, String oldString, String newString) 
    throws FileNotFoundException {
    Scanner in = null;
    PrintWriter out = null;
    try {
      in = new Scanner(inFile);
      out = new PrintWriter(outFile);
      
      while (in.hasNext()) {
        String line = in.nextLine();
        String newLine = line.replaceAll(oldString, newString);
        out.println(newLine);
      }
    } finally {
      if (in != null) in.close();
      if (out != null) out.close();
    }
  }
  */
    public static void replaceText(File inFile, File outFile, String oldString, String newString) 
    throws FileNotFoundException {
    Scanner in = null;
    PrintWriter out = null;
    try {
      in = new Scanner(inFile);
      out = new PrintWriter(outFile);
      
      while (in.hasNext()) {
        String line = in.nextLine();
        String newLine = line.replaceAll(oldString, newString);
        out.println(newLine);
      }
    } finally {
      if (in != null) in.close();
      if (out != null) out.close();
    }
  }
  
  
}


