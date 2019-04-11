public class Student{
  int grade;//we wont define because every student will have a different grade,
            //this is just a general property
  String name;
  //Construction-instatation method
    public Student(String n){
      name = n;
    }//Constructor (you can also have multiple for a given object)
    public Student(int g){
      grade = g;
    }
    public String getName(){
      return name;
    }
    public int getGrade(){
      return grade;
    }
}
