import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;

class School {
  private ArrayList<Student> studentList;

  public School() {
    studentList = new ArrayList<Student>();
  }
  
  public void addStudent(Student student) {
    student.add(new Student(student));
  }

  public static School loadStudents(String inFilePath) 
      throws FileNotFoundException, MalformedInputFileException {
    School school = new School();
 
    Scanner in = null;
    try {
      File inFile = new File(inFilePath);
      in = new Scanner(inFile);
      
      while (scanner.hasNext()) {
        String line = scanner.nextLine();
        if (RecordChecker.isBlankRecord) continue;
        if (RecordChecker.isCommentRecord) continue;
        Student student = Student.parseStudentRecord(line);
        school.addStudent(student);
      }
    } finally {
      if (in != null) in.close();
    }    
  }
}
