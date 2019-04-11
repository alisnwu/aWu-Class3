//paramative types starts w/ lower case
//object type(pre written fuction) starts w/ upper case
//instances: examples of an object
  //String str = new String(); "str" is an instance of String
// class: name, static properties(variables), dynamic behaviors(functions)
public class Lesson{
  public static void main(String[] args){
    Student student1 = new Student("Mike");
    System.out.println(student1.getName());
    Student student2 = new Student(80);
    System.out.println(student2.getGrade());
    Circle c1 = new Circle(5, "Black");
    System.out.println(c1.getRadius());
    System.out.println(c1.getArea());
    System.out.println(c1.getPerimeter());
    System.out.println(c1.getColor());
    System.out.println(c1);
  }
}
class Circle{
  private int radius;
  String color;
  double area;
  double perimeter;
  public Circle(int r, String c){
    radius = r;
    color = c;
  }
  public int getRadius(){
    return radius;
  }
  public double getArea(){
    area = radius * radius * Math.PI;
    return area;
  }
  public double getPerimeter(){
    perimeter = radius * 2 * Math.PI;
    return perimeter;
  }
  public String getColor(){
    return color;
  }
  public void setRadius(int radius){
    this.radius = radius;
  }
  public String toString(){
    return "radius: " + radius + " color: " + color;
  }
}
