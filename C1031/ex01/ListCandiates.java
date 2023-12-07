class ListCandidates {
  public static void main(String[] args) {
    try {
      // design 1: an object represents the school that has students
      // design 1.1: what error conditions are there?
      //             (a) cannot find the file -- java.io.FileNotFoundException
      //             (b) cannot read file     -- java.io.IOException
      //             (c) when you read the file, the file format is wrong
      //                                      -- MalformedInputFileException (our own)
      School school = School.loadStudents(inFilePath);
      
      // desigh 2. the School object should have a method to 
      //           look for students who have a given hooby and
      //           whose GPA is no less than a threshold
      // design 2.1 is there any errors here? 
      ArrayList<Student> studentList = school.listStudents(threshold, hobby);
    
      // design 3. produce summary
      printSummary(studentList);
      
      // design 4. write the list of the students to file
      saveStudentList(studentList, outFilePath);
    } catch(FileNotFoundException e) {
    } catch (IOException e) {
    } catch (MalformedInputFileException e) {
    }
  }
}
