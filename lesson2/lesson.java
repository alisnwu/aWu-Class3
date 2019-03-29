public class lesson {
  public static void main (String[] args){
    //public = scope, void = no return value, main = name of function, (String[] args) = args is just a name of the string aray
    printSum(10,15);
    System.out.println(printSum2(10, 15)); //it wouldn't print if you don't add the Sysout
    System.out.println(args[0]); //if you run this program in the terminal as "java lesson smth" then it will print smth
    System.out.println(args[1]); //if you run this in the terminal as "java lesson smth1 smth2" then it will print both smths
    //Arrays
    int[] arr = new int [] {1,2,3,4,5,6,7,8}; //(integer array) + (name) = (initializes) + (array) ({assign array})
    for (int i = 0; i < arr.length; i++){
      System.out.println(arr[i]);
    }
    //Array with strings
    String[] months = new String[] {"Jan", "Feb", "Mar", "Apr"};
    //double Array
    int[][] grid = new int [][] {
      {1,2,3,4},
      {5,6,7,8},
      {9,10,11,12}
    };
  }
  public static void printSum (int a, int b){
    int total = 0;
    for (int i = a; i <= b; i++){
      total += i;
    }
    System.out.println(total);
  }
  //terminates the execution of a function and returns control to the calling function
  public static int printSum2 (int a, int b){
    int total = 0;
    for (int i = a; i <= b; i++){
      total += i;
    }
    return total;
  }
}
