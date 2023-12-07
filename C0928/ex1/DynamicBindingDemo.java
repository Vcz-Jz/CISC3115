class DynamicBindingDemo {
  public static void main(String[] args) {
    double d = 1.23;
    int n = (int)d;
    Student s = new Student();
    m((Object)s); // declared type: Object (C1); actual type: Student (C2)
    m((Object)(new GraduateStudent()));
    m(new Person());
    m(new Object());
    
    Person adam = new Person();
    Student amy = new Student();
    
    /*
    Student john = (Student)adam;
    if (john instanceof Student) {
      john.haveTakenClass("CISC3115");
    }
    */
    ((Student)amy).haveTakenClass("CISC3115");
    //((Person)amy).haveTakenClass("CISC3115");
  }
  
  private static void m(Object x) {
    if (x instanceof Student) {
      ((Student)x).haveTakenClass("CISC3115");
    }
    System.out.println(x.toString());
  }
}
