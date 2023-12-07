class PathDemo {
  public static void main(String[] args) {
    if (args.length == 0) {
      System.out.println("Usage: PathDemo element_1 element_2 ...");
      return;
    }
    java.nio.file.Path path = java.nio.file.Paths.get("", args);
    for (int i=0; i<path.getNameCount(); i++) {
      System.out.printf("Path element %d is %s\n", i, path.getName(i));
    }
    System.out.println(path.toString());
    java.nio.file.Path rootPath = path.getRoot();
    if (path.isAbsolute()) {
      System.out.println("The root path is " + rootPath.toString());
      System.out.println("The path is an absolute path.");
    } else {
      System.out.println("The path is a relative path.");
    }
    java.nio.file.Path normPath = path.normalize();
    System.out.println("The normalized path is " + normPath.toString());
    
    if (path.endsWith(java.nio.file.Paths.get("Hw1.java"))) {
      System.out.println("The file pointed by the path is a Java file");
    } else if (path.endsWith(java.nio.file.Paths.get("Hw1.txt"))) {
      System.out.println("The file pointed by the path is a text file");
    } else {
      System.out.println("None of the above");
    }
    
    java.nio.file.Path another = java.nio.file.Paths.get("", "users1");
    System.out.println(path.compareTo(another));
    System.out.println(path.toString());
    System.out.println(another.toString());
  }
}
