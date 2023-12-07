public class StudentsClient {
  public static void main(String[] args) {
    game.Student student = new game.Student("John Doe");
    bc.Student bcStudent = new bc.Student();
    gov.Student govStudent = new gov.Student();
    edu.cuny.brooklyn.cis.cisc3115.Student cisc3115Student = 
      new edu.cuny.brooklyn.cis.cisc3115.Student();
    edu.cuny.brooklyn.cis.cisc3115.Student cisc3115StudentAnother = 
      new edu.cuny.brooklyn.cis.cisc3115.Student();
    Student defaultStudent = new Student();
    defaultStudent.say();
    cisc3115Student.say();
  }
}
