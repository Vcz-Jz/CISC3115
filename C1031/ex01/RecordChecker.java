class RecordChecker {
  public final int MIN_FIELDS_PER_RECORD = 3;
  
  public static boolean isBlankRecord(String line) {
    for (int i=0; i<line.length(); i++) {
      if (!Character.isWhitespace(line.charAt(i))) return false;
    }
    return true;
  }
  
  public static boolean isCommentRecord(String line) {
    line = line.trim();
    if (line.length() == 0) return false;
    if (line.charAt(0) == '#') return true;
    return false;  
  }
  
  public static boolean isValidGenderField(String genderCode) {
    if (genderCode.length() != 1) return false;
    if (genderCode.charAt(0) == 'M' ||
        genderCode.charAt(0) == 'F' ||
        genderCode.charAt(0) == 'L') return true;
    return false;
  }
  
  public static boolean isValidGpaField(String gpa) {
    if ("N/A".equals(gpa)) return true;
    if ("".equals(gpa)) return false;
    return isValidNumericGpaField(gpa);
  }
  
  public static boolean isValidNumericGpaField(String gpaField) {
    double gpa = -1.;
    try {
      gpa = Double.parseDouble(gpaField);
      if (gpa < 0 || gpa > 4.0) return false;
    } catch(NumberFormatException e) {
      return false;
    }
    return true;
  }
}
