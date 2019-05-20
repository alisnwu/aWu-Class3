/*
    int[] intarr = new int[10];
    String[] arr = new String[10];


/*
  Generics:

  Using the format
  public class ClassName<VARIABLE_TYPE>{

  }

  Restriction: It must be an OBJECT type, no primitives!
  You may now use that VARIABLE_TYPE as a type throughout your code.


  public class ThingThatHolds<T>{
  public T value;
  }

*/
public class Holder<T>{
  public T value;

  public static void main(String[]args){
    Holder<String> name = new Holder<String>();
    name.value = "Whoa!";

    Holder<Integer> data = new Holder<Integer>();
    data.value = 5;

    System.out.println(name.value+" "+data.value);
  }
}
