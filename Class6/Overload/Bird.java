//overloading
  //same function name diff parameters = diff functions
class Bird{
  public void fly(){
    System.out.println("Bird is flying.");
  }
  public void fly(int height){
    System.out.println("Flying at " + height);
  }
  public void fly(String name, int height){
    System.out.println(name + " is flying at " + height);
  }
}
