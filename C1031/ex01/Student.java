import java.util.ArrayList;

class Student {
  public final double INVALID_GPA = - 1.0;
  private String name;
  private double gpa;
  private char gender;
  private ArrayList<String> hobbyList;
  
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
    String gender = fieldList[1];
    
    // gpa field
    if (!isValidGpaField(fieldList[2])) {
      throw new MalformedInputFileException("GPA Field", lineNum);
    }
    
    String gpa;
    if (isValidNumericGpaField(fieldList[2])) {
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
}


