import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

class School {
  private ArrayList<Student> studentList;

  public School() {
    studentList = new ArrayList<Student>();
  }
  
  public void addStudent(Student student) {
    studentList.add(new Student(student));
  }

  public static School loadStudents(String inFilePath) 
      throws FileNotFoundException, MalformedInputFileException {
    School school = new School();
 
    Scanner in = null;
    try {
      File inFile = new File(inFilePath);
      in = new Scanner(inFile);
      
      int lineNum = 0;
      while (in.hasNext()) {
        String line = in.nextLine();
        lineNum ++;
        if (RecordChecker.isBlankRecord(line)) continue;
        if (RecordChecker.isCommentRecord(line)) continue;
        Student student = Student.parseStudentRecord(lineNum, line);
        school.addStudent(student);
      }
    } finally {
      if (in != null) in.close();
    }
    return school; 
  }
  
  
  public ArrayList<Student> listStudents(double minGpa, String hobbyWanted) {
    ArrayList<Student> candidateList = new ArrayList<Student>();
    for (Student student: studentList) {
      if (student.hasHobby(hobbyWanted) && student.getGpa() >= minGpa) {
          candidateList.add(new Student(student));
      }
    }
    return candidateList;
  }
}
