//main data types:
  //boolean, the type whose values are either true or false
  //char, the character type whose values are 16-bit Unicode characters
  //the arithmetic types:
    //the integral types:byte, short, int, long
    //the floating-point types:float, double
//equal sign only means assignment (ex: int a = 5)
  //double equal (==) means if true or not (only for int, not String)
//mathematical signs: %(mod), ++(+=1), &&(and), ||(or)
public class lesson {
  public static void main (String[] args){
    int a = 5;
    a = 2; //but you can't initialize a with "int a = 2" or "double a = 2.4"
    double b = 2.4;
    boolean c = false; // the input should always match the data type
    String x = new String("Hello"); //the "S" in String is always capital
    System.out.println(a);
    System.out.println("Hi");
    System.out.println(x);
    // java looping
    // for loop
    for (int i=0; i<10; i++){
      //i++ -> i=i+1
      System.out.println("print");
    }
    // while loop (this will run infintely because there's no increment)
    //int j=0;
    //while (j<10){
      //System.out.println("print");
    //}
    //classwork
    for (int k=10; k<=20; k+=2){
      System.out.println(k);
    }
    int l=10;
    while (l<=20){
      System.out.println(l);
      l+=2;
    }
    //conditionals
      //if, else if(an additional if statement containing another condition), else
        //can have if by itself but not the other 2
    //classwork 2
    for (int y=1; y<=100;){
      if ((y-1)%3==0){
        System.out.println(y);
      }
      y++;
    }
    String light = new String("green");
    if (light.equals("green")){
      System.out.println("light is green!");
    }
  }
}
