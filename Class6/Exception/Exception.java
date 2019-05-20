//try and catch
class Exception{
  public static void main(String[] args){
    try{
      int[] arr = new int[1];
      arr[3] = 2;
      System.out.println(4/0); //arithmetic exception
    }
    catch(ArithmeticException e){
      System.out.println("divide by 0 error!");
    }
    catch(ArrayIndexOutOfBoundsException e){
      System.out.println(e.getMessage());
    }
  }
}
