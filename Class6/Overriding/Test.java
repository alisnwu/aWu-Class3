class Test{
  public static void main(String[] args){
    Animal a1 = new Animal();
    a1.eat();
    Bird b1 = new Bird();
    b1.eat();
    Animal c1 = new Bird(); //this is saying it's in animal but a bird
    c1.eat();
  }
}
