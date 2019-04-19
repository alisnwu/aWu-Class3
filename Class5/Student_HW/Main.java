public class Main{
  public static void main(String[] args){
    Student s1 = new Student("Alison", "1234 Yeeyee Ave");
    System.out.println(s1);
    s1.setAddress("4321 Yeeyee Ave");
    System.out.println(s1);
    System.out.println(s1.getName());
    System.out.println(s1.getAddress());
    s1.addCourseGrade("Math", 97);
    s1.addCourseGrade("Science", 80);
    s1.printGrades();
    System.out.print("Average: ");
    System.out.println(s1.getAverageGrade());
  }
}
