public class BinarySearch {
  int binarySearch(int arr[], int x){
    int n = 0;
    int i = arr.length - 1;
    while (n <= i) {
      int m = n+(i - 1 - n)/2;
      if (arr[m] == x){
        return m;
      }
      if (arr[m]<x){
        n = m+1;
      }
      else{
        i = m-1;
      }
    }
    return -1;
  }
  public static void main(String args[]) {
    BinarySearch bs = new BinarySearch();
    int arr[] = {1,2,3,4,6,7,8,9,10};
    int n = arr.length;
    int x = 8;
    int p = bs.binarySearch(arr, x);
    System.out.println(p);
  }
}
