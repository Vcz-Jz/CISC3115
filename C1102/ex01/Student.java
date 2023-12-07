import java.util.ArrayList;

class Student {
  public final static double INVALID_GPA = - 1.0;
  private String name;
  private double gpa;
  private char gender;
  private ArrayList<String> hobbyList;
  
  public Student(Student student) {
    this(student.name, student.gender, student.gpa, student.hobbyList);
  }
  
  public Student(String name, char gender, double gpa, ArrayList<String> hobbyList) {
    this.name = name;
    this.gender = gender;
    this.gpa = gpa;
    this.hobbyList = hobbyList; // I don't this line.
  }
  
  public static Student parseStudentRecord(int lineNum, String line) {
    String[] fieldList = line.split(",");
    if (fieldList.length < RecordChecker.MIN_FIELDS_PER_RECORD) {
      throw new MalformedInputFileException("Insufficient fields found at line " + lineNum);
    }
    
    // name field
    String name = fieldList[0];
    
    // gender field
    // is the gender valid? 
    if (!RecordChecker.isValidGenderField(fieldList[1])) {
      throw new MalformedInputFileException("Gender Field", lineNum);
    }
    char gender = fieldList[1].charAt(0);
    
    // gpa field
    if (!RecordChecker.isValidGpaField(fieldList[2])) {
      throw new MalformedInputFileException("GPA Field", lineNum);
    }
    
    double gpa;
    if (RecordChecker.isValidNumericGpaField(fieldList[2])) {
      gpa = Double.parseDouble(fieldList[2]);
    } else {
      gpa = INVALID_GPA;
    }
    
    ArrayList<String> hobbyList = new ArrayList<String>();
    for (int i=3; i<fieldList.length; i++) {
      hobbyList.add(fieldList[i]);
    }
    
    Student student = new Student(name, gender, gpa, hobbyList);
    return student;
  }
  
  public boolean hasHobby(String hobbyWanted) {
    for (String hobby: hobbyList) {
      if (hobby.equalsIgnoreCase(hobbyWanted)) {
        return true;
      }
    }
    return false;
  }
  
  public String toCsvString() {
    StringBuilder sb = new StringBuilder();
    sb.append(name)
      .append(",")
      .append(String.format("%.3f", gpa));
    if (hobbyList == null || hobbyList.size() == 0) {
      return sb.toString();
    }
    for (String hobby: hobbyList) {
      sb.append(",");
      sb.append(hobby);
    }
    return sb.toString();
  }
  
  public String toString() {
    return toCsvString();
  }
  
  public double getGpa() {
    return gpa;
  }
}


