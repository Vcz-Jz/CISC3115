import java.io.File;

class FileDemo {
  public static void main(String[] args) {
    if (args.length == 0 || args.length > 1) {
      System.out.println("Usage: FileDemo filepathname");
      return;
    }
    
    File file = new File(args[0]);
    System.out.println(file.toString());
    
    if (file.exists()) {
      System.out.printf("The file %s exists.\n", file.toString());
    } else {
      System.out.printf("The file %s does not exist.\n", file.toString());
    }
    
    if (file.canExecute()) {
      System.out.printf("The file %s is executable.\n", file.toString());
    } else {
      System.out.printf("The file %s is not executable.\n", file.toString());
    }
    
    if (file.canRead()) {
      System.out.printf("The file %s is readable.\n", file.toString());
    } else {
      System.out.printf("The file %s is not readable.\n", file.toString());
    }
    
    if (file.canWrite()) {
      System.out.printf("The file %s is writable.\n", file.toString());
    } else {
      System.out.printf("The file %s is not writable.\n", file.toString());
    }
  }
}
