import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;

class ListCandidates {
  private String inFilePath;
  private String hobbyWanted;
  private double minGpa;
  private String outFilePath;
  
  public ListCandidates(String inFilePath, double minGpa, String hobbyWanted, String outFilePath) {
    this.inFilePath = inFilePath;
    this.minGpa = minGpa;
    this.hobbyWanted = hobbyWanted;
    this.outFilePath = outFilePath;
  }
  
  public static void main(String[] args) {

    ListCandidates client = parseCommandLineArgs(args);
    if (client == null) return;
    
    try {
      // design 1: an object represents the school that has students
      // design 1.1: what error conditions are there?
      //             (a) cannot find the file -- java.io.FileNotFoundException
      //             (b) cannot read file     -- java.io.IOException
      //             (c) when you read the file, the file format is wrong
      //                                      -- MalformedInputFileException (our own)
      School school = School.loadStudents(client.inFilePath);
      
      // desigh 2. the School object should have a method to 
      //           look for students who have a given hooby and
      //           whose GPA is no less than a threshold
      // design 2.1 is there any errors here? 
      ArrayList<Student> studentList = school.listStudents(client.minGpa, client.hobbyWanted);
    
      // design 3. produce summary
      printSummary(studentList);
      
      // design 4. write the list of the students to file
      saveStudentList(studentList, client.outFilePath);
    } catch(FileNotFoundException e) {
      System.out.println(e.getMessage());
    } catch (MalformedInputFileException e) {
      System.out.println(e.getMessage());
    }
  }
  
  private static ListCandidates parseCommandLineArgs(String[] args) {
    if (args.length != 4) {
      help();
      return null;
    }
    String inFilePath = args[0];
    if (!RecordChecker.isValidNumericGpaField(args[1])) {
      help();
      return null;
    }
    double minGpa = Double.parseDouble(args[1]);
    String hobby = args[2];
    String outFilePath = args[3];
    
    return new ListCandidates(inFilePath, minGpa, hobby, outFilePath);
  }
  
  private static void help() {
    System.out.println("Usage: ListCandidates input_file min_gpa hobby output_file");
  }
  
  private static void printSummary(ArrayList<Student> studentList) {
    for (int i=0; i<studentList.size(); i++) {
      System.out.println(studentList.get(i).toString());
    }
    /*
    for (Student student: studentList) {
      System.out.println(student.toString());
    }*/
    
    // studentList.forEach(student -> System.out.println(student.toString());
  }
  
  private static void saveStudentList(ArrayList<Student> studentList, String outFilePath)
    throws FileNotFoundException {
    try (PrintWriter out = new PrintWriter(new File(outFilePath))) {
      for (Student student: studentList) {
        out.println(student.toCsvString());
      }
    }
  }
}
