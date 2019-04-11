//if theres no value in an int array, java will automatically replace it with zero
//if theres no value in a boolean array, java will automatically replace it with false
//for loop is for when you know how many times you need to run
//while loop is for when you dont know how many times you need to run
//if you divide in java, it'll never give you a decimal and always floor it
//you can reuse variables in different functions
  //but you cant reuse variables in same function different loops
//if you want to save values, create another variable("index") outside of the loop and reference "index"
// for convention, the class should be uppercase, the main function should be lowercase
// a function should always be a verb and if theres multiple words, the first word is lower but the rest are uppercase
//variables should never be uppercase
public class lesson{
  //recursion
  public static int returnFactorial(int n){
    if(n == 1){
      return(1);
    }
    return n * returnFactorial(n-1);
  }
}
