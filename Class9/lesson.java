//factorial
  //interactive
  public int factorial1(n){
    int total = 1;
    while (n > 1){
      total = total * n;
      n --;
    }
    return total;
  }
  //recursive
  public static int factorial2(int n){
    if (n == 0){
      return 1;
    }
    return n * factorial2(n - 1);
  }
//fibonacci
  //interactive
  public static void fibonacci1(int n){
    if(n==1){
      System.out.println(0);
    }
    else if (n==2){
      System.out.println(1);
    }
    else{
      int first = 0;
      int second = 1;
      int third = 0;
      for(int i=2; i<n; i++){
        third = first + second;
        first = second;
        second = third;
      }
      System.out.println(third);
    }
  }
  //recursive
  public static int fibonnaci2(int n){
    if(n == 1){
      return 0;
    }
    if(n == 2){
      return 1;
    }
    else{
      return fibonnaci2(n-1) + fibonnaci2(n-2);
    }
  }
//palidrome checking
  //interactive
  public static boolean checkPal(String str){
    if(str.length() == 0){
      return true;
    }
    for(int i = 0; i < str.length()/2; i ++){
      if(str.charAt(i) != str.charAt(str.length() - i - 1)){
        return false;
      }
    }
    return true;
  }
  //Recursive
  public static boolean rCheckPal(String str){
    if(str.length() <= 1){
      return true;
    }
    if(str.charAt(0) == str.charAt(str.length() - 1)){
      rCheckPal(str.substring(1, str.length() - 1));
    }
    return false;
  }
// javac lesson.java
// java lesson 1 2 3 4 5 6 7
// -> [1,2,3,4,5,6,7]
/*
      Object
        \
Throwable (Can be used with the throw command)
    /                     \
Error              Exception (checked)
(unchecked)             \
                  RuntimeException (unchecked)
*/
  // runtime errors
  // index out of bounds errors , out of memory errors
  // compile time errors:
  // syntax errors

  //FileIO exceptions like FileNotFoundException are not meant
  //to happen at runtime, so they are REQUIRED to be caught or
  //declared as thrown(re-throw the exception). This is by design as
  //they are intended to be handled by the programmer.
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class lesson{
  public static void main(String[]args){
    String fileName = "file.txt";
    try{
      File f = new File(fileName);//can combine
      Scanner in = new Scanner(f);//into one line
      /*
      while(in.hasNext()){
        String line = in.nextLine();
        //do something with line
        System.out.println(line);
      }
      */
      // reading word by word
      while(in.hasNext()){
        String word = in.next();
        //do something with word
        System.out.println(word);
      }
    }
    catch(FileNotFoundException e){
      System.out.println("File not found: " + fileName);
      //e.printStackTrace();
      System.exit(1);
    }
  }
}
import java.util.Random;
public class DemoRandom{
  public static void main(String[]args){
    //here no seed is provided, so it uses the clock as a seed
    //this can be used to produce a random seed for a different Random object!
    Random rng = new Random();
    for(int i =  0; i < 5; i++ ){
      System.out.println(rng.nextInt() % 1000);
    }
    System.out.println();

    //specified seed can be used to reproduce sequences
    rng = new Random(100);//seed of 100 is stored.
    for(int i =  0; i < 5; i++ ){
      System.out.println(rng.nextInt() % 1000);
    }
  }
}
/*
features of the program:

1. generate an N by M puzzle
    (A puzzle includes a list of words, and a grid of letters with those words hidden.)
2. add a bunch of words randomly
3. show the puzzle , or the solution. (have a puzzle have a unique ID so you can recall it later)
4. Use a plain text file as a list of words to add to the puzzle.
           This means we can swap the theme of the puzzle with different files.
5. Be able to reproduce the same puzzle/solution at a later date. This is a VERY useful feature.


data structure: 2-D characters array
what functions should this class contain??
1. ranodm letter generator
2. addWordVertical, addWordHorizontal, addWordDiagonal

javac Wordsearch

 possible inputs
java WordSearch rows cols filename
java WordSearch rows cols filename randomSeed
java WordSearch rows cols filename randomSeed answers


java WordSearch 4 4 words.txt
OR
java WordSearch 4 4 words.txt 103
|X Y F B|
|I A I F|
|D E S A|
|M E H R|
Words: FAD, FISH, MEH (seed: 103)

java WordSearch 4 4 words.txt 103 key
|    F  |
|  A I  |
|D   S  |
|M E H  |
Words: FAD, FISH, MEH (seed: 103)


*/
